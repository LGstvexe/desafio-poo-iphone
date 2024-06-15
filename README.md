classDiagram
ReprodutorMusical <|-- IPhone
AparelhoTelefonico <|-- IPhone
NavegadorInternet <|-- IPhone

class ReprodutorMusical{
+tocar() void
+pausar() void
+selecionarMusica(String musica) String
}

class AparelhoTelefonico {
  +atender() void
  +iniciarCorreioVoz() void
  +ligar(String numero) String
}

class NavegadorInternet {
  +atualizarPagina() void
  +adicionarNovaAba() void
  +exibirPagina(String url) String
}