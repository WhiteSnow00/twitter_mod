// 
// Decompiled by Procyon v0.6.0
// 

public final class rj8
{
    public static final rj8 f;
    public final gah a;
    public final hc4 b;
    public final wsh c;
    public final wsh d;
    public final wsh e;
    
    static {
        f = new rj8();
    }
    
    public rj8() {
        final gah a = new gah();
        this.a = a;
        final hc4 b = new hc4();
        this.b = b;
        this.c = new wsh("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto");
        new dby((eah)b, a, (u9h)new le6());
        this.d = new wsh("/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto");
        final dby dby = new dby((eah)b, a, (u9h)new fkg((fkg$a)new dkg()));
        this.e = new wsh("/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto");
        final dby dby2 = new dby((eah)b, a, (u9h)new fkg((fkg$a)new ekg()));
    }
}
