layout 'layout/main.tpl',
true,
title:  'Extended Flats list',
content: contents {
  table(class: 'striped') {
    thead {
      tr {
        th('Id')
        th('Floor')
        th('Entrance')
        th('Adress')
        th('Living Square')
      }
    }
    tbody {
      flats_e.each { flat ->
        tr {
          td(flat.getId())
          td(flat.getFloor())
          td(flat.getEntrance())
          td(flat.getAdress())
          td(flat.getLivingsquare())
        }
      }
      td{a(href: '/flats') {yield "Go back"}}
    }
  }
}
