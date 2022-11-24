import android.widget.CompoundButton;
import android.view.View;
import android.view.MenuItem;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.Switch;
import android.view.Menu;
import com.twitter.util.user.UserIdentifier;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftu implements abi
{
    public final Resources F0;
    public final UserIdentifier G0;
    public final ryi H0;
    public final fca<btu> I0;
    
    public ftu(final Resources f0, final UserIdentifier g0, final ryi h0, final fca<btu> i0) {
        e0e.f((Object)f0, "resources");
        e0e.f((Object)g0, "userId");
        e0e.f((Object)h0, "switchHelper");
        e0e.f((Object)i0, "eventDispatcher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final boolean N2(final zai zai, final Menu menu) {
        e0e.f((Object)zai, "navComponent");
        e0e.f((Object)menu, "menu");
        zai.setTitle((CharSequence)this.F0.getString(2131957860));
        zai.z(2131689522, menu);
        final MenuItem item = zai.findItem(2131430676);
        e0e.c((Object)item);
        final Switch switch1 = (Switch)item.getActionView();
        item.setVisible(true);
        ((View)switch1).setEnabled(true);
        switch1.setChecked(this.H0.a(this.G0));
        ((CompoundButton)switch1).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new hxh((Object)this, 1));
        return true;
    }
    
    public final int d2(final zai zai) {
        e0e.f((Object)zai, "navComponent");
        return 2;
    }
}
