//Getting elenment from html to variable el_up
var el_up = document.getElementById("GFG_UP"); 

//Getting elenment from html to variable el_up
			var el_down = document.getElementById("GFG_DOWN"); 
			var str = "Click on button to change the background color"; 
		
			
			el_up.innerHTML = str; 
		
			//Function to change color
			function changeColor(color) { 
				document.body.style.background = color; 
			} 
			
			//Function to run changeColor and change color
			function gfg_Run() { 
				changeColor('yellow'); 
				el_down.innerHTML = "Background Color changed"; 
			}		
			
			