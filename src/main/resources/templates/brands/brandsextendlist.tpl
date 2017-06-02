layout 'layout/main.tpl', title:  'All brands',
content: contents {
  h4 ('All brands')
  table(class: 'striped') {
    thead {
      tr {
        th('name')
        th('foundation date')
        th('premium')
        th('car quantity')
      }
    }
    tbody {
      brands.eachWithIndex { brand, number ->
        tr {
          td(brand.getName())
          td(brand.getFoundationDate())
          td(brand.getPremium())
          td(brand.getCarQuantity())
          }
        }
      }
    }
  }