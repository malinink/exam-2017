layout 'layout/main.tpl',
true,
title:  'Layout e
content: contents {


table(class: 'striped') {
thead {
tr {
th('#')
th("View people")
th('Name')
th('Last name')
th('Sur name')

}
}
tbody {
students.each { student ->
tr {
td(student.getId())
td("/student/" + student.id)
td(student.getFirstName())
td(student.getLastName())
td(student.getSurName())

}
}
}
}
}