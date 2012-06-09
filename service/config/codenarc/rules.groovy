ruleset {
	description 'Rules Sample Groovy Gradle Project'

	ruleset('rulesets/basic.xml')
	//ruleset('rulesets/braces.xml')
	ruleset('rulesets/concurrency.xml')
	ruleset('rulesets/design.xml')
	//ruleset('rulesets/dry.xml')
	ruleset('rulesets/exceptions.xml') {
		'CatchException' priority: 3
	}
	//ruleset('rulesets/generic.xml')
	ruleset('rulesets/imports.xml')
	ruleset('rulesets/logging.xml')
	ruleset('rulesets/junit.xml') {
		exclude 'JUnitTestMethodWithoutAssert'
		exclude 'UseAssertTrueInsteadOfAssertEquals'
	}
	ruleset('rulesets/naming.xml') {
		exclude 'MethodName'
	}
	ruleset('rulesets/size.xml')
	ruleset('rulesets/unnecessary.xml') {
		'UnnecessaryObjectReferences' priority: 3
	}
	ruleset('rulesets/unused.xml')
}
