import android.widget.TextView;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfo extends gue implements rtb<jfo, oyv>
{
    public final /* synthetic */ bfo C0;
    
    public gfo(final bfo c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jfo jfo = (jfo)o;
        zzd.f((Object)jfo, "$this$distinct");
        final bfo c0 = this.C0;
        final List c2 = jfo.c;
        ((s71)c0.D0).d((i4e)new skf((Iterable)c2));
        final ArrayList list = new ArrayList();
        for (final Object next : c2) {
            if (((ofo)next).d) {
                list.add(next);
            }
        }
        final int size = list.size();
        final TypefacesTextView h0 = c0.H0;
        final int n = 0;
        int visibility;
        if (size > 0) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        ((View)h0).setVisibility(visibility);
        ((TextView)c0.H0).setText((CharSequence)String.valueOf(size));
        return oyv.a;
    }
}
