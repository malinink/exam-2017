layout 'layout/main.tpl', title:  'All groups',
content: contents {
table(class: 'striped') {
thead {
tr {
th('id')
th('number')
th('course')
th('captain')
th('facult')
}
}
tbody {
groups.each { group ->
tr {
td(group.getId())
td(group.getNumber())
td(group.getCourse())
td(group.getCaptain())
td(group.getFacult())
td{a(href: '/group'+'/'+ group.getId()) {yield "view list of students"}}
td{a(href: '/group'  + '/'+ group.getId() + '/editgroup') {yield "insert this group"}}
}
}
}
}
a(href: '/students') {yield "go back to the students list"}
}