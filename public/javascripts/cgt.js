$(function() {

    $('*[data-hidden]').each(function() {

        var $self = $(this);
        var $hidden = $('#hidden')
        var $input = $self.find('input');

        $input.each(function() {

            var $this = $(this);

            if ($this.val() === 'Yes' && $this.prop('checked')) {
                $hidden.show();
            }
            else if($this.val() === 'No' && $this.prop('checked')){
                $hidden.hide();
            }
        });

        $input.change(function() {

            var $this = $(this);

            if ($this.val() === 'Yes') {
                $hidden.show();
            } else if($this.val() === 'No') {
                $hidden.hide();
            }
        });
    });``
});

$(function() {
    $('.additional-option-block').hide();

    //prototype hack
    $('.additional-option-block').find('span').parent().show();

    $('input[type="radio"]').on('click', function(e){
        var o = $(this).parent().next('.additional-option-block');
        if(o.index() == 1){
            $('.additional-option-block').hide();
            o.show();
        }
    });
});
