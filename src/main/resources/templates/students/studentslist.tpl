layout 'layout/main.tpl', title:  'All students of the group',
content: contents {
table(class: 'striped') {
thead {
tr {
th('id')
th('first_name')
th('last_name')
th('surname')
th('student_card')
th('group_id')
}
}
tbody {
students.each { student ->
tr {
td(student.getId())
td(student.getFirst_name())
td(student.getLast_name())
td(student.getSurname())
td(student.getStudent_card())
td(student.getGroup_id())
td{a(href: '/groupinfo'+'/'+student.getId()) {yield "view list of group"}
}

}
}
}
}


a(href: '/groups') {yield "go back to the information group"}
}
