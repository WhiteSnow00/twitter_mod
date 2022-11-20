import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpt extends xi1
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public hpt(final Intent intent) {
        super(intent);
    }
    
    public hpt(final String s, final vba vba) {
        czd.f((Object)s, "topicId");
        czd.f((Object)vba, "referringEventNamespace");
        super.mIntent.putExtra("args_topic_id", s);
        super.mIntent.putExtra("arg_referring_event_namespace", klp.e((Object)vba, (rlp)vba$b.b));
    }
    
    public static final class a
    {
    }
}
