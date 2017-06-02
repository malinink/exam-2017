layout 'layout/main.tpl', title:  'All brands',
content: contents {
  h4 ('All brands')
  table(class: 'striped') {
    thead {
      tr {
        th('id')
        th('name')
        th('foundation date')
        th('premium')
        th('add car')
      }
    }
    tbody {
      brands.eachWithIndex { brand, number ->
        tr {
          td(brand.getId())
          td(brand.getName())
          td(brand.getFoundationDate())
          td(brand.getPremium())
          td() {
            a (class:'waves-effect waves-light btn-floating blue') {
              i (class:'material-icons left', 'pageview', onclick:'document.location.href="/brands/'+brand.getId() + '/addcar"')
              yield 'Add car'
            }
          }
        }
      }
    }
  }
}