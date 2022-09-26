package patterns.adapter;

import patterns.adapter.project2.GoogleLocationManagement;

public class Screen {

    public void apertarBotao() {
        TerceiroPeriodoLocationManagement terceiroPeridoLM = new TerceiroPeriodoLocationManagement();

        GoogleLocationManagement google = new GoogleLocationManagement();
        GoogleLocationAdapter adapter = new GoogleLocationAdapter(google);
        ApplicationService app = new ApplicationService(adapter);
        Location userLocation = app.getLocation();
    }

}
