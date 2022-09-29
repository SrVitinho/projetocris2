public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void compartilhar() {
        System.out.println("compartilhou no twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no twitter");
    }

    @Override
    public void curtiPublicacao() {
        super.curtiPublicacao();
        System.out.println("no twitter");
    }
}
