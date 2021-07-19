package com.ecw.student.upgrade.schema;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.portal.kernel.util.StringPool;

public class SchemaAddColumnUpgradeProcess extends UpgradeProcess {
	
	public SchemaAddColumnUpgradeProcess(Class entityClass, String tableName, String columnName, String columnType) {
		_entityClass = entityClass;
		_tableName = tableName;
		_columnName = columnName;
		_columnType = columnType;
	}

	@Override
	protected void doUpgrade() throws Exception {
		_addColumn();
	}

	private void _addColumn() throws Exception {
		if (!hasColumn(_tableName, _columnName)) {
			alter(_entityClass, new AlterTableAddColumn(_columnName + StringPool.SPACE + _columnType));
		}
		else {
			_logUtil.info("Column "+ _columnName+ " already exists on table "+ _tableName);
		}
	}

	private static final Log _logUtil = LogFactoryUtil.getLog(SchemaAddColumnUpgradeProcess.class.getName());

	private final String _columnName;
	private final String _columnType;
	private final Class _entityClass;
	private final String _tableName;

}
