/**
 * 
 */
var contactDao = function(){
	var contactCnt = 0;
	var contacts = [];
	
	var init = function(){
		var c = [];
		try{
			if(typeof(Storage) != 'undefined'){
				contacts = JSON.parse(localStorage.getItem("contacts"));
				if(contacts == null){
					contacts=[];
				}
				
				console.log(c);
			}
		}
		catch(e){
			
		}
		
	}
	
	
	var saveToLocalStore = function(){
		if(typeof(Storage) != 'undefined'){
			var c = JSON.stringify(contacts);
			localStorage.setItem("contacts",c);
		}else{
			alert('Browser doesnot support local storage');
		}
	}
	
	var addContact = function(contact){
		contacts.push(contact)
		contactCnt++;
		console.log(contacts);
		saveToLocalStore();
	}

	var deleteContactById = function(i){
		console.log(contacts);
		contacts.splice(i,1);
		console.log(contacts);
		console.log("came here")
		saveToLocalStore();
		//how
	}

	var getId = function(){
		return contactCnt + 1;
	}
	
	var getAllContacts = function(){
		return contacts;
	}
	
	return{
		init: init,
		addContact : addContact,
		deleteContactById : deleteContactById,
		getId : getId,
		getAllContacts : getAllContacts
	}
} 





