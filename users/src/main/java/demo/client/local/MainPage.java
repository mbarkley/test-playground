package demo.client.local;

import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.github.gwtbootstrap.client.ui.TextBox;
import com.google.gwt.user.client.ui.Composite;

@Page( role = DefaultPage.class )
@Templated
public class MainPage extends Composite {

    @Inject
    @DataField
    private TextBox test;

    @PageShowing
    private void showing() {
        test.setText( "Proof" );
    }

}
