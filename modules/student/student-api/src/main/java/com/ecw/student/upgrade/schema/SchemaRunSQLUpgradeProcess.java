package com.ecw.student.upgrade.schema;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

public class SchemaRunSQLUpgradeProcess extends UpgradeProcess {

	public SchemaRunSQLUpgradeProcess(String version, Class startupClass) {
		_currentVersion = version;

		_startupClass = startupClass;
	}

	@Override
	protected void doUpgrade() throws Exception {
		LOGGER.info("Started RunSQLUpgradeProcess");

		runSQLTemplateString(_getSQL(), false, false);

		LOGGER.info("Finished RunSQLUpgradeProcess");
	}

	private String _getBundleFilesPath() {
		return _SQL_RESOURCE + StringPool.SLASH + "v" + _currentVersion;
	}

	private String _getSQL() {
		final Bundle bundle = FrameworkUtil.getBundle(_startupClass);

		Enumeration<String> filePaths = bundle.getEntryPaths(_getBundleFilesPath());

		while ((filePaths != null) && filePaths.hasMoreElements()) {
			String filePath = filePaths.nextElement();
			InputStream inputStream = _startupClass.getResourceAsStream(StringPool.SLASH + filePath);

			if (inputStream != null) {
				try {
					return StringUtil.read(inputStream);
				}
				catch (IOException ioe) {
					LOGGER.error("Error loading SQL file " + ioe);
				}
			}
		}

		return StringPool.BLANK;
	}

	private static final String _SQL_RESOURCE = "/META-INF/resources/sql";

	private static final Log LOGGER = LogFactoryUtil.getLog(SchemaRunSQLUpgradeProcess.class.getName());

	private final String _currentVersion;
	private final Class _startupClass;

}