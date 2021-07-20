package com.ecw.student.internal.upgrade;

import org.osgi.service.component.annotations.Component;

import com.ecw.student.model.impl.StudentModelImpl;
import com.ecw.student.upgrade.schema.SchemaAddColumnUpgradeProcess;
import com.ecw.student.upgrade.schema.SchemaRunSQLUpgradeProcess;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

@Component(immediate = true, service = UpgradeStepRegistrator.class)
public class StudentUpgradeStepRegistrator implements UpgradeStepRegistrator{

	@Override
	public void register(Registry registry) {
		registry.register(_BUNDLE_NAME, _SCHEMA_VERSION_1_0_0, _SCHEMA_VERSION_1_1_0,
			new SchemaAddColumnUpgradeProcess(
					StudentModelImpl.class, StudentModelImpl.TABLE_NAME, "PhoneNo", "LONG")
		);
		
		registry.register(_BUNDLE_NAME, _SCHEMA_VERSION_1_1_0, _SCHEMA_VERSION_1_1_1,
				new SchemaRunSQLUpgradeProcess(_SCHEMA_VERSION_1_1_1, getClass())
			);
		
	}
	
	private static final String _BUNDLE_NAME = "com.ecw.student.service";

	private static final String _SCHEMA_VERSION_1_0_0 = "1.0.0";

	private static final String _SCHEMA_VERSION_1_1_0 = "1.1.0"; 
	
	private static final String _SCHEMA_VERSION_1_1_1 = "1.1.1"; 


}
