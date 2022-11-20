import android.view.View;
import java.util.Iterator;
import android.text.style.ImageSpan;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.Objects;
import android.text.SpannedString;
import android.text.SpannableString;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lid extends ste implements qsb<List<b8d>, SpannableString>
{
    public final iid$b D0;
    public final SpannedString E0;
    
    public lid(final iid$b d0, final SpannedString e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "responses");
        final iid$b d0 = this.D0;
        final SpannedString e0 = this.E0;
        Objects.requireNonNull(d0);
        final SpannableString spannableString = new SpannableString((CharSequence)e0);
        final StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(spannableString);
        final SpannableString spannableString2 = new SpannableString((CharSequence)sb.toString());
        final ArrayList list2 = new ArrayList<BitmapDrawable>(iq4.H((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new BitmapDrawable(((View)d0.E0).getContext().getResources(), (Bitmap)((nrm)iterator.next()).b));
        }
        final List z0 = mq4.z0((Iterable)list2);
        final int n = (z0.size() * 3 + 1) * d0.M0 / 4 + d0.N0;
        final Object[] array = z0.toArray(new Drawable[0]);
        czd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final LayerDrawable layerDrawable = new LayerDrawable((Drawable[])array);
        final Iterator iterator2 = ((gtd)rrz.R(0, layerDrawable.getNumberOfLayers())).iterator();
        while (((htd)iterator2).hasNext()) {
            final int a = ((etd)iterator2).a();
            final Drawable drawable = layerDrawable.getDrawable(a);
            final int m0 = d0.M0;
            drawable.setBounds(0, 0, m0, m0);
            final int m2 = d0.M0;
            final int n2 = m2 * 3 / 4 * a;
            final int n3 = d0.N0;
            layerDrawable.setLayerInset(a, Integer.valueOf(n - n2 - m2 - n3).intValue(), 0, Integer.valueOf(n2 + n3).intValue(), 0);
        }
        ((Drawable)layerDrawable).setBounds(0, 0, n, d0.M0);
        spannableString2.setSpan((Object)new ImageSpan((Drawable)layerDrawable), 0, 1, 33);
        return spannableString2;
    }
}
