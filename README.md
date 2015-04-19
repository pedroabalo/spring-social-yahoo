============================= Spring Social Yahoo =============================

To check out the project and build from source, do the following:

git clone git://github.com/pedroabalo/spring-social-yahoo.git
 
 
 -------------------------------------------------------------------------------
 
 Java Configuration with Spring Social
 
 
		@Override		
		public void addConnectionFactories(ConnectionFactoryConfigurer cfConfig, Environment env) {
	
			logger.info("adding connection factories social nets...");
		
			YahooConnectionFactory yahooConnection =
				new YahooConnectionFactory(env.getProperty("yahoo.key"),env.getProperty("yahoo.secret"));
		
			cfConfig.addConnectionFactory(yahooConnection);		
		}
 
 ===============================================================================
 
 
