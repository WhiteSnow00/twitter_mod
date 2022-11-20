import android.os.BaseBundle;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializersKt;
import com.twitter.rooms.subsystem.api.models.RoomViewType;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dln extends xk1
{
    public static final b Companion;
    public final n4s c;
    
    static {
        Companion = new b();
    }
    
    public dln(final Bundle bundle) {
        super(bundle);
        this.c = (n4s)pps.n((nsb)new nsb<RoomViewType>(this) {
            public final dln D0;
            
            public final Object invoke() {
                final dce$a d = dce.d;
                String string;
                if ((string = ((BaseBundle)((vl1)this.D0).a).getString("ARGS_ROOM_TYPE")) == null) {
                    string = "";
                }
                return ((dce)d).b((DeserializationStrategy)SerializersKt.serializer(((dce)d).a(), v9m.g((Class)RoomViewType.class)), string);
            }
        });
    }
    
    public static final class a extends xk1$a<dln, a>
    {
        public final RoomViewType c;
        
        public a(final RoomViewType c) {
            czd.f((Object)c, "roomViewType");
            super(93783);
            this.c = c;
        }
        
        public final wk1 x() {
            final Bundle a = ((vl1$a)this).a;
            final dce$a d = dce.d;
            ((BaseBundle)a).putString("ARGS_ROOM_TYPE", ((wjr)d).c((jlp)SerializersKt.serializer(((wjr)d).a(), v9m.g((Class)RoomViewType.class)), (Object)this.c));
            return (wk1)new bln((bln.a)null, 1, (rf8)null);
        }
    }
    
    public static final class b
    {
    }
}
