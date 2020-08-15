@Smoketest
Feature: API test with Karate DSL


Background:
   # * configure ssl = { keyStore: 'classpath:server-keystore.p12', keyStorePassword: 'karate-mock', keyStoreType: 'pkcs12', trustStore: 'classpath:server-keystore.p12', trustStorePassword: 'karate-mock', trustStoreType: 'pkcs12' }
   #* configure ssl = true
   #* url 'http://localhost:50744/api/account/portfolio'
   * url 'http://twsawsagd2iis32:30001/api/account/portfolio'
   #* header Authorization = Basic QWNjb3VudEFQSVVzZXI6YWdAMTIzQVBJ
   # + karate.properties['jersey.ssl.port']
 
#--------------------------------------------------------------------------------
#Scenario 1
 @Totest 
Scenario: Validating the status code and account types based on Client ID and Custodian
	Then param Content-Type = 'application/json'
	And request {"ClientId": "6124151" , "Custodian": "nxi"}
	When method POST
	Then status 200
	
	
 #Validating Financial Accounts
	* def financialAccounts =  get[0] response $..financialAccounts
	* print financialAccounts
	* match financialAccounts == '#notnull'
	
#Validating Asset Summary
	* def assetSummary =  get[0] response $..assetSummary
	* print assetSummary
	* match assetSummary == '#notnull'
	
#Validating topHoldings
	* def topHoldings =  get[0] response $..topHoldings
	* print topHoldings
	* match topHoldings == '#notnull'
	
#Validating recentActivity
	* def recentActivity =  get[0] response $..recentActivity
	* print recentActivity
	* match recentActivity == '#notnull'

#--------------------------------------------------------------------------------
#Scenario 2
@Testto
Scenario: Validating the status code and account types based on Client ID and Custodian(Negative-invalid account number)
	Then param Content-Type = 'application/json'
	And request {"ClientId": "7894561" , "Custodian": "nxi"}
	When method POST
	Then status 500
	And match $ == {type: "about:blank","status": 500}
	
#--------------------------------------------------------------------------------
#Scenario 3	
#Bad Request
#Scenario: Validating the status code and account types based on Client ID and Custodian(Negative-wrong format values)
#	Then param Content-Type = 'application/json'
#	And request {"ClientId": "000" , "Custodian": "nxi"}
#	When method POST
#	Then status 400
#	And match $ == {type: "about:blank","status": 500}

#--------------------------------------------------------------------------------
#Scenario 4

#Scenario: Validating the status code and account types based on Client ID and Custodian(Negative-null)
#	Then param Content-Type = 'application/json'
#	And request {"ClientId": "" , "Custodian": "nxi"}
#	When method POST
#	Then status 400
#	And match $ == {type: "about:blank","status": 500}

#--------------------------------------------------------------------------------
#Scenario 5

