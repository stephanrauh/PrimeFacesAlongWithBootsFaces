# Using PrimeFaces Along With BootsFaces
How to combine both PrimeFaces and BootsFaces - or, more generally speaking, PrimeFaces and Bootstrap 3.

Recently, many people complained about the incompatibility of BootsFaces and PrimeFaces. As it turns out, the incompatibility only exists on the CSS level. That's nasty enough, but that's clearly something we can do something about. This project shows how to use PrimeFaces and BootsFaces in the same project.

## The idea
Basically, most of the incompatibility is caused by BootsFaces aggressively resetting the browser default. PrimeFaces doesn't do this. So the challenge is to find out the browser default and restore it for PrimeFaces. This challenge get a bit tedious because every browser has its own defaults, which often differ from the default settings of other browsers.

## The solution
Add the file "resetBSToPS.css" to your project, and add the CSS class "pf" to every PrimeFaces widget. Note that many of the CSS rules defined in the "pf" class are applied recursively to every child nested in the component you've decorated with "pf".

## State of the art
Even if the current solution is far from being perfect, it allows you do combine many widgets of PrimeFaces and of BootsFaces within the same application. If you run into problems, please report back. If possible, give us a hint what the root of the problem is, and it would be very kind of you to provide a pull request solving the issue. However, even if you don't want to go as far as submitting a pull request, we'd like to hear from you. Every bit helps!

## Copyright notice
Some parts of this application have been copied from the PrimeFaces showcase.