layout 'layout/main.tpl', title: 'edit group',
content: contents {
h4 ('edit group')
form (class:'col s12', method:'post') {
input (type:'hidden', name:_csrf.parameterName, value:_csrf.token)

div (class:'row') {
div (class:'input-field col s12') {
input (name:'first_name', id:'field_first_name', type:'text', class:'validate', value:student.first_name)
label (for:'field_first_name', 'First_name')
}
}
div (class:'row') {
div (class:'input-field col s12') {
input (name:'last_name', id:'field_last_name', type:'text', class:'validate', value: student.last_name)
label (for:'field_last_name', 'Last_name')
}
}



div (class:'row') {
div (class:'input-field col s12') {

select(name: 'studentId', id:'field_student', class:'browser-default'){
students.each { student ->
if(student.getId()==defaultStudentId) {
option (value:student.getId(), 'selected': 'selected') { yield student.getFirst_name() }
}
else
{
option (value:student.getId() ) { yield student.getFirst_name() }
}
}
}
}
label (for:'field_student', 'Student')
}


div (class:'row') {
div (class:'col s12') {
button ('class':'waves-effect waves-light btn-large blue', 'type':'submit', 'number':'save') {
i (class:'material-icons left', 'save')
yield 'Save'
}
a (class:'waves-effect waves-light btn-large red', onclick: 'document.location.href="/student/' + '/' + student.getId()+ '"' + "'") {
i (class:'material-icons left', 'cancel')
yield 'Cancel'
}
}
}
}
}