layout 'layout/main.tpl',
true,
title:  'Flats list',
content: contents {
  table(class: 'striped') {
    thead {
      tr {
        th('Id')
        th('Floor')
        th('Entrance')
        th('Adress')
      }
    }
    tbody {
      flats.each { flat ->
        tr {
          td(flat.getId())
          td(flat.getFloor())
          td(flat.getEntrance())
          td(flat.getAdress())
          td{a(href: '/flats'+'/'+flat.getId()) {yield "Show rooms"}}
        }
      }
	
    }
  }
}
