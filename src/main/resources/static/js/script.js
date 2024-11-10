document.addEventListener('DOMContentLoaded', function() {
    const clubCards = document.querySelectorAll('.club-card');

    clubCards.forEach(card => {
        card.addEventListener('click', function() {
            this.classList.toggle('expanded');
        });

        card.addEventListener('mouseover', function() {
            this.style.backgroundColor = '#f0f0f0';
        });

        card.addEventListener('mouseout', function() {
            this.style.backgroundColor = '#fff';
        });
    });
});
