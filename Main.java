public class Main {

    public static void main(String[] args) {

        Campeonato Camp1 = new Campeonato();
        while (true) {

            /*
             * Ao iniciar, gera um MENU contendo opçoes de escolha,
             * ao seleciorar uma das opçoes, uma avriavel armazena a opção selecionada
             */
            int opcMenu = Menu.statMenu();
            switch (opcMenu) {
                case 1: {
                    String nome = StdIo.blocoSmsInput("Insira o neme do time!!");
                    Camp1.cadastraTime(nome);
                    break;
                }
                case 4: {
                    Camp1.showTimes();
                }

                default: {
                    break;
                }

            }

            if (opcMenu == 3) {
                break;
            }
        }

    }
}