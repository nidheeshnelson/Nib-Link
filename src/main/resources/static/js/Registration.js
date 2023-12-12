const form = document.querySelector("form");
let nextBtn = form.querySelector(".nextBtn");
let next1Btn = form.querySelector(".next1Btn")
let backBtn = form.querySelector(".backBtn");
let back1Btn = form.querySelector(".back1Btn")
let allInput = form.querySelectorAll(".first input");
let all2Input = form.querySelectorAll(".second input");
nextBtn.addEventListener("click", ()=> {
    allInput.forEach(input =>{
        if(input.value !=""){
            form.classList.add('secActive')
        }else{
            form.classList.remove('secActive')
        }
    })
})
backBtn.addEventListener("click" , ()=> {
    allInput.forEach(input =>{ if(input.value !="") {form.classList.remove('secActive')}})})
next1Btn.addEventListener("click", ()=>{
    all2Input.forEach(input =>{
        if(input.value !=""){
            form.classList.add('sec4Active')
        }else{
            form.classList.remove('sec4Active')
        }
    })
})
back1Btn.addEventListener("click" , ()=> {
    all2Input.forEach(input =>{ if(input.value !="")
{form.classList.remove('sec4Active')
form.classList.add('secActive')
}})})