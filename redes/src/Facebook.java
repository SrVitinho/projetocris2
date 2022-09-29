public class Facebook extends RedeSocial implements videoConferencia, Compartilhamento{
    @Override
    public void fazStreaming(){
        System.out.println("Fez streaming no facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no facebook");
        
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no facebook");
    }

    @Override
    public void curtiPublicacao() {
        super.curtiPublicacao();
        System.out.println("no facebook");
    }
}
