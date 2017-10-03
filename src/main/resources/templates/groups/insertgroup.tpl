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
input (name:'student_card', id:'field_student_card', type:'text', class:'validate', value:student.student_card)
label (for:'field_student_card', 'Student_card')
}
}

div (class:'row') {
div (class:'input-field col s12') {
input (name:'group_id', id:'field_group_id', type:'text', class:'validate', value:student.group_id)
label (for:'field_group_id', 'Group_id')
}
}


div (class:'row') {
div (class:'input-field col s12') {

select(name: 'groupId', id:'field_group', class:'browser-default'){
students.each { student ->
if(student.getGroupId()==group.getId()) {
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