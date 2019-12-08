var inr, usd, eur, cad, aud;

//Function to get elenmnt from html to differnt variables
function init()
{
    inr = document.getElementById("INR");
    usd = document.getElementById("USD");
    eur = document.getElementById("EUR");
    cad = document.getElementById("CAD");
    aud = document.getElementById("AUD");
}

//Function to convert INR to different currencies
function inrfunc()
{
    usd.value = parseFloat(inr.value) * 0.014;
    eur.value = parseFloat(inr.value) * 0.013;
    cad.value = parseFloat(inr.value) * 0.019;
    aud.value = parseFloat(inr.value) * 0.020;
}

//Function to convert EUR to different currencies
function eurfunc()
{
    inr.value = parseFloat(eur.value) * 1.43448;
    usd.value = parseFloat(eur.value) * 0.70641;
    cad.value = parseFloat(eur.value) * 0.72037;
    aud.value = parseFloat(eur.value) * 0.62382;
}

//Function to convert CAD to different currencies
function cadfunc()
{
    inr.value = parseFloat(cad.value) * 1.99169;
    usd.value = parseFloat(cad.value) * 0.98054;
    eur.value = parseFloat(cad.value) * 1.38814;
    aud.value = parseFloat(cad.value) * 0.86613;
}

//Function to convert AUD to different currencies
function audfunc()
{
    inr.value = parseFloat(aud.value) * 2.29964;
    usd.value = parseFloat(aud.value) * 1.13262;
    eur.value = parseFloat(aud.value) * 1.60329;
    cad.value = parseFloat(aud.value) * 0.88297;    
}

//Function to convert USD to different currencies
function usdfunc()
{
    inr.value = parseFloat(usd.value) * 2.03032;
    eur.value = parseFloat(usd.value) * 1.41544;
    cad.value = parseFloat(usd.value) * 1.01941;
    aud.value = parseFloat(usd.value) * 0.88297;
}

//Calling Of init function
init();




