//prepare contents param
var contents = value

//Vendors array (add if necessary)       
var vendors = {'0C 54 A5':'PEGATRON CORPORATION',
 	      '00 80 9F': 'ALE International',
  	      '30 CD A7':'Samsung Electronics',
  	      '00 24 73':'3COM EUROPE'}

// var to record count
var vendorsCount = [];
for (var key in vendors){
    vendorsCount[vendors[key]] = 0;
 }
//match the maintence vendors
var regexp = /([\w]{2}\s[\w]{2}\s[\w]{2}\s[\w]{2}\s){1}/gmi;
var result = contents.match(regexp);
//print all the matches found in the string
var label    = "Unknown";
var cc       = 0;
var lastKey  = "" ;

result.forEach(function printing(element, index) {   
   try{
      el = element.trim();
      if(vendors[el]){
        idx = vendors[el];
        vendorsCount[idx] ++
       }else if(lastKey !=  el){
          idx = label + cc;
          vendorsCount[idx] ++
           
        }
        lastKey =  el;
   }catch(e){}   
   })
// creating the return
var ret = "";
for (var key in vendorsCount){
    if(vendorsCount[key] > 0)
     ret += key + ':  ' + vendorsCount[key]+ " \n";
 }

return ret;