public class Picture extends ItemForSale{
    private String style;
    private Artist artist;

    public Picture(String pictureName, int picturePaintingYear, String pictureStyle, Artist pictureArtist, int price) {
        this.name = pictureName;
        this.year = picturePaintingYear;
        this.style = pictureStyle;
        this.artist = pictureArtist;
        this.artist.addPicture(this);
        this.price = price;
    }

    public String getPictureStyle() {
        return style;
    }

    public Artist getPictureAuthor() {
        return artist;
    }

    @Override
    public String getDescription() {
        return "Was painted in " + year + " by " + artist.getName() + " " + artist.getSurname() +
                " in style: " + style;
    }
}
