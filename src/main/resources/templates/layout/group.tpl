layout 'main.tpl', title:  'Groups',
content: contents {
  table(class: 'striped') {
    thead {
      tr {
        th('#')
        th('Course')
      }
    }
    tbody {
      groups.each { group ->
        tr {
          td(group.getId())
          td(group.getCourse())
        }
      }
    }
  }
}