Scenario: Validating the attributes and Accounts inside Financial accounts,assetSummary,topHoldings,recentActivity
      Then param Content-Type = 'application/json'
      And request {"ClientId": "6124151" , "Custodian": "nxi"}
      When method POST
      Then status 200   
      
     #Financial Account 0
     #* match $.data.financialAccounts[0] contains {accountNumber:'#notnull'}
     #* match $.data.financialAccounts[0] contains {accountNumber:'A2T001762'}
     #* match $.data.FinancialAccounts[0] contains {accountId:'#notnull'}
     #* match $.data.financialAccounts[0] contains {accountClearingFirm:'Pershing'}
     #* match $.data.financialAccounts[0].assets[0] contains {assetType: '#notnull'}
     #* match $.data.financialAccounts[0].assets[0] contains {assetValue: '#notnull'}     
     #* match $.data.financialAccounts[0].holdings[0] contains {cusip: '#notnull'}
     #* match $.data.financialAccounts[0].holdings[0] contains {marketValue: '#notnull'}
     
     #Financial Account 1
     #* match $.data.financialAccounts[1] contains {accountNumber:'#notnull'}
      #* match $.data.financialAccounts[1] contains {accountNumber:'035020346'}
     #* match $.data.financialAccounts[1] contains {accountId:'#notnull'}
     #* match $.data.financialAccounts[1] contains {accountClearingFirm:'Pershing'}
     #* match $.data.financialAccounts[1].assets[0] contains {assetType: '#notnull'}
     #* match $.data.financialAccounts[1].assets[0] contains {assetValue: '#notnull'}     
     #* match $.data.financialAccounts[1].holdings[0] contains {cusip: '#notnull'}
     #* match $.data.financialAccounts[1].holdings[0] contains {marketValue: '#notnull'}
     
     #Financial Account 2
     #* match $.data.financialAccounts[2] contains {accountNumber:'#notnull'}
     #* match $.data.financialAccounts[2] contains {accountNumber:'A2T001770'}
     #* match $.data.financialAccounts[2] contains {accountId:'#notnull'}
     #* match $.data.financialAccounts[2] contains {accountClearingFirm:'Pershing'}
     #* match $.data.financialAccounts[2].assets[0] contains {assetType: '#notnull'}
     #* match $.data.financialAccounts[2].assets[0] contains {assetValue: '#notnull'}     
     #* match $.data.financialAccounts[2].holdings[0] contains {cusip: '#notnull'}
     #* match $.data.financialAccounts[2].holdings[0] contains {marketValue: '#notnull'}
     
    
 #--------------------------------------------------------------------------------
    
     #Asset Summary Validations
     #* match $.data.assetSummary[0] contains {assetType:'#notnull'}
     #* match $.data.assetSummary[0] contains {assetValue:'#notnull'}
    
 #--------------------------------------------------------------------------------
    #
     #Top Holdings Validations
     #* match $.data.topHoldings[0] contains {symbol:'#notnull'}
     #* match $.data.topHoldings[0] contains {price:'#notnull'}
     #* match $.data.topHoldings[0] contains {marketValue:'#notnull'}
     
 #--------------------------------------------------------------------------------
     #
     #Recent Activity Validations
     #* match $.data.recentActivity[0] contains {activityDate:'#notnull'}
     #* match $.data.recentActivity[0] contains {accountType:'#notnull'}
     #* match $.data.recentActivity[0] contains {symbol:'#notnull'}
     
 #--------------------------------------------------------------------------------
#Scenario 6   
Scenario: Validating the Portfolio value and the Error code
			Then param Content-Type = 'application/json'
      And request {"ClientId": "6124151" , "Custodian": "nxi"}
      When method POST
      Then status 200 

#Validating the Portfolio Value
  * def pf =  get[0] response $..portfolioValue
	* print pf
	* match pf == '#notnull'
	
 #--------------------------------------------------------------------------------
	
#Validating the Error Value
  #* def error =  get[0] response $.errors
	#* print error
	#* match error == null


#--------------------------------------------------------------------------------

#--------------------------------------------------------------------------------
#Scenario 7
#client id 2
Scenario: Validating the status code and account types based on Client ID and Custodian
	Then param Content-Type = 'application/json'
	And request {"ClientId": "6124151" , "Custodian": "nxi"}
	When method POST
	Then status 200
	
 #Validating Financial Accounts
	* def financialAccounts =  get[0] response $..financialAccounts
	* print financialAccounts
	* match financialAccounts == '#notnull'
	
#Validating Asset Summary
	* def assetSummary =  get[0] response $..assetSummary
	* print assetSummary
	* match assetSummary == '#notnull'
	
#Validating topHoldings
	* def topHoldings =  get[0] response $..topHoldings
	* print topHoldings
	* match topHoldings == '#notnull'
	
#Validating recentActivity
	* def recentActivity =  get[0] response $..recentActivity
	* print recentActivity
	* match recentActivity == '#notnull'



#--------------------------------------------------------------------------------
#Scenario 8
#Validating the Accounts inside Financial accounts,assetSummary,topHoldings,recentActivity(Client ID 2)

