layout 'layout/main.tpl', title:  'group of a student',
content: contents {
table(class: 'striped') {
thead {
tr {
th('id')
th('number')
th('course')
th('captain')
th('facult')
th('Insert group')
}
}
tbody {
group.each { group->
tr {
td(group.getId())
td(group.getNumber())
td(group.getCourse())
td(group.getCaptain())
td(group.getFacult())
td{a(href: '/student' + '/' + group.getId()+ '/editgroup') {yield "Insert group"}
}

}
}
}
}
a(href: '/students') {yield "go back to the information students"}
}
