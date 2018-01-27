$(document).ready(function() {
      $('#autocomplete-input').devbridgeAutocomplete({
          serviceUrl: '/autocomplete/findall',
          paramName: 'author',
          minChars: 1,
          autoSelectFirst: true,
      });
});


