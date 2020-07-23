package id.berkahin.jajanin;

public class Merchant {
    private String nama;
    private String alamat;
    private String foto;
    private boolean permission;
    private String harga;

    public Merchant() {
    }

    public Merchant(String nama, String alamat, String foto, boolean permission, String harga) {
        this.nama = nama;
        this.alamat = alamat;
        this.foto = foto;
        this.permission = permission;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean getPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }


}
