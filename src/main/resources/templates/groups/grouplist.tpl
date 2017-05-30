layout 'layout/main.tpl', title:  'All groups',
content: contents {
  table(class: 'striped') {
    thead {
      tr {
        th('id')
        th('number')
        th('course')
        th('captain')
        th('student list')
        th('delete group')
      }
    }
    tbody {
      groups.each { group ->
        tr {
          td(group.getId())
          td(group.getNumber())
          td(group.getCourse())
          td(group.getCaptain())
          td{a(href: '/groups'+'/'+group.getId()) {yield "view list of students"}}
          td{a(href: '/groups') {yield "delete this group"}}
        }
      }
    }
  }
  if (students.isEmpty()) {
    a(href: '/groups'+'/'+'withoutgroup', class: 'disabled') {yield "check students without group"}
  } else {
    a(href: '/groups'+'/'+'withoutgroup') {yield "check students without group"}
  }

}