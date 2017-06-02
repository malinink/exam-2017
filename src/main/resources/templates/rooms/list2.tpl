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
          td(room.getSquare())
          td(room.getFunction())
          td(room.getIsliving())
          td{a(href: '/flats') {yield "Go back"}}
        }
      }
	
    }
  }
}