#Scenario: Validating the attributes and Accounts inside Financial accounts,assetSummary,topHoldings,recentActivity
      #Then param Content-Type = 'application/json'
      #And request {"ClientId": "6124151" , "Custodian": "nxi"}
      #When method POST
      #Then status 200  
       #
      #Financial Account 0
     #* match $.data.financialAccounts[0] contains {accountNumber:'#notnull'}
     #* match $.data.financialAccounts[0] contains {accountNumber:'D4W010861'}
     #* match $.data.financialAccounts[0] contains {accountId:'#notnull'}
     #* match $.data.financialAccounts[0] contains {accountClearingFirm:'Pershing'}
     #* match $.data.financialAccounts[0].assets[0] contains {assetType: '#notnull'}
     #* match $.data.financialAccounts[0].assets[0] contains {assetValue: '#notnull'}     
     #* match $.data.financialAccounts[0].holdings[0] contains {cusip: '#notnull'}
     #* match $.data.financialAccounts[0].holdings[0] contains {marketValue: '#notnull'}
     #
     #Financial Account 1
     #* match $.data.financialAccounts[1] contains {accountNumber:'#notnull'}
     #* match $.data.financialAccounts[1] contains {accountNumber:'AUW015998'}
     #* match $.data.financialAccounts[1] contains {accountId:'#notnull'}
     #* match $.data.financialAccounts[1] contains {accountClearingFirm:'Pershing'}
     #* match $.data.financialAccounts[1].assets[0] contains {assetType: '#notnull'}
     #* match $.data.financialAccounts[1].assets[0] contains {assetValue: '#notnull'}     
     #* match $.data.financialAccounts[1].holdings[0] contains {cusip: '#notnull'}
     #* match $.data.financialAccounts[1].holdings[0] contains {marketValue: '#notnull'}
     #
     #Financial Account 2
     #* match $.data.financialAccounts[2] contains {accountNumber:'#notnull'}
     #* match $.data.financialAccounts[2] contains {accountNumber:'AUW016004'}
     #* match $.data.financialAccounts[2] contains {accountId:'#notnull'}
     #* match $.data.financialAccounts[2] contains {accountClearingFirm:'Pershing'}
     #* match $.data.financialAccounts[2].assets[0] contains {assetType: '#notnull'}
     #* match $.data.financialAccounts[2].assets[0] contains {assetValue: '#notnull'}     
     #* match $.data.financialAccounts[2].holdings[0] contains {cusip: '#notnull'}
     #* match $.data.financialAccounts[2].holdings[0] contains {marketValue: '#notnull'}
     #
     #Financial Account 3
     #AUW013589
     #* match $.data.financialAccounts[3] contains {accountNumber:'#notnull'}
     #* match $.data.financialAccounts[2] contains {accountNumber:'AUW013589'}
     #* match $.data.financialAccounts[3] contains {accountId:'#notnull'}
     #* match $.data.financialAccounts[3] contains {accountClearingFirm:'Pershing'}
     #* match $.data.financialAccounts[3].assets[0] contains {assetType: '#notnull'}
     #* match $.data.financialAccounts[3].assets[0] contains {assetValue: '#notnull'}     
     #* match $.data.financialAccounts[3].holdings[0] contains {cusip: '#notnull'}
     #* match $.data.financialAccounts[3].holdings[0] contains {marketValue: '#notnull'}
 #
  #--------------------------------------------------------------------------------
     #
     #Asset Summary Validations
     #* match $.data.assetSummary[0] contains {assetType:'#notnull'}
     #* match $.data.assetSummary[0] contains {assetValue:'#notnull'}
     #
  #--------------------------------------------------------------------------------
     #
     #Top Holdings Validations
     #* match $.data.topHoldings[0] contains {symbol:'#notnull'}
     #* match $.data.topHoldings[0] contains {price:'#notnull'}
     #* match $.data.topHoldings[0] contains {marketValue:'#notnull'}
     #
  #--------------------------------------------------------------------------------
         #
     #Recent Activity Validations
     #* match $.data.recentActivity[0] contains {activityDate:'#notnull'}
     #* match $.data.recentActivity[0] contains {accountType:'#notnull'}
     #* match $.data.recentActivity[0] contains {symbol:'#notnull'}
     
   #--------------------------------------------------------------------------------
#Scenario 9     
Scenario: Validating the Portfolio value and the Error code
			Then param Content-Type = 'application/json'
      And request {"ClientId": "6124151" , "Custodian": "nxi"}
      When method POST
      Then status 200 

	#Validating the Portfolio Value
  * def pf =  get[0] response $..portfolioValue
	* print pf
	* match pf == '#notnull'
	
 #--------------------------------------------------------------------------------
	

	#Validating the Error Value
  * def error =  get[0] response $.errors
	* print error
	* match error == null

#--------------------------------------------------------------------------------







