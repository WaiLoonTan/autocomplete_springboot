$(document).ready(function() {
      $('#autocomplete-input').devbridgeAutocomplete({
          serviceUrl: '/autocomplete/books',
          paramName: 'author',
          minChars: 1,
          autoSelectFirst: true,
      });
});


