layout 'layout/main.tpl',
true,
title:  'Rooms list',
content: contents {
  table(class: 'striped') {
    thead {
      tr {

        th('Square')
        th('Function')
        th('Isliving')
      }
    }
    tbody {
      rooms.each { room ->
        tr {
          td(room.Square())
          td(room.Function())
          td(room.Isliving())
          td{a(href: '/flats') {yield "Go back"}}
        }
      }
	
    }
  }
}
