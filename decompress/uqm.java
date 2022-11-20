import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class uqm extends s87
{
    public int L0;
    public int M0;
    public LayoutInflater N0;
    
    @Deprecated
    public uqm(final Context context, final int n) {
        super(context);
        this.M0 = n;
        this.L0 = n;
        this.N0 = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    @Override
    public final View i(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.N0.inflate(this.M0, viewGroup, false);
    }
}
