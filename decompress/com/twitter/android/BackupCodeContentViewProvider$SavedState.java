// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@xoe
public class BackupCodeContentViewProvider$SavedState<OBJ extends BackupCodeContentViewProvider> extends zp1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<BackupCodeContentViewProvider$SavedState>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new BackupCodeContentViewProvider$SavedState(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new BackupCodeContentViewProvider$SavedState[n];
            }
        };
    }
    
    public BackupCodeContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public BackupCodeContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final vlp vlp, final OBJ obj) throws IOException, ClassNotFoundException {
        final BackupCodeContentViewProvider backupCodeContentViewProvider = (BackupCodeContentViewProvider)super.deserializeValue(vlp, (Object)obj);
        backupCodeContentViewProvider.c1 = vlp.s();
        return (OBJ)backupCodeContentViewProvider;
    }
    
    public /* bridge */ Object deserializeValue(final vlp vlp, final Object o) throws IOException, ClassNotFoundException {
        return this.deserializeValue(vlp, (BackupCodeContentViewProvider)o);
    }
    
    public void serializeValue(final wlp wlp, final OBJ obj) throws IOException {
        super.serializeValue(wlp, (Object)obj);
        wlp.r(obj.c1);
    }
    
    public /* bridge */ void serializeValue(final wlp wlp, final Object o) throws IOException {
        this.serializeValue(wlp, (BackupCodeContentViewProvider)o);
    }
}
