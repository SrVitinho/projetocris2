public class Googleplus extends RedeSocial implements videoConferencia, Compartilhamento{

    @Override
    public void fazStreaming() {
        System.out.println("faz streaming no googleplus");
    }
    @Override
    public void compartilhar(){
        System.out.println("Compartilhou no googleplus");
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no googleplus");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no googleplus");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no googleplus");
    }

    @Override
    public void curtiPublicacao() {
        super.curtiPublicacao();
        System.out.println("no googleplus");
    }
}
