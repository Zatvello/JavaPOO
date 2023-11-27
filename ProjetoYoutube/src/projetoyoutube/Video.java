package projetoyoutube;

public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    float x = 0;
    int totAva = 0;
    public void setAvaliacao(int avaliacao) {
        /*int nova = 0;
        nova = nova + avaliacao;*/
        /*x += avaliacao;
        this.avaliacao = (int) x / this.views;*/

        totAva++; // Total de pessoas que avaliaram
        x = x + avaliacao; // Soma das avaliações
        this.avaliacao = x / totAva; // Média das avaliações
        System.out.println("---------------------------");
        System.out.println("Avaliação com o valor " + avaliacao + " enviada com sucesso!" + " Avaliação total de "+ this.getTitulo() + ": " + this.avaliacao + ".");
        System.out.print(totAva + (totAva == 1? " pessoa avaliou ": " pessoas avaliaram "));
        System.out.println(this.getTitulo());
        System.out.println("---------------------------");

    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
