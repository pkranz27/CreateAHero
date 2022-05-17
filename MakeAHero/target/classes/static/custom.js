let value = document.querySelector('.mightValue');
let nextBtn = document.querySelector('.prevMightBtn');
let prevBtn = document.querySelector('.nextMightBtn');
let count =0;
let sp=10;
let spValue =document.querySelector('.spValue')
updateValue();


nextBtn.addEventListener("click", ()=>{
	if( sp<0){
		alert("Not enough SkillPoints Remain");
		return spValue.innerHTML=0;
		
	}
	else if(sp>10){
		
		return sp=10;
	}
	else{
		count++;
		sp--;
		console.log('click')
		updateValue();
	}
});
prevBtn.addEventListener("click", ()=>{
	if( count<0||count === 0){
		return count=0;	
	}
	count--;
	sp++;
	updateValue();
});
function updateValue(){
	value.innerHTML =count;
	spValue.innerHTML=sp;
	
};
///////////////////////////////////////////////////////////

let intValue = document.querySelector('.intValue');
let nextIntBtn = document.querySelector('.prevIntBtn');
let prevIntBtn = document.querySelector('.nextIntBtn');
let intCount =0;
updateIntValue();


nextIntBtn.addEventListener("click", ()=>{
	if( sp<0){
		alert("Not enough SkillPoints Remain");
		return spValue.innerHTML=0;
	}
	else if(sp>10){
		
		return sp=10 ;
	}
	else{
	intCount++;
	sp--;
	console.log('click')
	updateIntValue();
	}
	
});
prevIntBtn.addEventListener("click", ()=>{
	if( intCount<0|| intCount === 0){
		return intCount=0;	
	}
	intCount--;
	sp ++;
	updateIntValue();
});
function updateIntValue(){
		intValue.innerHTML =intCount;
		spValue.innerHTML=sp;
};

