import java.awt.Label;

import javafx.fxml.FXML;
public class FXMLDocumentControler
             implements Initializable{

                @FXML
                private Button btnClique;
                private Label lblMensagem;

                @FXML
                private void clicouBotao(){
                    lblMensagem.setText("Fala Comigo Fera!");
                }

                
             }