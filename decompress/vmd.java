import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vmd
{
    public final View a;
    public final int b;
    public final View c;
    public final TextView d;
    public final TextView e;
    
    public vmd(View a, final int b) {
        zzd.f((Object)a, "rootView");
        this.a = a;
        this.b = b;
        final View viewById = a.findViewById(b);
        zzd.e((Object)viewById, "rootView.findViewById(rowId)");
        this.c = viewById;
        a = viewById.findViewById(2131431162);
        zzd.e((Object)a, "row.findViewById(R.id.row_header)");
        this.d = (TextView)a;
        a = viewById.findViewById(2131431165);
        zzd.e((Object)a, "row.findViewById(R.id.row_subtext)");
        this.e = (TextView)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vmd)) {
            return false;
        }
        final vmd vmd = (vmd)o;
        return zzd.a((Object)this.a, (Object)vmd.a) && this.b == vmd.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final View a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoRow(rootView=");
        sb.append(a);
        sb.append(", rowId=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
