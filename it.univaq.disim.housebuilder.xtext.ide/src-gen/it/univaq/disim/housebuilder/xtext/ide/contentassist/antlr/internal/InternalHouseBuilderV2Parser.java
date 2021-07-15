package it.univaq.disim.housebuilder.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.univaq.disim.housebuilder.xtext.services.HouseBuilderV2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHouseBuilderV2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'E'", "'e'", "'THERMOSTAT'", "'APPLIANCE'", "'SOCKET'", "'ROLLER_SHUTTERS'", "'GATE'", "'IDRAULIC'", "'PNEUMATIC'", "'ELECTRICAL'", "'THERMAL'", "'MECHANICAL'", "'TEMPERATURE'", "'PRESSURE'", "'PROXIMITY'", "'ACCELEROMETER'", "'GAS'", "'SMOKE'", "'VIDEO_SURVAILLANCE_CAMERA'", "'SIMPLE'", "'BATHROOM'", "'LIVING_ROOM'", "'BEDROOM'", "'HALLWAY'", "'STUDY'", "'ENTRANCE'", "'STORAGE_ROOM'", "'GARAGE'", "'LAUNDRY_ROOM'", "'HOBBY_ROOM'", "'CELLAR'", "'LUNCHROOM'", "'RUMPUS_ROOM'", "'STAIRS'", "'KITCHEN'", "'BALCONY'", "'GARDEN'", "'TERRACE'", "'ASPALTH'", "'TERRAIN'", "'PAVING'", "'DOOR_WINDOW'", "'PANIC_DOOR'", "'ENTRANCE_DOOR'", "'SLIDING_DOOR'", "'EMPTY'", "'House'", "'{'", "'floors'", "'}'", "'entrances'", "'state'", "'province'", "'city'", "'postalCode'", "'address'", "'buildingDate'", "','", "'passages'", "'controllers'", "'Floor'", "'level'", "'spaces'", "'Passage'", "'doorType'", "'doorsNumber'", "'width'", "'height'", "'spaceA'", "'spaceB'", "'devices'", "'Controller'", "'model'", "'actuators'", "'sensors'", "'os'", "'osVersion'", "'Entrance'", "'space'", "'-'", "'.'", "'Device'", "'type'", "'actuator'", "'Sensor'", "'value'", "'Room'", "'length'", "'roomType'", "'('", "')'", "'passagesA'", "'passagesB'", "'windows'", "'ExternalSpace'", "'ground'", "'Actuator'", "'device'", "'Window'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalHouseBuilderV2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHouseBuilderV2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHouseBuilderV2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalHouseBuilderV2.g"; }


    	private HouseBuilderV2GrammarAccess grammarAccess;

    	public void setGrammarAccess(HouseBuilderV2GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHouse"
    // InternalHouseBuilderV2.g:53:1: entryRuleHouse : ruleHouse EOF ;
    public final void entryRuleHouse() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:54:1: ( ruleHouse EOF )
            // InternalHouseBuilderV2.g:55:1: ruleHouse EOF
            {
             before(grammarAccess.getHouseRule()); 
            pushFollow(FOLLOW_1);
            ruleHouse();

            state._fsp--;

             after(grammarAccess.getHouseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHouse"


    // $ANTLR start "ruleHouse"
    // InternalHouseBuilderV2.g:62:1: ruleHouse : ( ( rule__House__Group__0 ) ) ;
    public final void ruleHouse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:66:2: ( ( ( rule__House__Group__0 ) ) )
            // InternalHouseBuilderV2.g:67:2: ( ( rule__House__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:67:2: ( ( rule__House__Group__0 ) )
            // InternalHouseBuilderV2.g:68:3: ( rule__House__Group__0 )
            {
             before(grammarAccess.getHouseAccess().getGroup()); 
            // InternalHouseBuilderV2.g:69:3: ( rule__House__Group__0 )
            // InternalHouseBuilderV2.g:69:4: rule__House__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__House__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHouse"


    // $ANTLR start "entryRuleSpace"
    // InternalHouseBuilderV2.g:78:1: entryRuleSpace : ruleSpace EOF ;
    public final void entryRuleSpace() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:79:1: ( ruleSpace EOF )
            // InternalHouseBuilderV2.g:80:1: ruleSpace EOF
            {
             before(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getSpaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalHouseBuilderV2.g:87:1: ruleSpace : ( ( rule__Space__Alternatives ) ) ;
    public final void ruleSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:91:2: ( ( ( rule__Space__Alternatives ) ) )
            // InternalHouseBuilderV2.g:92:2: ( ( rule__Space__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:92:2: ( ( rule__Space__Alternatives ) )
            // InternalHouseBuilderV2.g:93:3: ( rule__Space__Alternatives )
            {
             before(grammarAccess.getSpaceAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:94:3: ( rule__Space__Alternatives )
            // InternalHouseBuilderV2.g:94:4: rule__Space__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Space__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleEString"
    // InternalHouseBuilderV2.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:104:1: ( ruleEString EOF )
            // InternalHouseBuilderV2.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalHouseBuilderV2.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalHouseBuilderV2.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalHouseBuilderV2.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:119:3: ( rule__EString__Alternatives )
            // InternalHouseBuilderV2.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalHouseBuilderV2.g:128:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:129:1: ( ruleEDate EOF )
            // InternalHouseBuilderV2.g:130:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalHouseBuilderV2.g:137:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:141:2: ( ( 'EDate' ) )
            // InternalHouseBuilderV2.g:142:2: ( 'EDate' )
            {
            // InternalHouseBuilderV2.g:142:2: ( 'EDate' )
            // InternalHouseBuilderV2.g:143:3: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleFloor"
    // InternalHouseBuilderV2.g:153:1: entryRuleFloor : ruleFloor EOF ;
    public final void entryRuleFloor() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:154:1: ( ruleFloor EOF )
            // InternalHouseBuilderV2.g:155:1: ruleFloor EOF
            {
             before(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getFloorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalHouseBuilderV2.g:162:1: ruleFloor : ( ( rule__Floor__Group__0 ) ) ;
    public final void ruleFloor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:166:2: ( ( ( rule__Floor__Group__0 ) ) )
            // InternalHouseBuilderV2.g:167:2: ( ( rule__Floor__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:167:2: ( ( rule__Floor__Group__0 ) )
            // InternalHouseBuilderV2.g:168:3: ( rule__Floor__Group__0 )
            {
             before(grammarAccess.getFloorAccess().getGroup()); 
            // InternalHouseBuilderV2.g:169:3: ( rule__Floor__Group__0 )
            // InternalHouseBuilderV2.g:169:4: rule__Floor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRulePassage"
    // InternalHouseBuilderV2.g:178:1: entryRulePassage : rulePassage EOF ;
    public final void entryRulePassage() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:179:1: ( rulePassage EOF )
            // InternalHouseBuilderV2.g:180:1: rulePassage EOF
            {
             before(grammarAccess.getPassageRule()); 
            pushFollow(FOLLOW_1);
            rulePassage();

            state._fsp--;

             after(grammarAccess.getPassageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePassage"


    // $ANTLR start "rulePassage"
    // InternalHouseBuilderV2.g:187:1: rulePassage : ( ( rule__Passage__Group__0 ) ) ;
    public final void rulePassage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:191:2: ( ( ( rule__Passage__Group__0 ) ) )
            // InternalHouseBuilderV2.g:192:2: ( ( rule__Passage__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:192:2: ( ( rule__Passage__Group__0 ) )
            // InternalHouseBuilderV2.g:193:3: ( rule__Passage__Group__0 )
            {
             before(grammarAccess.getPassageAccess().getGroup()); 
            // InternalHouseBuilderV2.g:194:3: ( rule__Passage__Group__0 )
            // InternalHouseBuilderV2.g:194:4: rule__Passage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePassage"


    // $ANTLR start "entryRuleController"
    // InternalHouseBuilderV2.g:203:1: entryRuleController : ruleController EOF ;
    public final void entryRuleController() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:204:1: ( ruleController EOF )
            // InternalHouseBuilderV2.g:205:1: ruleController EOF
            {
             before(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleController();

            state._fsp--;

             after(grammarAccess.getControllerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalHouseBuilderV2.g:212:1: ruleController : ( ( rule__Controller__Group__0 ) ) ;
    public final void ruleController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:216:2: ( ( ( rule__Controller__Group__0 ) ) )
            // InternalHouseBuilderV2.g:217:2: ( ( rule__Controller__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:217:2: ( ( rule__Controller__Group__0 ) )
            // InternalHouseBuilderV2.g:218:3: ( rule__Controller__Group__0 )
            {
             before(grammarAccess.getControllerAccess().getGroup()); 
            // InternalHouseBuilderV2.g:219:3: ( rule__Controller__Group__0 )
            // InternalHouseBuilderV2.g:219:4: rule__Controller__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleEntrance"
    // InternalHouseBuilderV2.g:228:1: entryRuleEntrance : ruleEntrance EOF ;
    public final void entryRuleEntrance() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:229:1: ( ruleEntrance EOF )
            // InternalHouseBuilderV2.g:230:1: ruleEntrance EOF
            {
             before(grammarAccess.getEntranceRule()); 
            pushFollow(FOLLOW_1);
            ruleEntrance();

            state._fsp--;

             after(grammarAccess.getEntranceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntrance"


    // $ANTLR start "ruleEntrance"
    // InternalHouseBuilderV2.g:237:1: ruleEntrance : ( ( rule__Entrance__Group__0 ) ) ;
    public final void ruleEntrance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:241:2: ( ( ( rule__Entrance__Group__0 ) ) )
            // InternalHouseBuilderV2.g:242:2: ( ( rule__Entrance__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:242:2: ( ( rule__Entrance__Group__0 ) )
            // InternalHouseBuilderV2.g:243:3: ( rule__Entrance__Group__0 )
            {
             before(grammarAccess.getEntranceAccess().getGroup()); 
            // InternalHouseBuilderV2.g:244:3: ( rule__Entrance__Group__0 )
            // InternalHouseBuilderV2.g:244:4: rule__Entrance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntrance"


    // $ANTLR start "entryRuleEInt"
    // InternalHouseBuilderV2.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:254:1: ( ruleEInt EOF )
            // InternalHouseBuilderV2.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalHouseBuilderV2.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalHouseBuilderV2.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalHouseBuilderV2.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalHouseBuilderV2.g:269:3: ( rule__EInt__Group__0 )
            // InternalHouseBuilderV2.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalHouseBuilderV2.g:278:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:279:1: ( ruleEFloat EOF )
            // InternalHouseBuilderV2.g:280:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalHouseBuilderV2.g:287:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:291:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalHouseBuilderV2.g:292:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:292:2: ( ( rule__EFloat__Group__0 ) )
            // InternalHouseBuilderV2.g:293:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalHouseBuilderV2.g:294:3: ( rule__EFloat__Group__0 )
            // InternalHouseBuilderV2.g:294:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleDevice"
    // InternalHouseBuilderV2.g:303:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:304:1: ( ruleDevice EOF )
            // InternalHouseBuilderV2.g:305:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalHouseBuilderV2.g:312:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:316:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalHouseBuilderV2.g:317:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:317:2: ( ( rule__Device__Group__0 ) )
            // InternalHouseBuilderV2.g:318:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalHouseBuilderV2.g:319:3: ( rule__Device__Group__0 )
            // InternalHouseBuilderV2.g:319:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleSensor"
    // InternalHouseBuilderV2.g:328:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:329:1: ( ruleSensor EOF )
            // InternalHouseBuilderV2.g:330:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalHouseBuilderV2.g:337:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:341:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalHouseBuilderV2.g:342:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:342:2: ( ( rule__Sensor__Group__0 ) )
            // InternalHouseBuilderV2.g:343:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalHouseBuilderV2.g:344:3: ( rule__Sensor__Group__0 )
            // InternalHouseBuilderV2.g:344:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleRoom"
    // InternalHouseBuilderV2.g:353:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:354:1: ( ruleRoom EOF )
            // InternalHouseBuilderV2.g:355:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalHouseBuilderV2.g:362:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:366:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalHouseBuilderV2.g:367:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:367:2: ( ( rule__Room__Group__0 ) )
            // InternalHouseBuilderV2.g:368:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalHouseBuilderV2.g:369:3: ( rule__Room__Group__0 )
            // InternalHouseBuilderV2.g:369:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleExternalSpace"
    // InternalHouseBuilderV2.g:378:1: entryRuleExternalSpace : ruleExternalSpace EOF ;
    public final void entryRuleExternalSpace() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:379:1: ( ruleExternalSpace EOF )
            // InternalHouseBuilderV2.g:380:1: ruleExternalSpace EOF
            {
             before(grammarAccess.getExternalSpaceRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalSpace();

            state._fsp--;

             after(grammarAccess.getExternalSpaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalSpace"


    // $ANTLR start "ruleExternalSpace"
    // InternalHouseBuilderV2.g:387:1: ruleExternalSpace : ( ( rule__ExternalSpace__Group__0 ) ) ;
    public final void ruleExternalSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:391:2: ( ( ( rule__ExternalSpace__Group__0 ) ) )
            // InternalHouseBuilderV2.g:392:2: ( ( rule__ExternalSpace__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:392:2: ( ( rule__ExternalSpace__Group__0 ) )
            // InternalHouseBuilderV2.g:393:3: ( rule__ExternalSpace__Group__0 )
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup()); 
            // InternalHouseBuilderV2.g:394:3: ( rule__ExternalSpace__Group__0 )
            // InternalHouseBuilderV2.g:394:4: rule__ExternalSpace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalSpace"


    // $ANTLR start "entryRuleActuator"
    // InternalHouseBuilderV2.g:403:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:404:1: ( ruleActuator EOF )
            // InternalHouseBuilderV2.g:405:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalHouseBuilderV2.g:412:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:416:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalHouseBuilderV2.g:417:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:417:2: ( ( rule__Actuator__Group__0 ) )
            // InternalHouseBuilderV2.g:418:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalHouseBuilderV2.g:419:3: ( rule__Actuator__Group__0 )
            // InternalHouseBuilderV2.g:419:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleWindow"
    // InternalHouseBuilderV2.g:428:1: entryRuleWindow : ruleWindow EOF ;
    public final void entryRuleWindow() throws RecognitionException {
        try {
            // InternalHouseBuilderV2.g:429:1: ( ruleWindow EOF )
            // InternalHouseBuilderV2.g:430:1: ruleWindow EOF
            {
             before(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getWindowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalHouseBuilderV2.g:437:1: ruleWindow : ( ( rule__Window__Group__0 ) ) ;
    public final void ruleWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:441:2: ( ( ( rule__Window__Group__0 ) ) )
            // InternalHouseBuilderV2.g:442:2: ( ( rule__Window__Group__0 ) )
            {
            // InternalHouseBuilderV2.g:442:2: ( ( rule__Window__Group__0 ) )
            // InternalHouseBuilderV2.g:443:3: ( rule__Window__Group__0 )
            {
             before(grammarAccess.getWindowAccess().getGroup()); 
            // InternalHouseBuilderV2.g:444:3: ( rule__Window__Group__0 )
            // InternalHouseBuilderV2.g:444:4: rule__Window__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "ruleDeviceType"
    // InternalHouseBuilderV2.g:453:1: ruleDeviceType : ( ( rule__DeviceType__Alternatives ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:457:1: ( ( ( rule__DeviceType__Alternatives ) ) )
            // InternalHouseBuilderV2.g:458:2: ( ( rule__DeviceType__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:458:2: ( ( rule__DeviceType__Alternatives ) )
            // InternalHouseBuilderV2.g:459:3: ( rule__DeviceType__Alternatives )
            {
             before(grammarAccess.getDeviceTypeAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:460:3: ( rule__DeviceType__Alternatives )
            // InternalHouseBuilderV2.g:460:4: rule__DeviceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "ruleActuatorType"
    // InternalHouseBuilderV2.g:469:1: ruleActuatorType : ( ( rule__ActuatorType__Alternatives ) ) ;
    public final void ruleActuatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:473:1: ( ( ( rule__ActuatorType__Alternatives ) ) )
            // InternalHouseBuilderV2.g:474:2: ( ( rule__ActuatorType__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:474:2: ( ( rule__ActuatorType__Alternatives ) )
            // InternalHouseBuilderV2.g:475:3: ( rule__ActuatorType__Alternatives )
            {
             before(grammarAccess.getActuatorTypeAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:476:3: ( rule__ActuatorType__Alternatives )
            // InternalHouseBuilderV2.g:476:4: rule__ActuatorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActuatorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuatorType"


    // $ANTLR start "ruleSensorType"
    // InternalHouseBuilderV2.g:485:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:489:1: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalHouseBuilderV2.g:490:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:490:2: ( ( rule__SensorType__Alternatives ) )
            // InternalHouseBuilderV2.g:491:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:492:3: ( rule__SensorType__Alternatives )
            // InternalHouseBuilderV2.g:492:4: rule__SensorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleRoomType"
    // InternalHouseBuilderV2.g:501:1: ruleRoomType : ( ( rule__RoomType__Alternatives ) ) ;
    public final void ruleRoomType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:505:1: ( ( ( rule__RoomType__Alternatives ) ) )
            // InternalHouseBuilderV2.g:506:2: ( ( rule__RoomType__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:506:2: ( ( rule__RoomType__Alternatives ) )
            // InternalHouseBuilderV2.g:507:3: ( rule__RoomType__Alternatives )
            {
             before(grammarAccess.getRoomTypeAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:508:3: ( rule__RoomType__Alternatives )
            // InternalHouseBuilderV2.g:508:4: rule__RoomType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoomType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoomTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoomType"


    // $ANTLR start "ruleOuterSpaceType"
    // InternalHouseBuilderV2.g:517:1: ruleOuterSpaceType : ( ( rule__OuterSpaceType__Alternatives ) ) ;
    public final void ruleOuterSpaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:521:1: ( ( ( rule__OuterSpaceType__Alternatives ) ) )
            // InternalHouseBuilderV2.g:522:2: ( ( rule__OuterSpaceType__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:522:2: ( ( rule__OuterSpaceType__Alternatives ) )
            // InternalHouseBuilderV2.g:523:3: ( rule__OuterSpaceType__Alternatives )
            {
             before(grammarAccess.getOuterSpaceTypeAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:524:3: ( rule__OuterSpaceType__Alternatives )
            // InternalHouseBuilderV2.g:524:4: rule__OuterSpaceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OuterSpaceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOuterSpaceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOuterSpaceType"


    // $ANTLR start "ruleGroundType"
    // InternalHouseBuilderV2.g:533:1: ruleGroundType : ( ( rule__GroundType__Alternatives ) ) ;
    public final void ruleGroundType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:537:1: ( ( ( rule__GroundType__Alternatives ) ) )
            // InternalHouseBuilderV2.g:538:2: ( ( rule__GroundType__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:538:2: ( ( rule__GroundType__Alternatives ) )
            // InternalHouseBuilderV2.g:539:3: ( rule__GroundType__Alternatives )
            {
             before(grammarAccess.getGroundTypeAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:540:3: ( rule__GroundType__Alternatives )
            // InternalHouseBuilderV2.g:540:4: rule__GroundType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroundType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroundTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundType"


    // $ANTLR start "ruleDoorType"
    // InternalHouseBuilderV2.g:549:1: ruleDoorType : ( ( rule__DoorType__Alternatives ) ) ;
    public final void ruleDoorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:553:1: ( ( ( rule__DoorType__Alternatives ) ) )
            // InternalHouseBuilderV2.g:554:2: ( ( rule__DoorType__Alternatives ) )
            {
            // InternalHouseBuilderV2.g:554:2: ( ( rule__DoorType__Alternatives ) )
            // InternalHouseBuilderV2.g:555:3: ( rule__DoorType__Alternatives )
            {
             before(grammarAccess.getDoorTypeAccess().getAlternatives()); 
            // InternalHouseBuilderV2.g:556:3: ( rule__DoorType__Alternatives )
            // InternalHouseBuilderV2.g:556:4: rule__DoorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DoorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDoorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoorType"


    // $ANTLR start "rule__Space__Alternatives"
    // InternalHouseBuilderV2.g:564:1: rule__Space__Alternatives : ( ( ruleRoom ) | ( ruleExternalSpace ) );
    public final void rule__Space__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:568:1: ( ( ruleRoom ) | ( ruleExternalSpace ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==98) ) {
                alt1=1;
            }
            else if ( (LA1_0==106) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHouseBuilderV2.g:569:2: ( ruleRoom )
                    {
                    // InternalHouseBuilderV2.g:569:2: ( ruleRoom )
                    // InternalHouseBuilderV2.g:570:3: ruleRoom
                    {
                     before(grammarAccess.getSpaceAccess().getRoomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoom();

                    state._fsp--;

                     after(grammarAccess.getSpaceAccess().getRoomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:575:2: ( ruleExternalSpace )
                    {
                    // InternalHouseBuilderV2.g:575:2: ( ruleExternalSpace )
                    // InternalHouseBuilderV2.g:576:3: ruleExternalSpace
                    {
                     before(grammarAccess.getSpaceAccess().getExternalSpaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalSpace();

                    state._fsp--;

                     after(grammarAccess.getSpaceAccess().getExternalSpaceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalHouseBuilderV2.g:585:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:589:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHouseBuilderV2.g:590:2: ( RULE_STRING )
                    {
                    // InternalHouseBuilderV2.g:590:2: ( RULE_STRING )
                    // InternalHouseBuilderV2.g:591:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:596:2: ( RULE_ID )
                    {
                    // InternalHouseBuilderV2.g:596:2: ( RULE_ID )
                    // InternalHouseBuilderV2.g:597:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalHouseBuilderV2.g:606:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:610:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHouseBuilderV2.g:611:2: ( 'E' )
                    {
                    // InternalHouseBuilderV2.g:611:2: ( 'E' )
                    // InternalHouseBuilderV2.g:612:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:617:2: ( 'e' )
                    {
                    // InternalHouseBuilderV2.g:617:2: ( 'e' )
                    // InternalHouseBuilderV2.g:618:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__DeviceType__Alternatives"
    // InternalHouseBuilderV2.g:627:1: rule__DeviceType__Alternatives : ( ( ( 'THERMOSTAT' ) ) | ( ( 'APPLIANCE' ) ) | ( ( 'SOCKET' ) ) | ( ( 'ROLLER_SHUTTERS' ) ) | ( ( 'GATE' ) ) );
    public final void rule__DeviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:631:1: ( ( ( 'THERMOSTAT' ) ) | ( ( 'APPLIANCE' ) ) | ( ( 'SOCKET' ) ) | ( ( 'ROLLER_SHUTTERS' ) ) | ( ( 'GATE' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHouseBuilderV2.g:632:2: ( ( 'THERMOSTAT' ) )
                    {
                    // InternalHouseBuilderV2.g:632:2: ( ( 'THERMOSTAT' ) )
                    // InternalHouseBuilderV2.g:633:3: ( 'THERMOSTAT' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilderV2.g:634:3: ( 'THERMOSTAT' )
                    // InternalHouseBuilderV2.g:634:4: 'THERMOSTAT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:638:2: ( ( 'APPLIANCE' ) )
                    {
                    // InternalHouseBuilderV2.g:638:2: ( ( 'APPLIANCE' ) )
                    // InternalHouseBuilderV2.g:639:3: ( 'APPLIANCE' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilderV2.g:640:3: ( 'APPLIANCE' )
                    // InternalHouseBuilderV2.g:640:4: 'APPLIANCE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:644:2: ( ( 'SOCKET' ) )
                    {
                    // InternalHouseBuilderV2.g:644:2: ( ( 'SOCKET' ) )
                    // InternalHouseBuilderV2.g:645:3: ( 'SOCKET' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilderV2.g:646:3: ( 'SOCKET' )
                    // InternalHouseBuilderV2.g:646:4: 'SOCKET'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:650:2: ( ( 'ROLLER_SHUTTERS' ) )
                    {
                    // InternalHouseBuilderV2.g:650:2: ( ( 'ROLLER_SHUTTERS' ) )
                    // InternalHouseBuilderV2.g:651:3: ( 'ROLLER_SHUTTERS' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3()); 
                    // InternalHouseBuilderV2.g:652:3: ( 'ROLLER_SHUTTERS' )
                    // InternalHouseBuilderV2.g:652:4: 'ROLLER_SHUTTERS'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:656:2: ( ( 'GATE' ) )
                    {
                    // InternalHouseBuilderV2.g:656:2: ( ( 'GATE' ) )
                    // InternalHouseBuilderV2.g:657:3: ( 'GATE' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilderV2.g:658:3: ( 'GATE' )
                    // InternalHouseBuilderV2.g:658:4: 'GATE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Alternatives"


    // $ANTLR start "rule__ActuatorType__Alternatives"
    // InternalHouseBuilderV2.g:666:1: rule__ActuatorType__Alternatives : ( ( ( 'IDRAULIC' ) ) | ( ( 'PNEUMATIC' ) ) | ( ( 'ELECTRICAL' ) ) | ( ( 'THERMAL' ) ) | ( ( 'MECHANICAL' ) ) );
    public final void rule__ActuatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:670:1: ( ( ( 'IDRAULIC' ) ) | ( ( 'PNEUMATIC' ) ) | ( ( 'ELECTRICAL' ) ) | ( ( 'THERMAL' ) ) | ( ( 'MECHANICAL' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHouseBuilderV2.g:671:2: ( ( 'IDRAULIC' ) )
                    {
                    // InternalHouseBuilderV2.g:671:2: ( ( 'IDRAULIC' ) )
                    // InternalHouseBuilderV2.g:672:3: ( 'IDRAULIC' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilderV2.g:673:3: ( 'IDRAULIC' )
                    // InternalHouseBuilderV2.g:673:4: 'IDRAULIC'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:677:2: ( ( 'PNEUMATIC' ) )
                    {
                    // InternalHouseBuilderV2.g:677:2: ( ( 'PNEUMATIC' ) )
                    // InternalHouseBuilderV2.g:678:3: ( 'PNEUMATIC' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilderV2.g:679:3: ( 'PNEUMATIC' )
                    // InternalHouseBuilderV2.g:679:4: 'PNEUMATIC'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:683:2: ( ( 'ELECTRICAL' ) )
                    {
                    // InternalHouseBuilderV2.g:683:2: ( ( 'ELECTRICAL' ) )
                    // InternalHouseBuilderV2.g:684:3: ( 'ELECTRICAL' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilderV2.g:685:3: ( 'ELECTRICAL' )
                    // InternalHouseBuilderV2.g:685:4: 'ELECTRICAL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:689:2: ( ( 'THERMAL' ) )
                    {
                    // InternalHouseBuilderV2.g:689:2: ( ( 'THERMAL' ) )
                    // InternalHouseBuilderV2.g:690:3: ( 'THERMAL' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3()); 
                    // InternalHouseBuilderV2.g:691:3: ( 'THERMAL' )
                    // InternalHouseBuilderV2.g:691:4: 'THERMAL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:695:2: ( ( 'MECHANICAL' ) )
                    {
                    // InternalHouseBuilderV2.g:695:2: ( ( 'MECHANICAL' ) )
                    // InternalHouseBuilderV2.g:696:3: ( 'MECHANICAL' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilderV2.g:697:3: ( 'MECHANICAL' )
                    // InternalHouseBuilderV2.g:697:4: 'MECHANICAL'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorType__Alternatives"


    // $ANTLR start "rule__SensorType__Alternatives"
    // InternalHouseBuilderV2.g:705:1: rule__SensorType__Alternatives : ( ( ( 'TEMPERATURE' ) ) | ( ( 'PRESSURE' ) ) | ( ( 'PROXIMITY' ) ) | ( ( 'ACCELEROMETER' ) ) | ( ( 'GAS' ) ) | ( ( 'SMOKE' ) ) | ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:709:1: ( ( ( 'TEMPERATURE' ) ) | ( ( 'PRESSURE' ) ) | ( ( 'PROXIMITY' ) ) | ( ( 'ACCELEROMETER' ) ) | ( ( 'GAS' ) ) | ( ( 'SMOKE' ) ) | ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            case 30:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHouseBuilderV2.g:710:2: ( ( 'TEMPERATURE' ) )
                    {
                    // InternalHouseBuilderV2.g:710:2: ( ( 'TEMPERATURE' ) )
                    // InternalHouseBuilderV2.g:711:3: ( 'TEMPERATURE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilderV2.g:712:3: ( 'TEMPERATURE' )
                    // InternalHouseBuilderV2.g:712:4: 'TEMPERATURE'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:716:2: ( ( 'PRESSURE' ) )
                    {
                    // InternalHouseBuilderV2.g:716:2: ( ( 'PRESSURE' ) )
                    // InternalHouseBuilderV2.g:717:3: ( 'PRESSURE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilderV2.g:718:3: ( 'PRESSURE' )
                    // InternalHouseBuilderV2.g:718:4: 'PRESSURE'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:722:2: ( ( 'PROXIMITY' ) )
                    {
                    // InternalHouseBuilderV2.g:722:2: ( ( 'PROXIMITY' ) )
                    // InternalHouseBuilderV2.g:723:3: ( 'PROXIMITY' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilderV2.g:724:3: ( 'PROXIMITY' )
                    // InternalHouseBuilderV2.g:724:4: 'PROXIMITY'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:728:2: ( ( 'ACCELEROMETER' ) )
                    {
                    // InternalHouseBuilderV2.g:728:2: ( ( 'ACCELEROMETER' ) )
                    // InternalHouseBuilderV2.g:729:3: ( 'ACCELEROMETER' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3()); 
                    // InternalHouseBuilderV2.g:730:3: ( 'ACCELEROMETER' )
                    // InternalHouseBuilderV2.g:730:4: 'ACCELEROMETER'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:734:2: ( ( 'GAS' ) )
                    {
                    // InternalHouseBuilderV2.g:734:2: ( ( 'GAS' ) )
                    // InternalHouseBuilderV2.g:735:3: ( 'GAS' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilderV2.g:736:3: ( 'GAS' )
                    // InternalHouseBuilderV2.g:736:4: 'GAS'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilderV2.g:740:2: ( ( 'SMOKE' ) )
                    {
                    // InternalHouseBuilderV2.g:740:2: ( ( 'SMOKE' ) )
                    // InternalHouseBuilderV2.g:741:3: ( 'SMOKE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5()); 
                    // InternalHouseBuilderV2.g:742:3: ( 'SMOKE' )
                    // InternalHouseBuilderV2.g:742:4: 'SMOKE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilderV2.g:746:2: ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) )
                    {
                    // InternalHouseBuilderV2.g:746:2: ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) )
                    // InternalHouseBuilderV2.g:747:3: ( 'VIDEO_SURVAILLANCE_CAMERA' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6()); 
                    // InternalHouseBuilderV2.g:748:3: ( 'VIDEO_SURVAILLANCE_CAMERA' )
                    // InternalHouseBuilderV2.g:748:4: 'VIDEO_SURVAILLANCE_CAMERA'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorType__Alternatives"


    // $ANTLR start "rule__RoomType__Alternatives"
    // InternalHouseBuilderV2.g:756:1: rule__RoomType__Alternatives : ( ( ( 'SIMPLE' ) ) | ( ( 'BATHROOM' ) ) | ( ( 'LIVING_ROOM' ) ) | ( ( 'BEDROOM' ) ) | ( ( 'HALLWAY' ) ) | ( ( 'STUDY' ) ) | ( ( 'ENTRANCE' ) ) | ( ( 'STORAGE_ROOM' ) ) | ( ( 'GARAGE' ) ) | ( ( 'LAUNDRY_ROOM' ) ) | ( ( 'HOBBY_ROOM' ) ) | ( ( 'CELLAR' ) ) | ( ( 'LUNCHROOM' ) ) | ( ( 'RUMPUS_ROOM' ) ) | ( ( 'STAIRS' ) ) | ( ( 'KITCHEN' ) ) );
    public final void rule__RoomType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:760:1: ( ( ( 'SIMPLE' ) ) | ( ( 'BATHROOM' ) ) | ( ( 'LIVING_ROOM' ) ) | ( ( 'BEDROOM' ) ) | ( ( 'HALLWAY' ) ) | ( ( 'STUDY' ) ) | ( ( 'ENTRANCE' ) ) | ( ( 'STORAGE_ROOM' ) ) | ( ( 'GARAGE' ) ) | ( ( 'LAUNDRY_ROOM' ) ) | ( ( 'HOBBY_ROOM' ) ) | ( ( 'CELLAR' ) ) | ( ( 'LUNCHROOM' ) ) | ( ( 'RUMPUS_ROOM' ) ) | ( ( 'STAIRS' ) ) | ( ( 'KITCHEN' ) ) )
            int alt7=16;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 35:
                {
                alt7=5;
                }
                break;
            case 36:
                {
                alt7=6;
                }
                break;
            case 37:
                {
                alt7=7;
                }
                break;
            case 38:
                {
                alt7=8;
                }
                break;
            case 39:
                {
                alt7=9;
                }
                break;
            case 40:
                {
                alt7=10;
                }
                break;
            case 41:
                {
                alt7=11;
                }
                break;
            case 42:
                {
                alt7=12;
                }
                break;
            case 43:
                {
                alt7=13;
                }
                break;
            case 44:
                {
                alt7=14;
                }
                break;
            case 45:
                {
                alt7=15;
                }
                break;
            case 46:
                {
                alt7=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalHouseBuilderV2.g:761:2: ( ( 'SIMPLE' ) )
                    {
                    // InternalHouseBuilderV2.g:761:2: ( ( 'SIMPLE' ) )
                    // InternalHouseBuilderV2.g:762:3: ( 'SIMPLE' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilderV2.g:763:3: ( 'SIMPLE' )
                    // InternalHouseBuilderV2.g:763:4: 'SIMPLE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:767:2: ( ( 'BATHROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:767:2: ( ( 'BATHROOM' ) )
                    // InternalHouseBuilderV2.g:768:3: ( 'BATHROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilderV2.g:769:3: ( 'BATHROOM' )
                    // InternalHouseBuilderV2.g:769:4: 'BATHROOM'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:773:2: ( ( 'LIVING_ROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:773:2: ( ( 'LIVING_ROOM' ) )
                    // InternalHouseBuilderV2.g:774:3: ( 'LIVING_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilderV2.g:775:3: ( 'LIVING_ROOM' )
                    // InternalHouseBuilderV2.g:775:4: 'LIVING_ROOM'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:779:2: ( ( 'BEDROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:779:2: ( ( 'BEDROOM' ) )
                    // InternalHouseBuilderV2.g:780:3: ( 'BEDROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3()); 
                    // InternalHouseBuilderV2.g:781:3: ( 'BEDROOM' )
                    // InternalHouseBuilderV2.g:781:4: 'BEDROOM'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:785:2: ( ( 'HALLWAY' ) )
                    {
                    // InternalHouseBuilderV2.g:785:2: ( ( 'HALLWAY' ) )
                    // InternalHouseBuilderV2.g:786:3: ( 'HALLWAY' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilderV2.g:787:3: ( 'HALLWAY' )
                    // InternalHouseBuilderV2.g:787:4: 'HALLWAY'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilderV2.g:791:2: ( ( 'STUDY' ) )
                    {
                    // InternalHouseBuilderV2.g:791:2: ( ( 'STUDY' ) )
                    // InternalHouseBuilderV2.g:792:3: ( 'STUDY' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5()); 
                    // InternalHouseBuilderV2.g:793:3: ( 'STUDY' )
                    // InternalHouseBuilderV2.g:793:4: 'STUDY'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilderV2.g:797:2: ( ( 'ENTRANCE' ) )
                    {
                    // InternalHouseBuilderV2.g:797:2: ( ( 'ENTRANCE' ) )
                    // InternalHouseBuilderV2.g:798:3: ( 'ENTRANCE' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6()); 
                    // InternalHouseBuilderV2.g:799:3: ( 'ENTRANCE' )
                    // InternalHouseBuilderV2.g:799:4: 'ENTRANCE'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHouseBuilderV2.g:803:2: ( ( 'STORAGE_ROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:803:2: ( ( 'STORAGE_ROOM' ) )
                    // InternalHouseBuilderV2.g:804:3: ( 'STORAGE_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7()); 
                    // InternalHouseBuilderV2.g:805:3: ( 'STORAGE_ROOM' )
                    // InternalHouseBuilderV2.g:805:4: 'STORAGE_ROOM'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHouseBuilderV2.g:809:2: ( ( 'GARAGE' ) )
                    {
                    // InternalHouseBuilderV2.g:809:2: ( ( 'GARAGE' ) )
                    // InternalHouseBuilderV2.g:810:3: ( 'GARAGE' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8()); 
                    // InternalHouseBuilderV2.g:811:3: ( 'GARAGE' )
                    // InternalHouseBuilderV2.g:811:4: 'GARAGE'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalHouseBuilderV2.g:815:2: ( ( 'LAUNDRY_ROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:815:2: ( ( 'LAUNDRY_ROOM' ) )
                    // InternalHouseBuilderV2.g:816:3: ( 'LAUNDRY_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9()); 
                    // InternalHouseBuilderV2.g:817:3: ( 'LAUNDRY_ROOM' )
                    // InternalHouseBuilderV2.g:817:4: 'LAUNDRY_ROOM'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalHouseBuilderV2.g:821:2: ( ( 'HOBBY_ROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:821:2: ( ( 'HOBBY_ROOM' ) )
                    // InternalHouseBuilderV2.g:822:3: ( 'HOBBY_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10()); 
                    // InternalHouseBuilderV2.g:823:3: ( 'HOBBY_ROOM' )
                    // InternalHouseBuilderV2.g:823:4: 'HOBBY_ROOM'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalHouseBuilderV2.g:827:2: ( ( 'CELLAR' ) )
                    {
                    // InternalHouseBuilderV2.g:827:2: ( ( 'CELLAR' ) )
                    // InternalHouseBuilderV2.g:828:3: ( 'CELLAR' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11()); 
                    // InternalHouseBuilderV2.g:829:3: ( 'CELLAR' )
                    // InternalHouseBuilderV2.g:829:4: 'CELLAR'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalHouseBuilderV2.g:833:2: ( ( 'LUNCHROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:833:2: ( ( 'LUNCHROOM' ) )
                    // InternalHouseBuilderV2.g:834:3: ( 'LUNCHROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12()); 
                    // InternalHouseBuilderV2.g:835:3: ( 'LUNCHROOM' )
                    // InternalHouseBuilderV2.g:835:4: 'LUNCHROOM'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalHouseBuilderV2.g:839:2: ( ( 'RUMPUS_ROOM' ) )
                    {
                    // InternalHouseBuilderV2.g:839:2: ( ( 'RUMPUS_ROOM' ) )
                    // InternalHouseBuilderV2.g:840:3: ( 'RUMPUS_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13()); 
                    // InternalHouseBuilderV2.g:841:3: ( 'RUMPUS_ROOM' )
                    // InternalHouseBuilderV2.g:841:4: 'RUMPUS_ROOM'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalHouseBuilderV2.g:845:2: ( ( 'STAIRS' ) )
                    {
                    // InternalHouseBuilderV2.g:845:2: ( ( 'STAIRS' ) )
                    // InternalHouseBuilderV2.g:846:3: ( 'STAIRS' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14()); 
                    // InternalHouseBuilderV2.g:847:3: ( 'STAIRS' )
                    // InternalHouseBuilderV2.g:847:4: 'STAIRS'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalHouseBuilderV2.g:851:2: ( ( 'KITCHEN' ) )
                    {
                    // InternalHouseBuilderV2.g:851:2: ( ( 'KITCHEN' ) )
                    // InternalHouseBuilderV2.g:852:3: ( 'KITCHEN' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15()); 
                    // InternalHouseBuilderV2.g:853:3: ( 'KITCHEN' )
                    // InternalHouseBuilderV2.g:853:4: 'KITCHEN'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomType__Alternatives"


    // $ANTLR start "rule__OuterSpaceType__Alternatives"
    // InternalHouseBuilderV2.g:861:1: rule__OuterSpaceType__Alternatives : ( ( ( 'BALCONY' ) ) | ( ( 'GARDEN' ) ) | ( ( 'TERRACE' ) ) );
    public final void rule__OuterSpaceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:865:1: ( ( ( 'BALCONY' ) ) | ( ( 'GARDEN' ) ) | ( ( 'TERRACE' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt8=1;
                }
                break;
            case 48:
                {
                alt8=2;
                }
                break;
            case 49:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHouseBuilderV2.g:866:2: ( ( 'BALCONY' ) )
                    {
                    // InternalHouseBuilderV2.g:866:2: ( ( 'BALCONY' ) )
                    // InternalHouseBuilderV2.g:867:3: ( 'BALCONY' )
                    {
                     before(grammarAccess.getOuterSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilderV2.g:868:3: ( 'BALCONY' )
                    // InternalHouseBuilderV2.g:868:4: 'BALCONY'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getOuterSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:872:2: ( ( 'GARDEN' ) )
                    {
                    // InternalHouseBuilderV2.g:872:2: ( ( 'GARDEN' ) )
                    // InternalHouseBuilderV2.g:873:3: ( 'GARDEN' )
                    {
                     before(grammarAccess.getOuterSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilderV2.g:874:3: ( 'GARDEN' )
                    // InternalHouseBuilderV2.g:874:4: 'GARDEN'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getOuterSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:878:2: ( ( 'TERRACE' ) )
                    {
                    // InternalHouseBuilderV2.g:878:2: ( ( 'TERRACE' ) )
                    // InternalHouseBuilderV2.g:879:3: ( 'TERRACE' )
                    {
                     before(grammarAccess.getOuterSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilderV2.g:880:3: ( 'TERRACE' )
                    // InternalHouseBuilderV2.g:880:4: 'TERRACE'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getOuterSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OuterSpaceType__Alternatives"


    // $ANTLR start "rule__GroundType__Alternatives"
    // InternalHouseBuilderV2.g:888:1: rule__GroundType__Alternatives : ( ( ( 'ASPALTH' ) ) | ( ( 'TERRAIN' ) ) | ( ( 'PAVING' ) ) );
    public final void rule__GroundType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:892:1: ( ( ( 'ASPALTH' ) ) | ( ( 'TERRAIN' ) ) | ( ( 'PAVING' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt9=1;
                }
                break;
            case 51:
                {
                alt9=2;
                }
                break;
            case 52:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalHouseBuilderV2.g:893:2: ( ( 'ASPALTH' ) )
                    {
                    // InternalHouseBuilderV2.g:893:2: ( ( 'ASPALTH' ) )
                    // InternalHouseBuilderV2.g:894:3: ( 'ASPALTH' )
                    {
                     before(grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilderV2.g:895:3: ( 'ASPALTH' )
                    // InternalHouseBuilderV2.g:895:4: 'ASPALTH'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:899:2: ( ( 'TERRAIN' ) )
                    {
                    // InternalHouseBuilderV2.g:899:2: ( ( 'TERRAIN' ) )
                    // InternalHouseBuilderV2.g:900:3: ( 'TERRAIN' )
                    {
                     before(grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilderV2.g:901:3: ( 'TERRAIN' )
                    // InternalHouseBuilderV2.g:901:4: 'TERRAIN'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:905:2: ( ( 'PAVING' ) )
                    {
                    // InternalHouseBuilderV2.g:905:2: ( ( 'PAVING' ) )
                    // InternalHouseBuilderV2.g:906:3: ( 'PAVING' )
                    {
                     before(grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilderV2.g:907:3: ( 'PAVING' )
                    // InternalHouseBuilderV2.g:907:4: 'PAVING'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundType__Alternatives"


    // $ANTLR start "rule__DoorType__Alternatives"
    // InternalHouseBuilderV2.g:915:1: rule__DoorType__Alternatives : ( ( ( 'SIMPLE' ) ) | ( ( 'DOOR_WINDOW' ) ) | ( ( 'PANIC_DOOR' ) ) | ( ( 'ENTRANCE_DOOR' ) ) | ( ( 'SLIDING_DOOR' ) ) | ( ( 'GATE' ) ) | ( ( 'EMPTY' ) ) );
    public final void rule__DoorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:919:1: ( ( ( 'SIMPLE' ) ) | ( ( 'DOOR_WINDOW' ) ) | ( ( 'PANIC_DOOR' ) ) | ( ( 'ENTRANCE_DOOR' ) ) | ( ( 'SLIDING_DOOR' ) ) | ( ( 'GATE' ) ) | ( ( 'EMPTY' ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 53:
                {
                alt10=2;
                }
                break;
            case 54:
                {
                alt10=3;
                }
                break;
            case 55:
                {
                alt10=4;
                }
                break;
            case 56:
                {
                alt10=5;
                }
                break;
            case 18:
                {
                alt10=6;
                }
                break;
            case 57:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHouseBuilderV2.g:920:2: ( ( 'SIMPLE' ) )
                    {
                    // InternalHouseBuilderV2.g:920:2: ( ( 'SIMPLE' ) )
                    // InternalHouseBuilderV2.g:921:3: ( 'SIMPLE' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilderV2.g:922:3: ( 'SIMPLE' )
                    // InternalHouseBuilderV2.g:922:4: 'SIMPLE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:926:2: ( ( 'DOOR_WINDOW' ) )
                    {
                    // InternalHouseBuilderV2.g:926:2: ( ( 'DOOR_WINDOW' ) )
                    // InternalHouseBuilderV2.g:927:3: ( 'DOOR_WINDOW' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilderV2.g:928:3: ( 'DOOR_WINDOW' )
                    // InternalHouseBuilderV2.g:928:4: 'DOOR_WINDOW'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:932:2: ( ( 'PANIC_DOOR' ) )
                    {
                    // InternalHouseBuilderV2.g:932:2: ( ( 'PANIC_DOOR' ) )
                    // InternalHouseBuilderV2.g:933:3: ( 'PANIC_DOOR' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2()); 
                    // InternalHouseBuilderV2.g:934:3: ( 'PANIC_DOOR' )
                    // InternalHouseBuilderV2.g:934:4: 'PANIC_DOOR'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:938:2: ( ( 'ENTRANCE_DOOR' ) )
                    {
                    // InternalHouseBuilderV2.g:938:2: ( ( 'ENTRANCE_DOOR' ) )
                    // InternalHouseBuilderV2.g:939:3: ( 'ENTRANCE_DOOR' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3()); 
                    // InternalHouseBuilderV2.g:940:3: ( 'ENTRANCE_DOOR' )
                    // InternalHouseBuilderV2.g:940:4: 'ENTRANCE_DOOR'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:944:2: ( ( 'SLIDING_DOOR' ) )
                    {
                    // InternalHouseBuilderV2.g:944:2: ( ( 'SLIDING_DOOR' ) )
                    // InternalHouseBuilderV2.g:945:3: ( 'SLIDING_DOOR' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4()); 
                    // InternalHouseBuilderV2.g:946:3: ( 'SLIDING_DOOR' )
                    // InternalHouseBuilderV2.g:946:4: 'SLIDING_DOOR'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilderV2.g:950:2: ( ( 'GATE' ) )
                    {
                    // InternalHouseBuilderV2.g:950:2: ( ( 'GATE' ) )
                    // InternalHouseBuilderV2.g:951:3: ( 'GATE' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5()); 
                    // InternalHouseBuilderV2.g:952:3: ( 'GATE' )
                    // InternalHouseBuilderV2.g:952:4: 'GATE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilderV2.g:956:2: ( ( 'EMPTY' ) )
                    {
                    // InternalHouseBuilderV2.g:956:2: ( ( 'EMPTY' ) )
                    // InternalHouseBuilderV2.g:957:3: ( 'EMPTY' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6()); 
                    // InternalHouseBuilderV2.g:958:3: ( 'EMPTY' )
                    // InternalHouseBuilderV2.g:958:4: 'EMPTY'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorType__Alternatives"


    // $ANTLR start "rule__House__Group__0"
    // InternalHouseBuilderV2.g:966:1: rule__House__Group__0 : rule__House__Group__0__Impl rule__House__Group__1 ;
    public final void rule__House__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:970:1: ( rule__House__Group__0__Impl rule__House__Group__1 )
            // InternalHouseBuilderV2.g:971:2: rule__House__Group__0__Impl rule__House__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__0"


    // $ANTLR start "rule__House__Group__0__Impl"
    // InternalHouseBuilderV2.g:978:1: rule__House__Group__0__Impl : ( 'House' ) ;
    public final void rule__House__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:982:1: ( ( 'House' ) )
            // InternalHouseBuilderV2.g:983:1: ( 'House' )
            {
            // InternalHouseBuilderV2.g:983:1: ( 'House' )
            // InternalHouseBuilderV2.g:984:2: 'House'
            {
             before(grammarAccess.getHouseAccess().getHouseKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getHouseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__0__Impl"


    // $ANTLR start "rule__House__Group__1"
    // InternalHouseBuilderV2.g:993:1: rule__House__Group__1 : rule__House__Group__1__Impl rule__House__Group__2 ;
    public final void rule__House__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:997:1: ( rule__House__Group__1__Impl rule__House__Group__2 )
            // InternalHouseBuilderV2.g:998:2: rule__House__Group__1__Impl rule__House__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__House__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__1"


    // $ANTLR start "rule__House__Group__1__Impl"
    // InternalHouseBuilderV2.g:1005:1: rule__House__Group__1__Impl : ( ( rule__House__NameAssignment_1 ) ) ;
    public final void rule__House__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1009:1: ( ( ( rule__House__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:1010:1: ( ( rule__House__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:1010:1: ( ( rule__House__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:1011:2: ( rule__House__NameAssignment_1 )
            {
             before(grammarAccess.getHouseAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:1012:2: ( rule__House__NameAssignment_1 )
            // InternalHouseBuilderV2.g:1012:3: rule__House__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__House__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__1__Impl"


    // $ANTLR start "rule__House__Group__2"
    // InternalHouseBuilderV2.g:1020:1: rule__House__Group__2 : rule__House__Group__2__Impl rule__House__Group__3 ;
    public final void rule__House__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1024:1: ( rule__House__Group__2__Impl rule__House__Group__3 )
            // InternalHouseBuilderV2.g:1025:2: rule__House__Group__2__Impl rule__House__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__2"


    // $ANTLR start "rule__House__Group__2__Impl"
    // InternalHouseBuilderV2.g:1032:1: rule__House__Group__2__Impl : ( '{' ) ;
    public final void rule__House__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1036:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:1037:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:1037:1: ( '{' )
            // InternalHouseBuilderV2.g:1038:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__2__Impl"


    // $ANTLR start "rule__House__Group__3"
    // InternalHouseBuilderV2.g:1047:1: rule__House__Group__3 : rule__House__Group__3__Impl rule__House__Group__4 ;
    public final void rule__House__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1051:1: ( rule__House__Group__3__Impl rule__House__Group__4 )
            // InternalHouseBuilderV2.g:1052:2: rule__House__Group__3__Impl rule__House__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__3"


    // $ANTLR start "rule__House__Group__3__Impl"
    // InternalHouseBuilderV2.g:1059:1: rule__House__Group__3__Impl : ( ( rule__House__Group_3__0 )? ) ;
    public final void rule__House__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1063:1: ( ( ( rule__House__Group_3__0 )? ) )
            // InternalHouseBuilderV2.g:1064:1: ( ( rule__House__Group_3__0 )? )
            {
            // InternalHouseBuilderV2.g:1064:1: ( ( rule__House__Group_3__0 )? )
            // InternalHouseBuilderV2.g:1065:2: ( rule__House__Group_3__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_3()); 
            // InternalHouseBuilderV2.g:1066:2: ( rule__House__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==63) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHouseBuilderV2.g:1066:3: rule__House__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__3__Impl"


    // $ANTLR start "rule__House__Group__4"
    // InternalHouseBuilderV2.g:1074:1: rule__House__Group__4 : rule__House__Group__4__Impl rule__House__Group__5 ;
    public final void rule__House__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1078:1: ( rule__House__Group__4__Impl rule__House__Group__5 )
            // InternalHouseBuilderV2.g:1079:2: rule__House__Group__4__Impl rule__House__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__4"


    // $ANTLR start "rule__House__Group__4__Impl"
    // InternalHouseBuilderV2.g:1086:1: rule__House__Group__4__Impl : ( ( rule__House__Group_4__0 )? ) ;
    public final void rule__House__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1090:1: ( ( ( rule__House__Group_4__0 )? ) )
            // InternalHouseBuilderV2.g:1091:1: ( ( rule__House__Group_4__0 )? )
            {
            // InternalHouseBuilderV2.g:1091:1: ( ( rule__House__Group_4__0 )? )
            // InternalHouseBuilderV2.g:1092:2: ( rule__House__Group_4__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_4()); 
            // InternalHouseBuilderV2.g:1093:2: ( rule__House__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==64) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHouseBuilderV2.g:1093:3: rule__House__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__4__Impl"


    // $ANTLR start "rule__House__Group__5"
    // InternalHouseBuilderV2.g:1101:1: rule__House__Group__5 : rule__House__Group__5__Impl rule__House__Group__6 ;
    public final void rule__House__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1105:1: ( rule__House__Group__5__Impl rule__House__Group__6 )
            // InternalHouseBuilderV2.g:1106:2: rule__House__Group__5__Impl rule__House__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__5"


    // $ANTLR start "rule__House__Group__5__Impl"
    // InternalHouseBuilderV2.g:1113:1: rule__House__Group__5__Impl : ( ( rule__House__Group_5__0 )? ) ;
    public final void rule__House__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1117:1: ( ( ( rule__House__Group_5__0 )? ) )
            // InternalHouseBuilderV2.g:1118:1: ( ( rule__House__Group_5__0 )? )
            {
            // InternalHouseBuilderV2.g:1118:1: ( ( rule__House__Group_5__0 )? )
            // InternalHouseBuilderV2.g:1119:2: ( rule__House__Group_5__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_5()); 
            // InternalHouseBuilderV2.g:1120:2: ( rule__House__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==65) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHouseBuilderV2.g:1120:3: rule__House__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__5__Impl"


    // $ANTLR start "rule__House__Group__6"
    // InternalHouseBuilderV2.g:1128:1: rule__House__Group__6 : rule__House__Group__6__Impl rule__House__Group__7 ;
    public final void rule__House__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1132:1: ( rule__House__Group__6__Impl rule__House__Group__7 )
            // InternalHouseBuilderV2.g:1133:2: rule__House__Group__6__Impl rule__House__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__6"


    // $ANTLR start "rule__House__Group__6__Impl"
    // InternalHouseBuilderV2.g:1140:1: rule__House__Group__6__Impl : ( ( rule__House__Group_6__0 )? ) ;
    public final void rule__House__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1144:1: ( ( ( rule__House__Group_6__0 )? ) )
            // InternalHouseBuilderV2.g:1145:1: ( ( rule__House__Group_6__0 )? )
            {
            // InternalHouseBuilderV2.g:1145:1: ( ( rule__House__Group_6__0 )? )
            // InternalHouseBuilderV2.g:1146:2: ( rule__House__Group_6__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_6()); 
            // InternalHouseBuilderV2.g:1147:2: ( rule__House__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==66) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHouseBuilderV2.g:1147:3: rule__House__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__6__Impl"


    // $ANTLR start "rule__House__Group__7"
    // InternalHouseBuilderV2.g:1155:1: rule__House__Group__7 : rule__House__Group__7__Impl rule__House__Group__8 ;
    public final void rule__House__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1159:1: ( rule__House__Group__7__Impl rule__House__Group__8 )
            // InternalHouseBuilderV2.g:1160:2: rule__House__Group__7__Impl rule__House__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__7"


    // $ANTLR start "rule__House__Group__7__Impl"
    // InternalHouseBuilderV2.g:1167:1: rule__House__Group__7__Impl : ( ( rule__House__Group_7__0 )? ) ;
    public final void rule__House__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1171:1: ( ( ( rule__House__Group_7__0 )? ) )
            // InternalHouseBuilderV2.g:1172:1: ( ( rule__House__Group_7__0 )? )
            {
            // InternalHouseBuilderV2.g:1172:1: ( ( rule__House__Group_7__0 )? )
            // InternalHouseBuilderV2.g:1173:2: ( rule__House__Group_7__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_7()); 
            // InternalHouseBuilderV2.g:1174:2: ( rule__House__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==67) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHouseBuilderV2.g:1174:3: rule__House__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__7__Impl"


    // $ANTLR start "rule__House__Group__8"
    // InternalHouseBuilderV2.g:1182:1: rule__House__Group__8 : rule__House__Group__8__Impl rule__House__Group__9 ;
    public final void rule__House__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1186:1: ( rule__House__Group__8__Impl rule__House__Group__9 )
            // InternalHouseBuilderV2.g:1187:2: rule__House__Group__8__Impl rule__House__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__8"


    // $ANTLR start "rule__House__Group__8__Impl"
    // InternalHouseBuilderV2.g:1194:1: rule__House__Group__8__Impl : ( ( rule__House__Group_8__0 )? ) ;
    public final void rule__House__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1198:1: ( ( ( rule__House__Group_8__0 )? ) )
            // InternalHouseBuilderV2.g:1199:1: ( ( rule__House__Group_8__0 )? )
            {
            // InternalHouseBuilderV2.g:1199:1: ( ( rule__House__Group_8__0 )? )
            // InternalHouseBuilderV2.g:1200:2: ( rule__House__Group_8__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_8()); 
            // InternalHouseBuilderV2.g:1201:2: ( rule__House__Group_8__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==68) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHouseBuilderV2.g:1201:3: rule__House__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__8__Impl"


    // $ANTLR start "rule__House__Group__9"
    // InternalHouseBuilderV2.g:1209:1: rule__House__Group__9 : rule__House__Group__9__Impl rule__House__Group__10 ;
    public final void rule__House__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1213:1: ( rule__House__Group__9__Impl rule__House__Group__10 )
            // InternalHouseBuilderV2.g:1214:2: rule__House__Group__9__Impl rule__House__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__House__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__9"


    // $ANTLR start "rule__House__Group__9__Impl"
    // InternalHouseBuilderV2.g:1221:1: rule__House__Group__9__Impl : ( 'floors' ) ;
    public final void rule__House__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1225:1: ( ( 'floors' ) )
            // InternalHouseBuilderV2.g:1226:1: ( 'floors' )
            {
            // InternalHouseBuilderV2.g:1226:1: ( 'floors' )
            // InternalHouseBuilderV2.g:1227:2: 'floors'
            {
             before(grammarAccess.getHouseAccess().getFloorsKeyword_9()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getFloorsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__9__Impl"


    // $ANTLR start "rule__House__Group__10"
    // InternalHouseBuilderV2.g:1236:1: rule__House__Group__10 : rule__House__Group__10__Impl rule__House__Group__11 ;
    public final void rule__House__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1240:1: ( rule__House__Group__10__Impl rule__House__Group__11 )
            // InternalHouseBuilderV2.g:1241:2: rule__House__Group__10__Impl rule__House__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__House__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__10"


    // $ANTLR start "rule__House__Group__10__Impl"
    // InternalHouseBuilderV2.g:1248:1: rule__House__Group__10__Impl : ( '{' ) ;
    public final void rule__House__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1252:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:1253:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:1253:1: ( '{' )
            // InternalHouseBuilderV2.g:1254:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__10__Impl"


    // $ANTLR start "rule__House__Group__11"
    // InternalHouseBuilderV2.g:1263:1: rule__House__Group__11 : rule__House__Group__11__Impl rule__House__Group__12 ;
    public final void rule__House__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1267:1: ( rule__House__Group__11__Impl rule__House__Group__12 )
            // InternalHouseBuilderV2.g:1268:2: rule__House__Group__11__Impl rule__House__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__11"


    // $ANTLR start "rule__House__Group__11__Impl"
    // InternalHouseBuilderV2.g:1275:1: rule__House__Group__11__Impl : ( ( rule__House__FloorsAssignment_11 ) ) ;
    public final void rule__House__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1279:1: ( ( ( rule__House__FloorsAssignment_11 ) ) )
            // InternalHouseBuilderV2.g:1280:1: ( ( rule__House__FloorsAssignment_11 ) )
            {
            // InternalHouseBuilderV2.g:1280:1: ( ( rule__House__FloorsAssignment_11 ) )
            // InternalHouseBuilderV2.g:1281:2: ( rule__House__FloorsAssignment_11 )
            {
             before(grammarAccess.getHouseAccess().getFloorsAssignment_11()); 
            // InternalHouseBuilderV2.g:1282:2: ( rule__House__FloorsAssignment_11 )
            // InternalHouseBuilderV2.g:1282:3: rule__House__FloorsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__House__FloorsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getFloorsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__11__Impl"


    // $ANTLR start "rule__House__Group__12"
    // InternalHouseBuilderV2.g:1290:1: rule__House__Group__12 : rule__House__Group__12__Impl rule__House__Group__13 ;
    public final void rule__House__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1294:1: ( rule__House__Group__12__Impl rule__House__Group__13 )
            // InternalHouseBuilderV2.g:1295:2: rule__House__Group__12__Impl rule__House__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__12"


    // $ANTLR start "rule__House__Group__12__Impl"
    // InternalHouseBuilderV2.g:1302:1: rule__House__Group__12__Impl : ( ( rule__House__Group_12__0 )* ) ;
    public final void rule__House__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1306:1: ( ( ( rule__House__Group_12__0 )* ) )
            // InternalHouseBuilderV2.g:1307:1: ( ( rule__House__Group_12__0 )* )
            {
            // InternalHouseBuilderV2.g:1307:1: ( ( rule__House__Group_12__0 )* )
            // InternalHouseBuilderV2.g:1308:2: ( rule__House__Group_12__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_12()); 
            // InternalHouseBuilderV2.g:1309:2: ( rule__House__Group_12__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==69) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:1309:3: rule__House__Group_12__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__12__Impl"


    // $ANTLR start "rule__House__Group__13"
    // InternalHouseBuilderV2.g:1317:1: rule__House__Group__13 : rule__House__Group__13__Impl rule__House__Group__14 ;
    public final void rule__House__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1321:1: ( rule__House__Group__13__Impl rule__House__Group__14 )
            // InternalHouseBuilderV2.g:1322:2: rule__House__Group__13__Impl rule__House__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__House__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__13"


    // $ANTLR start "rule__House__Group__13__Impl"
    // InternalHouseBuilderV2.g:1329:1: rule__House__Group__13__Impl : ( '}' ) ;
    public final void rule__House__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1333:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:1334:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:1334:1: ( '}' )
            // InternalHouseBuilderV2.g:1335:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_13()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__13__Impl"


    // $ANTLR start "rule__House__Group__14"
    // InternalHouseBuilderV2.g:1344:1: rule__House__Group__14 : rule__House__Group__14__Impl rule__House__Group__15 ;
    public final void rule__House__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1348:1: ( rule__House__Group__14__Impl rule__House__Group__15 )
            // InternalHouseBuilderV2.g:1349:2: rule__House__Group__14__Impl rule__House__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__House__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__14"


    // $ANTLR start "rule__House__Group__14__Impl"
    // InternalHouseBuilderV2.g:1356:1: rule__House__Group__14__Impl : ( ( rule__House__Group_14__0 )? ) ;
    public final void rule__House__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1360:1: ( ( ( rule__House__Group_14__0 )? ) )
            // InternalHouseBuilderV2.g:1361:1: ( ( rule__House__Group_14__0 )? )
            {
            // InternalHouseBuilderV2.g:1361:1: ( ( rule__House__Group_14__0 )? )
            // InternalHouseBuilderV2.g:1362:2: ( rule__House__Group_14__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_14()); 
            // InternalHouseBuilderV2.g:1363:2: ( rule__House__Group_14__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==70) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHouseBuilderV2.g:1363:3: rule__House__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__14__Impl"


    // $ANTLR start "rule__House__Group__15"
    // InternalHouseBuilderV2.g:1371:1: rule__House__Group__15 : rule__House__Group__15__Impl rule__House__Group__16 ;
    public final void rule__House__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1375:1: ( rule__House__Group__15__Impl rule__House__Group__16 )
            // InternalHouseBuilderV2.g:1376:2: rule__House__Group__15__Impl rule__House__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__House__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__15"


    // $ANTLR start "rule__House__Group__15__Impl"
    // InternalHouseBuilderV2.g:1383:1: rule__House__Group__15__Impl : ( ( rule__House__Group_15__0 )? ) ;
    public final void rule__House__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1387:1: ( ( ( rule__House__Group_15__0 )? ) )
            // InternalHouseBuilderV2.g:1388:1: ( ( rule__House__Group_15__0 )? )
            {
            // InternalHouseBuilderV2.g:1388:1: ( ( rule__House__Group_15__0 )? )
            // InternalHouseBuilderV2.g:1389:2: ( rule__House__Group_15__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_15()); 
            // InternalHouseBuilderV2.g:1390:2: ( rule__House__Group_15__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==71) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHouseBuilderV2.g:1390:3: rule__House__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__15__Impl"


    // $ANTLR start "rule__House__Group__16"
    // InternalHouseBuilderV2.g:1398:1: rule__House__Group__16 : rule__House__Group__16__Impl rule__House__Group__17 ;
    public final void rule__House__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1402:1: ( rule__House__Group__16__Impl rule__House__Group__17 )
            // InternalHouseBuilderV2.g:1403:2: rule__House__Group__16__Impl rule__House__Group__17
            {
            pushFollow(FOLLOW_4);
            rule__House__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__16"


    // $ANTLR start "rule__House__Group__16__Impl"
    // InternalHouseBuilderV2.g:1410:1: rule__House__Group__16__Impl : ( 'entrances' ) ;
    public final void rule__House__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1414:1: ( ( 'entrances' ) )
            // InternalHouseBuilderV2.g:1415:1: ( 'entrances' )
            {
            // InternalHouseBuilderV2.g:1415:1: ( 'entrances' )
            // InternalHouseBuilderV2.g:1416:2: 'entrances'
            {
             before(grammarAccess.getHouseAccess().getEntrancesKeyword_16()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getEntrancesKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__16__Impl"


    // $ANTLR start "rule__House__Group__17"
    // InternalHouseBuilderV2.g:1425:1: rule__House__Group__17 : rule__House__Group__17__Impl rule__House__Group__18 ;
    public final void rule__House__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1429:1: ( rule__House__Group__17__Impl rule__House__Group__18 )
            // InternalHouseBuilderV2.g:1430:2: rule__House__Group__17__Impl rule__House__Group__18
            {
            pushFollow(FOLLOW_10);
            rule__House__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__17"


    // $ANTLR start "rule__House__Group__17__Impl"
    // InternalHouseBuilderV2.g:1437:1: rule__House__Group__17__Impl : ( '{' ) ;
    public final void rule__House__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1441:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:1442:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:1442:1: ( '{' )
            // InternalHouseBuilderV2.g:1443:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_17()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__17__Impl"


    // $ANTLR start "rule__House__Group__18"
    // InternalHouseBuilderV2.g:1452:1: rule__House__Group__18 : rule__House__Group__18__Impl rule__House__Group__19 ;
    public final void rule__House__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1456:1: ( rule__House__Group__18__Impl rule__House__Group__19 )
            // InternalHouseBuilderV2.g:1457:2: rule__House__Group__18__Impl rule__House__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__18"


    // $ANTLR start "rule__House__Group__18__Impl"
    // InternalHouseBuilderV2.g:1464:1: rule__House__Group__18__Impl : ( ( rule__House__EntrancesAssignment_18 ) ) ;
    public final void rule__House__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1468:1: ( ( ( rule__House__EntrancesAssignment_18 ) ) )
            // InternalHouseBuilderV2.g:1469:1: ( ( rule__House__EntrancesAssignment_18 ) )
            {
            // InternalHouseBuilderV2.g:1469:1: ( ( rule__House__EntrancesAssignment_18 ) )
            // InternalHouseBuilderV2.g:1470:2: ( rule__House__EntrancesAssignment_18 )
            {
             before(grammarAccess.getHouseAccess().getEntrancesAssignment_18()); 
            // InternalHouseBuilderV2.g:1471:2: ( rule__House__EntrancesAssignment_18 )
            // InternalHouseBuilderV2.g:1471:3: rule__House__EntrancesAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__House__EntrancesAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getEntrancesAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__18__Impl"


    // $ANTLR start "rule__House__Group__19"
    // InternalHouseBuilderV2.g:1479:1: rule__House__Group__19 : rule__House__Group__19__Impl rule__House__Group__20 ;
    public final void rule__House__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1483:1: ( rule__House__Group__19__Impl rule__House__Group__20 )
            // InternalHouseBuilderV2.g:1484:2: rule__House__Group__19__Impl rule__House__Group__20
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__19"


    // $ANTLR start "rule__House__Group__19__Impl"
    // InternalHouseBuilderV2.g:1491:1: rule__House__Group__19__Impl : ( ( rule__House__Group_19__0 )* ) ;
    public final void rule__House__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1495:1: ( ( ( rule__House__Group_19__0 )* ) )
            // InternalHouseBuilderV2.g:1496:1: ( ( rule__House__Group_19__0 )* )
            {
            // InternalHouseBuilderV2.g:1496:1: ( ( rule__House__Group_19__0 )* )
            // InternalHouseBuilderV2.g:1497:2: ( rule__House__Group_19__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_19()); 
            // InternalHouseBuilderV2.g:1498:2: ( rule__House__Group_19__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==69) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:1498:3: rule__House__Group_19__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_19__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__19__Impl"


    // $ANTLR start "rule__House__Group__20"
    // InternalHouseBuilderV2.g:1506:1: rule__House__Group__20 : rule__House__Group__20__Impl rule__House__Group__21 ;
    public final void rule__House__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1510:1: ( rule__House__Group__20__Impl rule__House__Group__21 )
            // InternalHouseBuilderV2.g:1511:2: rule__House__Group__20__Impl rule__House__Group__21
            {
            pushFollow(FOLLOW_11);
            rule__House__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__20"


    // $ANTLR start "rule__House__Group__20__Impl"
    // InternalHouseBuilderV2.g:1518:1: rule__House__Group__20__Impl : ( '}' ) ;
    public final void rule__House__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1522:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:1523:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:1523:1: ( '}' )
            // InternalHouseBuilderV2.g:1524:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_20()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__20__Impl"


    // $ANTLR start "rule__House__Group__21"
    // InternalHouseBuilderV2.g:1533:1: rule__House__Group__21 : rule__House__Group__21__Impl ;
    public final void rule__House__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1537:1: ( rule__House__Group__21__Impl )
            // InternalHouseBuilderV2.g:1538:2: rule__House__Group__21__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group__21__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__21"


    // $ANTLR start "rule__House__Group__21__Impl"
    // InternalHouseBuilderV2.g:1544:1: rule__House__Group__21__Impl : ( '}' ) ;
    public final void rule__House__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1548:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:1549:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:1549:1: ( '}' )
            // InternalHouseBuilderV2.g:1550:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_21()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__21__Impl"


    // $ANTLR start "rule__House__Group_3__0"
    // InternalHouseBuilderV2.g:1560:1: rule__House__Group_3__0 : rule__House__Group_3__0__Impl rule__House__Group_3__1 ;
    public final void rule__House__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1564:1: ( rule__House__Group_3__0__Impl rule__House__Group_3__1 )
            // InternalHouseBuilderV2.g:1565:2: rule__House__Group_3__0__Impl rule__House__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__0"


    // $ANTLR start "rule__House__Group_3__0__Impl"
    // InternalHouseBuilderV2.g:1572:1: rule__House__Group_3__0__Impl : ( 'state' ) ;
    public final void rule__House__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1576:1: ( ( 'state' ) )
            // InternalHouseBuilderV2.g:1577:1: ( 'state' )
            {
            // InternalHouseBuilderV2.g:1577:1: ( 'state' )
            // InternalHouseBuilderV2.g:1578:2: 'state'
            {
             before(grammarAccess.getHouseAccess().getStateKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getStateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__0__Impl"


    // $ANTLR start "rule__House__Group_3__1"
    // InternalHouseBuilderV2.g:1587:1: rule__House__Group_3__1 : rule__House__Group_3__1__Impl ;
    public final void rule__House__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1591:1: ( rule__House__Group_3__1__Impl )
            // InternalHouseBuilderV2.g:1592:2: rule__House__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__1"


    // $ANTLR start "rule__House__Group_3__1__Impl"
    // InternalHouseBuilderV2.g:1598:1: rule__House__Group_3__1__Impl : ( ( rule__House__StateAssignment_3_1 ) ) ;
    public final void rule__House__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1602:1: ( ( ( rule__House__StateAssignment_3_1 ) ) )
            // InternalHouseBuilderV2.g:1603:1: ( ( rule__House__StateAssignment_3_1 ) )
            {
            // InternalHouseBuilderV2.g:1603:1: ( ( rule__House__StateAssignment_3_1 ) )
            // InternalHouseBuilderV2.g:1604:2: ( rule__House__StateAssignment_3_1 )
            {
             before(grammarAccess.getHouseAccess().getStateAssignment_3_1()); 
            // InternalHouseBuilderV2.g:1605:2: ( rule__House__StateAssignment_3_1 )
            // InternalHouseBuilderV2.g:1605:3: rule__House__StateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__House__StateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getStateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__1__Impl"


    // $ANTLR start "rule__House__Group_4__0"
    // InternalHouseBuilderV2.g:1614:1: rule__House__Group_4__0 : rule__House__Group_4__0__Impl rule__House__Group_4__1 ;
    public final void rule__House__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1618:1: ( rule__House__Group_4__0__Impl rule__House__Group_4__1 )
            // InternalHouseBuilderV2.g:1619:2: rule__House__Group_4__0__Impl rule__House__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__0"


    // $ANTLR start "rule__House__Group_4__0__Impl"
    // InternalHouseBuilderV2.g:1626:1: rule__House__Group_4__0__Impl : ( 'province' ) ;
    public final void rule__House__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1630:1: ( ( 'province' ) )
            // InternalHouseBuilderV2.g:1631:1: ( 'province' )
            {
            // InternalHouseBuilderV2.g:1631:1: ( 'province' )
            // InternalHouseBuilderV2.g:1632:2: 'province'
            {
             before(grammarAccess.getHouseAccess().getProvinceKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getProvinceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__0__Impl"


    // $ANTLR start "rule__House__Group_4__1"
    // InternalHouseBuilderV2.g:1641:1: rule__House__Group_4__1 : rule__House__Group_4__1__Impl ;
    public final void rule__House__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1645:1: ( rule__House__Group_4__1__Impl )
            // InternalHouseBuilderV2.g:1646:2: rule__House__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__1"


    // $ANTLR start "rule__House__Group_4__1__Impl"
    // InternalHouseBuilderV2.g:1652:1: rule__House__Group_4__1__Impl : ( ( rule__House__ProvinceAssignment_4_1 ) ) ;
    public final void rule__House__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1656:1: ( ( ( rule__House__ProvinceAssignment_4_1 ) ) )
            // InternalHouseBuilderV2.g:1657:1: ( ( rule__House__ProvinceAssignment_4_1 ) )
            {
            // InternalHouseBuilderV2.g:1657:1: ( ( rule__House__ProvinceAssignment_4_1 ) )
            // InternalHouseBuilderV2.g:1658:2: ( rule__House__ProvinceAssignment_4_1 )
            {
             before(grammarAccess.getHouseAccess().getProvinceAssignment_4_1()); 
            // InternalHouseBuilderV2.g:1659:2: ( rule__House__ProvinceAssignment_4_1 )
            // InternalHouseBuilderV2.g:1659:3: rule__House__ProvinceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__House__ProvinceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getProvinceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__1__Impl"


    // $ANTLR start "rule__House__Group_5__0"
    // InternalHouseBuilderV2.g:1668:1: rule__House__Group_5__0 : rule__House__Group_5__0__Impl rule__House__Group_5__1 ;
    public final void rule__House__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1672:1: ( rule__House__Group_5__0__Impl rule__House__Group_5__1 )
            // InternalHouseBuilderV2.g:1673:2: rule__House__Group_5__0__Impl rule__House__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__0"


    // $ANTLR start "rule__House__Group_5__0__Impl"
    // InternalHouseBuilderV2.g:1680:1: rule__House__Group_5__0__Impl : ( 'city' ) ;
    public final void rule__House__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1684:1: ( ( 'city' ) )
            // InternalHouseBuilderV2.g:1685:1: ( 'city' )
            {
            // InternalHouseBuilderV2.g:1685:1: ( 'city' )
            // InternalHouseBuilderV2.g:1686:2: 'city'
            {
             before(grammarAccess.getHouseAccess().getCityKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__0__Impl"


    // $ANTLR start "rule__House__Group_5__1"
    // InternalHouseBuilderV2.g:1695:1: rule__House__Group_5__1 : rule__House__Group_5__1__Impl ;
    public final void rule__House__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1699:1: ( rule__House__Group_5__1__Impl )
            // InternalHouseBuilderV2.g:1700:2: rule__House__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__1"


    // $ANTLR start "rule__House__Group_5__1__Impl"
    // InternalHouseBuilderV2.g:1706:1: rule__House__Group_5__1__Impl : ( ( rule__House__CityAssignment_5_1 ) ) ;
    public final void rule__House__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1710:1: ( ( ( rule__House__CityAssignment_5_1 ) ) )
            // InternalHouseBuilderV2.g:1711:1: ( ( rule__House__CityAssignment_5_1 ) )
            {
            // InternalHouseBuilderV2.g:1711:1: ( ( rule__House__CityAssignment_5_1 ) )
            // InternalHouseBuilderV2.g:1712:2: ( rule__House__CityAssignment_5_1 )
            {
             before(grammarAccess.getHouseAccess().getCityAssignment_5_1()); 
            // InternalHouseBuilderV2.g:1713:2: ( rule__House__CityAssignment_5_1 )
            // InternalHouseBuilderV2.g:1713:3: rule__House__CityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__House__CityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getCityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__1__Impl"


    // $ANTLR start "rule__House__Group_6__0"
    // InternalHouseBuilderV2.g:1722:1: rule__House__Group_6__0 : rule__House__Group_6__0__Impl rule__House__Group_6__1 ;
    public final void rule__House__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1726:1: ( rule__House__Group_6__0__Impl rule__House__Group_6__1 )
            // InternalHouseBuilderV2.g:1727:2: rule__House__Group_6__0__Impl rule__House__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__0"


    // $ANTLR start "rule__House__Group_6__0__Impl"
    // InternalHouseBuilderV2.g:1734:1: rule__House__Group_6__0__Impl : ( 'postalCode' ) ;
    public final void rule__House__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1738:1: ( ( 'postalCode' ) )
            // InternalHouseBuilderV2.g:1739:1: ( 'postalCode' )
            {
            // InternalHouseBuilderV2.g:1739:1: ( 'postalCode' )
            // InternalHouseBuilderV2.g:1740:2: 'postalCode'
            {
             before(grammarAccess.getHouseAccess().getPostalCodeKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getPostalCodeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__0__Impl"


    // $ANTLR start "rule__House__Group_6__1"
    // InternalHouseBuilderV2.g:1749:1: rule__House__Group_6__1 : rule__House__Group_6__1__Impl ;
    public final void rule__House__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1753:1: ( rule__House__Group_6__1__Impl )
            // InternalHouseBuilderV2.g:1754:2: rule__House__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__1"


    // $ANTLR start "rule__House__Group_6__1__Impl"
    // InternalHouseBuilderV2.g:1760:1: rule__House__Group_6__1__Impl : ( ( rule__House__PostalCodeAssignment_6_1 ) ) ;
    public final void rule__House__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1764:1: ( ( ( rule__House__PostalCodeAssignment_6_1 ) ) )
            // InternalHouseBuilderV2.g:1765:1: ( ( rule__House__PostalCodeAssignment_6_1 ) )
            {
            // InternalHouseBuilderV2.g:1765:1: ( ( rule__House__PostalCodeAssignment_6_1 ) )
            // InternalHouseBuilderV2.g:1766:2: ( rule__House__PostalCodeAssignment_6_1 )
            {
             before(grammarAccess.getHouseAccess().getPostalCodeAssignment_6_1()); 
            // InternalHouseBuilderV2.g:1767:2: ( rule__House__PostalCodeAssignment_6_1 )
            // InternalHouseBuilderV2.g:1767:3: rule__House__PostalCodeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__House__PostalCodeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getPostalCodeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__1__Impl"


    // $ANTLR start "rule__House__Group_7__0"
    // InternalHouseBuilderV2.g:1776:1: rule__House__Group_7__0 : rule__House__Group_7__0__Impl rule__House__Group_7__1 ;
    public final void rule__House__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1780:1: ( rule__House__Group_7__0__Impl rule__House__Group_7__1 )
            // InternalHouseBuilderV2.g:1781:2: rule__House__Group_7__0__Impl rule__House__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__0"


    // $ANTLR start "rule__House__Group_7__0__Impl"
    // InternalHouseBuilderV2.g:1788:1: rule__House__Group_7__0__Impl : ( 'address' ) ;
    public final void rule__House__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1792:1: ( ( 'address' ) )
            // InternalHouseBuilderV2.g:1793:1: ( 'address' )
            {
            // InternalHouseBuilderV2.g:1793:1: ( 'address' )
            // InternalHouseBuilderV2.g:1794:2: 'address'
            {
             before(grammarAccess.getHouseAccess().getAddressKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getAddressKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__0__Impl"


    // $ANTLR start "rule__House__Group_7__1"
    // InternalHouseBuilderV2.g:1803:1: rule__House__Group_7__1 : rule__House__Group_7__1__Impl ;
    public final void rule__House__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1807:1: ( rule__House__Group_7__1__Impl )
            // InternalHouseBuilderV2.g:1808:2: rule__House__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__1"


    // $ANTLR start "rule__House__Group_7__1__Impl"
    // InternalHouseBuilderV2.g:1814:1: rule__House__Group_7__1__Impl : ( ( rule__House__AddressAssignment_7_1 ) ) ;
    public final void rule__House__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1818:1: ( ( ( rule__House__AddressAssignment_7_1 ) ) )
            // InternalHouseBuilderV2.g:1819:1: ( ( rule__House__AddressAssignment_7_1 ) )
            {
            // InternalHouseBuilderV2.g:1819:1: ( ( rule__House__AddressAssignment_7_1 ) )
            // InternalHouseBuilderV2.g:1820:2: ( rule__House__AddressAssignment_7_1 )
            {
             before(grammarAccess.getHouseAccess().getAddressAssignment_7_1()); 
            // InternalHouseBuilderV2.g:1821:2: ( rule__House__AddressAssignment_7_1 )
            // InternalHouseBuilderV2.g:1821:3: rule__House__AddressAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__House__AddressAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getAddressAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__1__Impl"


    // $ANTLR start "rule__House__Group_8__0"
    // InternalHouseBuilderV2.g:1830:1: rule__House__Group_8__0 : rule__House__Group_8__0__Impl rule__House__Group_8__1 ;
    public final void rule__House__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1834:1: ( rule__House__Group_8__0__Impl rule__House__Group_8__1 )
            // InternalHouseBuilderV2.g:1835:2: rule__House__Group_8__0__Impl rule__House__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__House__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__0"


    // $ANTLR start "rule__House__Group_8__0__Impl"
    // InternalHouseBuilderV2.g:1842:1: rule__House__Group_8__0__Impl : ( 'buildingDate' ) ;
    public final void rule__House__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1846:1: ( ( 'buildingDate' ) )
            // InternalHouseBuilderV2.g:1847:1: ( 'buildingDate' )
            {
            // InternalHouseBuilderV2.g:1847:1: ( 'buildingDate' )
            // InternalHouseBuilderV2.g:1848:2: 'buildingDate'
            {
             before(grammarAccess.getHouseAccess().getBuildingDateKeyword_8_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getBuildingDateKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__0__Impl"


    // $ANTLR start "rule__House__Group_8__1"
    // InternalHouseBuilderV2.g:1857:1: rule__House__Group_8__1 : rule__House__Group_8__1__Impl ;
    public final void rule__House__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1861:1: ( rule__House__Group_8__1__Impl )
            // InternalHouseBuilderV2.g:1862:2: rule__House__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__1"


    // $ANTLR start "rule__House__Group_8__1__Impl"
    // InternalHouseBuilderV2.g:1868:1: rule__House__Group_8__1__Impl : ( ( rule__House__BuildingDateAssignment_8_1 ) ) ;
    public final void rule__House__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1872:1: ( ( ( rule__House__BuildingDateAssignment_8_1 ) ) )
            // InternalHouseBuilderV2.g:1873:1: ( ( rule__House__BuildingDateAssignment_8_1 ) )
            {
            // InternalHouseBuilderV2.g:1873:1: ( ( rule__House__BuildingDateAssignment_8_1 ) )
            // InternalHouseBuilderV2.g:1874:2: ( rule__House__BuildingDateAssignment_8_1 )
            {
             before(grammarAccess.getHouseAccess().getBuildingDateAssignment_8_1()); 
            // InternalHouseBuilderV2.g:1875:2: ( rule__House__BuildingDateAssignment_8_1 )
            // InternalHouseBuilderV2.g:1875:3: rule__House__BuildingDateAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__House__BuildingDateAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getBuildingDateAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__1__Impl"


    // $ANTLR start "rule__House__Group_12__0"
    // InternalHouseBuilderV2.g:1884:1: rule__House__Group_12__0 : rule__House__Group_12__0__Impl rule__House__Group_12__1 ;
    public final void rule__House__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1888:1: ( rule__House__Group_12__0__Impl rule__House__Group_12__1 )
            // InternalHouseBuilderV2.g:1889:2: rule__House__Group_12__0__Impl rule__House__Group_12__1
            {
            pushFollow(FOLLOW_6);
            rule__House__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__0"


    // $ANTLR start "rule__House__Group_12__0__Impl"
    // InternalHouseBuilderV2.g:1896:1: rule__House__Group_12__0__Impl : ( ',' ) ;
    public final void rule__House__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1900:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:1901:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:1901:1: ( ',' )
            // InternalHouseBuilderV2.g:1902:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_12_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__0__Impl"


    // $ANTLR start "rule__House__Group_12__1"
    // InternalHouseBuilderV2.g:1911:1: rule__House__Group_12__1 : rule__House__Group_12__1__Impl ;
    public final void rule__House__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1915:1: ( rule__House__Group_12__1__Impl )
            // InternalHouseBuilderV2.g:1916:2: rule__House__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__1"


    // $ANTLR start "rule__House__Group_12__1__Impl"
    // InternalHouseBuilderV2.g:1922:1: rule__House__Group_12__1__Impl : ( ( rule__House__FloorsAssignment_12_1 ) ) ;
    public final void rule__House__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1926:1: ( ( ( rule__House__FloorsAssignment_12_1 ) ) )
            // InternalHouseBuilderV2.g:1927:1: ( ( rule__House__FloorsAssignment_12_1 ) )
            {
            // InternalHouseBuilderV2.g:1927:1: ( ( rule__House__FloorsAssignment_12_1 ) )
            // InternalHouseBuilderV2.g:1928:2: ( rule__House__FloorsAssignment_12_1 )
            {
             before(grammarAccess.getHouseAccess().getFloorsAssignment_12_1()); 
            // InternalHouseBuilderV2.g:1929:2: ( rule__House__FloorsAssignment_12_1 )
            // InternalHouseBuilderV2.g:1929:3: rule__House__FloorsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__House__FloorsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getFloorsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__1__Impl"


    // $ANTLR start "rule__House__Group_14__0"
    // InternalHouseBuilderV2.g:1938:1: rule__House__Group_14__0 : rule__House__Group_14__0__Impl rule__House__Group_14__1 ;
    public final void rule__House__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1942:1: ( rule__House__Group_14__0__Impl rule__House__Group_14__1 )
            // InternalHouseBuilderV2.g:1943:2: rule__House__Group_14__0__Impl rule__House__Group_14__1
            {
            pushFollow(FOLLOW_4);
            rule__House__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__0"


    // $ANTLR start "rule__House__Group_14__0__Impl"
    // InternalHouseBuilderV2.g:1950:1: rule__House__Group_14__0__Impl : ( 'passages' ) ;
    public final void rule__House__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1954:1: ( ( 'passages' ) )
            // InternalHouseBuilderV2.g:1955:1: ( 'passages' )
            {
            // InternalHouseBuilderV2.g:1955:1: ( 'passages' )
            // InternalHouseBuilderV2.g:1956:2: 'passages'
            {
             before(grammarAccess.getHouseAccess().getPassagesKeyword_14_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getPassagesKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__0__Impl"


    // $ANTLR start "rule__House__Group_14__1"
    // InternalHouseBuilderV2.g:1965:1: rule__House__Group_14__1 : rule__House__Group_14__1__Impl rule__House__Group_14__2 ;
    public final void rule__House__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1969:1: ( rule__House__Group_14__1__Impl rule__House__Group_14__2 )
            // InternalHouseBuilderV2.g:1970:2: rule__House__Group_14__1__Impl rule__House__Group_14__2
            {
            pushFollow(FOLLOW_13);
            rule__House__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__1"


    // $ANTLR start "rule__House__Group_14__1__Impl"
    // InternalHouseBuilderV2.g:1977:1: rule__House__Group_14__1__Impl : ( '{' ) ;
    public final void rule__House__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1981:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:1982:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:1982:1: ( '{' )
            // InternalHouseBuilderV2.g:1983:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_14_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__1__Impl"


    // $ANTLR start "rule__House__Group_14__2"
    // InternalHouseBuilderV2.g:1992:1: rule__House__Group_14__2 : rule__House__Group_14__2__Impl rule__House__Group_14__3 ;
    public final void rule__House__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:1996:1: ( rule__House__Group_14__2__Impl rule__House__Group_14__3 )
            // InternalHouseBuilderV2.g:1997:2: rule__House__Group_14__2__Impl rule__House__Group_14__3
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__2"


    // $ANTLR start "rule__House__Group_14__2__Impl"
    // InternalHouseBuilderV2.g:2004:1: rule__House__Group_14__2__Impl : ( ( rule__House__PassagesAssignment_14_2 ) ) ;
    public final void rule__House__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2008:1: ( ( ( rule__House__PassagesAssignment_14_2 ) ) )
            // InternalHouseBuilderV2.g:2009:1: ( ( rule__House__PassagesAssignment_14_2 ) )
            {
            // InternalHouseBuilderV2.g:2009:1: ( ( rule__House__PassagesAssignment_14_2 ) )
            // InternalHouseBuilderV2.g:2010:2: ( rule__House__PassagesAssignment_14_2 )
            {
             before(grammarAccess.getHouseAccess().getPassagesAssignment_14_2()); 
            // InternalHouseBuilderV2.g:2011:2: ( rule__House__PassagesAssignment_14_2 )
            // InternalHouseBuilderV2.g:2011:3: rule__House__PassagesAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__House__PassagesAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getPassagesAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__2__Impl"


    // $ANTLR start "rule__House__Group_14__3"
    // InternalHouseBuilderV2.g:2019:1: rule__House__Group_14__3 : rule__House__Group_14__3__Impl rule__House__Group_14__4 ;
    public final void rule__House__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2023:1: ( rule__House__Group_14__3__Impl rule__House__Group_14__4 )
            // InternalHouseBuilderV2.g:2024:2: rule__House__Group_14__3__Impl rule__House__Group_14__4
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__3"


    // $ANTLR start "rule__House__Group_14__3__Impl"
    // InternalHouseBuilderV2.g:2031:1: rule__House__Group_14__3__Impl : ( ( rule__House__Group_14_3__0 )* ) ;
    public final void rule__House__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2035:1: ( ( ( rule__House__Group_14_3__0 )* ) )
            // InternalHouseBuilderV2.g:2036:1: ( ( rule__House__Group_14_3__0 )* )
            {
            // InternalHouseBuilderV2.g:2036:1: ( ( rule__House__Group_14_3__0 )* )
            // InternalHouseBuilderV2.g:2037:2: ( rule__House__Group_14_3__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_14_3()); 
            // InternalHouseBuilderV2.g:2038:2: ( rule__House__Group_14_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==69) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:2038:3: rule__House__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__3__Impl"


    // $ANTLR start "rule__House__Group_14__4"
    // InternalHouseBuilderV2.g:2046:1: rule__House__Group_14__4 : rule__House__Group_14__4__Impl ;
    public final void rule__House__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2050:1: ( rule__House__Group_14__4__Impl )
            // InternalHouseBuilderV2.g:2051:2: rule__House__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__4"


    // $ANTLR start "rule__House__Group_14__4__Impl"
    // InternalHouseBuilderV2.g:2057:1: rule__House__Group_14__4__Impl : ( '}' ) ;
    public final void rule__House__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2061:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:2062:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:2062:1: ( '}' )
            // InternalHouseBuilderV2.g:2063:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_14_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14__4__Impl"


    // $ANTLR start "rule__House__Group_14_3__0"
    // InternalHouseBuilderV2.g:2073:1: rule__House__Group_14_3__0 : rule__House__Group_14_3__0__Impl rule__House__Group_14_3__1 ;
    public final void rule__House__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2077:1: ( rule__House__Group_14_3__0__Impl rule__House__Group_14_3__1 )
            // InternalHouseBuilderV2.g:2078:2: rule__House__Group_14_3__0__Impl rule__House__Group_14_3__1
            {
            pushFollow(FOLLOW_13);
            rule__House__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14_3__0"


    // $ANTLR start "rule__House__Group_14_3__0__Impl"
    // InternalHouseBuilderV2.g:2085:1: rule__House__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__House__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2089:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:2090:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:2090:1: ( ',' )
            // InternalHouseBuilderV2.g:2091:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_14_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14_3__0__Impl"


    // $ANTLR start "rule__House__Group_14_3__1"
    // InternalHouseBuilderV2.g:2100:1: rule__House__Group_14_3__1 : rule__House__Group_14_3__1__Impl ;
    public final void rule__House__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2104:1: ( rule__House__Group_14_3__1__Impl )
            // InternalHouseBuilderV2.g:2105:2: rule__House__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14_3__1"


    // $ANTLR start "rule__House__Group_14_3__1__Impl"
    // InternalHouseBuilderV2.g:2111:1: rule__House__Group_14_3__1__Impl : ( ( rule__House__PassagesAssignment_14_3_1 ) ) ;
    public final void rule__House__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2115:1: ( ( ( rule__House__PassagesAssignment_14_3_1 ) ) )
            // InternalHouseBuilderV2.g:2116:1: ( ( rule__House__PassagesAssignment_14_3_1 ) )
            {
            // InternalHouseBuilderV2.g:2116:1: ( ( rule__House__PassagesAssignment_14_3_1 ) )
            // InternalHouseBuilderV2.g:2117:2: ( rule__House__PassagesAssignment_14_3_1 )
            {
             before(grammarAccess.getHouseAccess().getPassagesAssignment_14_3_1()); 
            // InternalHouseBuilderV2.g:2118:2: ( rule__House__PassagesAssignment_14_3_1 )
            // InternalHouseBuilderV2.g:2118:3: rule__House__PassagesAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__House__PassagesAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getPassagesAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_14_3__1__Impl"


    // $ANTLR start "rule__House__Group_15__0"
    // InternalHouseBuilderV2.g:2127:1: rule__House__Group_15__0 : rule__House__Group_15__0__Impl rule__House__Group_15__1 ;
    public final void rule__House__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2131:1: ( rule__House__Group_15__0__Impl rule__House__Group_15__1 )
            // InternalHouseBuilderV2.g:2132:2: rule__House__Group_15__0__Impl rule__House__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__House__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__0"


    // $ANTLR start "rule__House__Group_15__0__Impl"
    // InternalHouseBuilderV2.g:2139:1: rule__House__Group_15__0__Impl : ( 'controllers' ) ;
    public final void rule__House__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2143:1: ( ( 'controllers' ) )
            // InternalHouseBuilderV2.g:2144:1: ( 'controllers' )
            {
            // InternalHouseBuilderV2.g:2144:1: ( 'controllers' )
            // InternalHouseBuilderV2.g:2145:2: 'controllers'
            {
             before(grammarAccess.getHouseAccess().getControllersKeyword_15_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getControllersKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__0__Impl"


    // $ANTLR start "rule__House__Group_15__1"
    // InternalHouseBuilderV2.g:2154:1: rule__House__Group_15__1 : rule__House__Group_15__1__Impl rule__House__Group_15__2 ;
    public final void rule__House__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2158:1: ( rule__House__Group_15__1__Impl rule__House__Group_15__2 )
            // InternalHouseBuilderV2.g:2159:2: rule__House__Group_15__1__Impl rule__House__Group_15__2
            {
            pushFollow(FOLLOW_14);
            rule__House__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__1"


    // $ANTLR start "rule__House__Group_15__1__Impl"
    // InternalHouseBuilderV2.g:2166:1: rule__House__Group_15__1__Impl : ( '{' ) ;
    public final void rule__House__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2170:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:2171:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:2171:1: ( '{' )
            // InternalHouseBuilderV2.g:2172:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_15_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__1__Impl"


    // $ANTLR start "rule__House__Group_15__2"
    // InternalHouseBuilderV2.g:2181:1: rule__House__Group_15__2 : rule__House__Group_15__2__Impl rule__House__Group_15__3 ;
    public final void rule__House__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2185:1: ( rule__House__Group_15__2__Impl rule__House__Group_15__3 )
            // InternalHouseBuilderV2.g:2186:2: rule__House__Group_15__2__Impl rule__House__Group_15__3
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__2"


    // $ANTLR start "rule__House__Group_15__2__Impl"
    // InternalHouseBuilderV2.g:2193:1: rule__House__Group_15__2__Impl : ( ( rule__House__ControllersAssignment_15_2 ) ) ;
    public final void rule__House__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2197:1: ( ( ( rule__House__ControllersAssignment_15_2 ) ) )
            // InternalHouseBuilderV2.g:2198:1: ( ( rule__House__ControllersAssignment_15_2 ) )
            {
            // InternalHouseBuilderV2.g:2198:1: ( ( rule__House__ControllersAssignment_15_2 ) )
            // InternalHouseBuilderV2.g:2199:2: ( rule__House__ControllersAssignment_15_2 )
            {
             before(grammarAccess.getHouseAccess().getControllersAssignment_15_2()); 
            // InternalHouseBuilderV2.g:2200:2: ( rule__House__ControllersAssignment_15_2 )
            // InternalHouseBuilderV2.g:2200:3: rule__House__ControllersAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__House__ControllersAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getControllersAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__2__Impl"


    // $ANTLR start "rule__House__Group_15__3"
    // InternalHouseBuilderV2.g:2208:1: rule__House__Group_15__3 : rule__House__Group_15__3__Impl rule__House__Group_15__4 ;
    public final void rule__House__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2212:1: ( rule__House__Group_15__3__Impl rule__House__Group_15__4 )
            // InternalHouseBuilderV2.g:2213:2: rule__House__Group_15__3__Impl rule__House__Group_15__4
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__3"


    // $ANTLR start "rule__House__Group_15__3__Impl"
    // InternalHouseBuilderV2.g:2220:1: rule__House__Group_15__3__Impl : ( ( rule__House__Group_15_3__0 )* ) ;
    public final void rule__House__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2224:1: ( ( ( rule__House__Group_15_3__0 )* ) )
            // InternalHouseBuilderV2.g:2225:1: ( ( rule__House__Group_15_3__0 )* )
            {
            // InternalHouseBuilderV2.g:2225:1: ( ( rule__House__Group_15_3__0 )* )
            // InternalHouseBuilderV2.g:2226:2: ( rule__House__Group_15_3__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_15_3()); 
            // InternalHouseBuilderV2.g:2227:2: ( rule__House__Group_15_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==69) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:2227:3: rule__House__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__3__Impl"


    // $ANTLR start "rule__House__Group_15__4"
    // InternalHouseBuilderV2.g:2235:1: rule__House__Group_15__4 : rule__House__Group_15__4__Impl ;
    public final void rule__House__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2239:1: ( rule__House__Group_15__4__Impl )
            // InternalHouseBuilderV2.g:2240:2: rule__House__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__4"


    // $ANTLR start "rule__House__Group_15__4__Impl"
    // InternalHouseBuilderV2.g:2246:1: rule__House__Group_15__4__Impl : ( '}' ) ;
    public final void rule__House__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2250:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:2251:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:2251:1: ( '}' )
            // InternalHouseBuilderV2.g:2252:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15__4__Impl"


    // $ANTLR start "rule__House__Group_15_3__0"
    // InternalHouseBuilderV2.g:2262:1: rule__House__Group_15_3__0 : rule__House__Group_15_3__0__Impl rule__House__Group_15_3__1 ;
    public final void rule__House__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2266:1: ( rule__House__Group_15_3__0__Impl rule__House__Group_15_3__1 )
            // InternalHouseBuilderV2.g:2267:2: rule__House__Group_15_3__0__Impl rule__House__Group_15_3__1
            {
            pushFollow(FOLLOW_14);
            rule__House__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_15_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15_3__0"


    // $ANTLR start "rule__House__Group_15_3__0__Impl"
    // InternalHouseBuilderV2.g:2274:1: rule__House__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__House__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2278:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:2279:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:2279:1: ( ',' )
            // InternalHouseBuilderV2.g:2280:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_15_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15_3__0__Impl"


    // $ANTLR start "rule__House__Group_15_3__1"
    // InternalHouseBuilderV2.g:2289:1: rule__House__Group_15_3__1 : rule__House__Group_15_3__1__Impl ;
    public final void rule__House__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2293:1: ( rule__House__Group_15_3__1__Impl )
            // InternalHouseBuilderV2.g:2294:2: rule__House__Group_15_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_15_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15_3__1"


    // $ANTLR start "rule__House__Group_15_3__1__Impl"
    // InternalHouseBuilderV2.g:2300:1: rule__House__Group_15_3__1__Impl : ( ( rule__House__ControllersAssignment_15_3_1 ) ) ;
    public final void rule__House__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2304:1: ( ( ( rule__House__ControllersAssignment_15_3_1 ) ) )
            // InternalHouseBuilderV2.g:2305:1: ( ( rule__House__ControllersAssignment_15_3_1 ) )
            {
            // InternalHouseBuilderV2.g:2305:1: ( ( rule__House__ControllersAssignment_15_3_1 ) )
            // InternalHouseBuilderV2.g:2306:2: ( rule__House__ControllersAssignment_15_3_1 )
            {
             before(grammarAccess.getHouseAccess().getControllersAssignment_15_3_1()); 
            // InternalHouseBuilderV2.g:2307:2: ( rule__House__ControllersAssignment_15_3_1 )
            // InternalHouseBuilderV2.g:2307:3: rule__House__ControllersAssignment_15_3_1
            {
            pushFollow(FOLLOW_2);
            rule__House__ControllersAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getControllersAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_15_3__1__Impl"


    // $ANTLR start "rule__House__Group_19__0"
    // InternalHouseBuilderV2.g:2316:1: rule__House__Group_19__0 : rule__House__Group_19__0__Impl rule__House__Group_19__1 ;
    public final void rule__House__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2320:1: ( rule__House__Group_19__0__Impl rule__House__Group_19__1 )
            // InternalHouseBuilderV2.g:2321:2: rule__House__Group_19__0__Impl rule__House__Group_19__1
            {
            pushFollow(FOLLOW_10);
            rule__House__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__0"


    // $ANTLR start "rule__House__Group_19__0__Impl"
    // InternalHouseBuilderV2.g:2328:1: rule__House__Group_19__0__Impl : ( ',' ) ;
    public final void rule__House__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2332:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:2333:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:2333:1: ( ',' )
            // InternalHouseBuilderV2.g:2334:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_19_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__0__Impl"


    // $ANTLR start "rule__House__Group_19__1"
    // InternalHouseBuilderV2.g:2343:1: rule__House__Group_19__1 : rule__House__Group_19__1__Impl ;
    public final void rule__House__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2347:1: ( rule__House__Group_19__1__Impl )
            // InternalHouseBuilderV2.g:2348:2: rule__House__Group_19__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_19__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__1"


    // $ANTLR start "rule__House__Group_19__1__Impl"
    // InternalHouseBuilderV2.g:2354:1: rule__House__Group_19__1__Impl : ( ( rule__House__EntrancesAssignment_19_1 ) ) ;
    public final void rule__House__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2358:1: ( ( ( rule__House__EntrancesAssignment_19_1 ) ) )
            // InternalHouseBuilderV2.g:2359:1: ( ( rule__House__EntrancesAssignment_19_1 ) )
            {
            // InternalHouseBuilderV2.g:2359:1: ( ( rule__House__EntrancesAssignment_19_1 ) )
            // InternalHouseBuilderV2.g:2360:2: ( rule__House__EntrancesAssignment_19_1 )
            {
             before(grammarAccess.getHouseAccess().getEntrancesAssignment_19_1()); 
            // InternalHouseBuilderV2.g:2361:2: ( rule__House__EntrancesAssignment_19_1 )
            // InternalHouseBuilderV2.g:2361:3: rule__House__EntrancesAssignment_19_1
            {
            pushFollow(FOLLOW_2);
            rule__House__EntrancesAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getEntrancesAssignment_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__1__Impl"


    // $ANTLR start "rule__Floor__Group__0"
    // InternalHouseBuilderV2.g:2370:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2374:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalHouseBuilderV2.g:2375:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Floor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0"


    // $ANTLR start "rule__Floor__Group__0__Impl"
    // InternalHouseBuilderV2.g:2382:1: rule__Floor__Group__0__Impl : ( 'Floor' ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2386:1: ( ( 'Floor' ) )
            // InternalHouseBuilderV2.g:2387:1: ( 'Floor' )
            {
            // InternalHouseBuilderV2.g:2387:1: ( 'Floor' )
            // InternalHouseBuilderV2.g:2388:2: 'Floor'
            {
             before(grammarAccess.getFloorAccess().getFloorKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getFloorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0__Impl"


    // $ANTLR start "rule__Floor__Group__1"
    // InternalHouseBuilderV2.g:2397:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2401:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalHouseBuilderV2.g:2402:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Floor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1"


    // $ANTLR start "rule__Floor__Group__1__Impl"
    // InternalHouseBuilderV2.g:2409:1: rule__Floor__Group__1__Impl : ( ( rule__Floor__NameAssignment_1 ) ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2413:1: ( ( ( rule__Floor__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:2414:1: ( ( rule__Floor__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:2414:1: ( ( rule__Floor__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:2415:2: ( rule__Floor__NameAssignment_1 )
            {
             before(grammarAccess.getFloorAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:2416:2: ( rule__Floor__NameAssignment_1 )
            // InternalHouseBuilderV2.g:2416:3: rule__Floor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1__Impl"


    // $ANTLR start "rule__Floor__Group__2"
    // InternalHouseBuilderV2.g:2424:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2428:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalHouseBuilderV2.g:2429:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Floor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2"


    // $ANTLR start "rule__Floor__Group__2__Impl"
    // InternalHouseBuilderV2.g:2436:1: rule__Floor__Group__2__Impl : ( '{' ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2440:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:2441:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:2441:1: ( '{' )
            // InternalHouseBuilderV2.g:2442:2: '{'
            {
             before(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2__Impl"


    // $ANTLR start "rule__Floor__Group__3"
    // InternalHouseBuilderV2.g:2451:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2455:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalHouseBuilderV2.g:2456:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Floor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3"


    // $ANTLR start "rule__Floor__Group__3__Impl"
    // InternalHouseBuilderV2.g:2463:1: rule__Floor__Group__3__Impl : ( 'level' ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2467:1: ( ( 'level' ) )
            // InternalHouseBuilderV2.g:2468:1: ( 'level' )
            {
            // InternalHouseBuilderV2.g:2468:1: ( 'level' )
            // InternalHouseBuilderV2.g:2469:2: 'level'
            {
             before(grammarAccess.getFloorAccess().getLevelKeyword_3()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLevelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3__Impl"


    // $ANTLR start "rule__Floor__Group__4"
    // InternalHouseBuilderV2.g:2478:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl rule__Floor__Group__5 ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2482:1: ( rule__Floor__Group__4__Impl rule__Floor__Group__5 )
            // InternalHouseBuilderV2.g:2483:2: rule__Floor__Group__4__Impl rule__Floor__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Floor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4"


    // $ANTLR start "rule__Floor__Group__4__Impl"
    // InternalHouseBuilderV2.g:2490:1: rule__Floor__Group__4__Impl : ( ( rule__Floor__LevelAssignment_4 ) ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2494:1: ( ( ( rule__Floor__LevelAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:2495:1: ( ( rule__Floor__LevelAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:2495:1: ( ( rule__Floor__LevelAssignment_4 ) )
            // InternalHouseBuilderV2.g:2496:2: ( rule__Floor__LevelAssignment_4 )
            {
             before(grammarAccess.getFloorAccess().getLevelAssignment_4()); 
            // InternalHouseBuilderV2.g:2497:2: ( rule__Floor__LevelAssignment_4 )
            // InternalHouseBuilderV2.g:2497:3: rule__Floor__LevelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Floor__LevelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getLevelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4__Impl"


    // $ANTLR start "rule__Floor__Group__5"
    // InternalHouseBuilderV2.g:2505:1: rule__Floor__Group__5 : rule__Floor__Group__5__Impl rule__Floor__Group__6 ;
    public final void rule__Floor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2509:1: ( rule__Floor__Group__5__Impl rule__Floor__Group__6 )
            // InternalHouseBuilderV2.g:2510:2: rule__Floor__Group__5__Impl rule__Floor__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Floor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5"


    // $ANTLR start "rule__Floor__Group__5__Impl"
    // InternalHouseBuilderV2.g:2517:1: rule__Floor__Group__5__Impl : ( 'spaces' ) ;
    public final void rule__Floor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2521:1: ( ( 'spaces' ) )
            // InternalHouseBuilderV2.g:2522:1: ( 'spaces' )
            {
            // InternalHouseBuilderV2.g:2522:1: ( 'spaces' )
            // InternalHouseBuilderV2.g:2523:2: 'spaces'
            {
             before(grammarAccess.getFloorAccess().getSpacesKeyword_5()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getSpacesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5__Impl"


    // $ANTLR start "rule__Floor__Group__6"
    // InternalHouseBuilderV2.g:2532:1: rule__Floor__Group__6 : rule__Floor__Group__6__Impl rule__Floor__Group__7 ;
    public final void rule__Floor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2536:1: ( rule__Floor__Group__6__Impl rule__Floor__Group__7 )
            // InternalHouseBuilderV2.g:2537:2: rule__Floor__Group__6__Impl rule__Floor__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Floor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__6"


    // $ANTLR start "rule__Floor__Group__6__Impl"
    // InternalHouseBuilderV2.g:2544:1: rule__Floor__Group__6__Impl : ( '{' ) ;
    public final void rule__Floor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2548:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:2549:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:2549:1: ( '{' )
            // InternalHouseBuilderV2.g:2550:2: '{'
            {
             before(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__6__Impl"


    // $ANTLR start "rule__Floor__Group__7"
    // InternalHouseBuilderV2.g:2559:1: rule__Floor__Group__7 : rule__Floor__Group__7__Impl rule__Floor__Group__8 ;
    public final void rule__Floor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2563:1: ( rule__Floor__Group__7__Impl rule__Floor__Group__8 )
            // InternalHouseBuilderV2.g:2564:2: rule__Floor__Group__7__Impl rule__Floor__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Floor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__7"


    // $ANTLR start "rule__Floor__Group__7__Impl"
    // InternalHouseBuilderV2.g:2571:1: rule__Floor__Group__7__Impl : ( ( rule__Floor__SpacesAssignment_7 ) ) ;
    public final void rule__Floor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2575:1: ( ( ( rule__Floor__SpacesAssignment_7 ) ) )
            // InternalHouseBuilderV2.g:2576:1: ( ( rule__Floor__SpacesAssignment_7 ) )
            {
            // InternalHouseBuilderV2.g:2576:1: ( ( rule__Floor__SpacesAssignment_7 ) )
            // InternalHouseBuilderV2.g:2577:2: ( rule__Floor__SpacesAssignment_7 )
            {
             before(grammarAccess.getFloorAccess().getSpacesAssignment_7()); 
            // InternalHouseBuilderV2.g:2578:2: ( rule__Floor__SpacesAssignment_7 )
            // InternalHouseBuilderV2.g:2578:3: rule__Floor__SpacesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Floor__SpacesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSpacesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__7__Impl"


    // $ANTLR start "rule__Floor__Group__8"
    // InternalHouseBuilderV2.g:2586:1: rule__Floor__Group__8 : rule__Floor__Group__8__Impl rule__Floor__Group__9 ;
    public final void rule__Floor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2590:1: ( rule__Floor__Group__8__Impl rule__Floor__Group__9 )
            // InternalHouseBuilderV2.g:2591:2: rule__Floor__Group__8__Impl rule__Floor__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Floor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__8"


    // $ANTLR start "rule__Floor__Group__8__Impl"
    // InternalHouseBuilderV2.g:2598:1: rule__Floor__Group__8__Impl : ( ( rule__Floor__Group_8__0 )* ) ;
    public final void rule__Floor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2602:1: ( ( ( rule__Floor__Group_8__0 )* ) )
            // InternalHouseBuilderV2.g:2603:1: ( ( rule__Floor__Group_8__0 )* )
            {
            // InternalHouseBuilderV2.g:2603:1: ( ( rule__Floor__Group_8__0 )* )
            // InternalHouseBuilderV2.g:2604:2: ( rule__Floor__Group_8__0 )*
            {
             before(grammarAccess.getFloorAccess().getGroup_8()); 
            // InternalHouseBuilderV2.g:2605:2: ( rule__Floor__Group_8__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==69) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:2605:3: rule__Floor__Group_8__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Floor__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFloorAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__8__Impl"


    // $ANTLR start "rule__Floor__Group__9"
    // InternalHouseBuilderV2.g:2613:1: rule__Floor__Group__9 : rule__Floor__Group__9__Impl rule__Floor__Group__10 ;
    public final void rule__Floor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2617:1: ( rule__Floor__Group__9__Impl rule__Floor__Group__10 )
            // InternalHouseBuilderV2.g:2618:2: rule__Floor__Group__9__Impl rule__Floor__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Floor__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__9"


    // $ANTLR start "rule__Floor__Group__9__Impl"
    // InternalHouseBuilderV2.g:2625:1: rule__Floor__Group__9__Impl : ( '}' ) ;
    public final void rule__Floor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2629:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:2630:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:2630:1: ( '}' )
            // InternalHouseBuilderV2.g:2631:2: '}'
            {
             before(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_9()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__9__Impl"


    // $ANTLR start "rule__Floor__Group__10"
    // InternalHouseBuilderV2.g:2640:1: rule__Floor__Group__10 : rule__Floor__Group__10__Impl ;
    public final void rule__Floor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2644:1: ( rule__Floor__Group__10__Impl )
            // InternalHouseBuilderV2.g:2645:2: rule__Floor__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__10"


    // $ANTLR start "rule__Floor__Group__10__Impl"
    // InternalHouseBuilderV2.g:2651:1: rule__Floor__Group__10__Impl : ( '}' ) ;
    public final void rule__Floor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2655:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:2656:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:2656:1: ( '}' )
            // InternalHouseBuilderV2.g:2657:2: '}'
            {
             before(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_10()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__10__Impl"


    // $ANTLR start "rule__Floor__Group_8__0"
    // InternalHouseBuilderV2.g:2667:1: rule__Floor__Group_8__0 : rule__Floor__Group_8__0__Impl rule__Floor__Group_8__1 ;
    public final void rule__Floor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2671:1: ( rule__Floor__Group_8__0__Impl rule__Floor__Group_8__1 )
            // InternalHouseBuilderV2.g:2672:2: rule__Floor__Group_8__0__Impl rule__Floor__Group_8__1
            {
            pushFollow(FOLLOW_18);
            rule__Floor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__0"


    // $ANTLR start "rule__Floor__Group_8__0__Impl"
    // InternalHouseBuilderV2.g:2679:1: rule__Floor__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Floor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2683:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:2684:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:2684:1: ( ',' )
            // InternalHouseBuilderV2.g:2685:2: ','
            {
             before(grammarAccess.getFloorAccess().getCommaKeyword_8_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__0__Impl"


    // $ANTLR start "rule__Floor__Group_8__1"
    // InternalHouseBuilderV2.g:2694:1: rule__Floor__Group_8__1 : rule__Floor__Group_8__1__Impl ;
    public final void rule__Floor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2698:1: ( rule__Floor__Group_8__1__Impl )
            // InternalHouseBuilderV2.g:2699:2: rule__Floor__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__1"


    // $ANTLR start "rule__Floor__Group_8__1__Impl"
    // InternalHouseBuilderV2.g:2705:1: rule__Floor__Group_8__1__Impl : ( ( rule__Floor__SpacesAssignment_8_1 ) ) ;
    public final void rule__Floor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2709:1: ( ( ( rule__Floor__SpacesAssignment_8_1 ) ) )
            // InternalHouseBuilderV2.g:2710:1: ( ( rule__Floor__SpacesAssignment_8_1 ) )
            {
            // InternalHouseBuilderV2.g:2710:1: ( ( rule__Floor__SpacesAssignment_8_1 ) )
            // InternalHouseBuilderV2.g:2711:2: ( rule__Floor__SpacesAssignment_8_1 )
            {
             before(grammarAccess.getFloorAccess().getSpacesAssignment_8_1()); 
            // InternalHouseBuilderV2.g:2712:2: ( rule__Floor__SpacesAssignment_8_1 )
            // InternalHouseBuilderV2.g:2712:3: rule__Floor__SpacesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__SpacesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSpacesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__1__Impl"


    // $ANTLR start "rule__Passage__Group__0"
    // InternalHouseBuilderV2.g:2721:1: rule__Passage__Group__0 : rule__Passage__Group__0__Impl rule__Passage__Group__1 ;
    public final void rule__Passage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2725:1: ( rule__Passage__Group__0__Impl rule__Passage__Group__1 )
            // InternalHouseBuilderV2.g:2726:2: rule__Passage__Group__0__Impl rule__Passage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Passage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__0"


    // $ANTLR start "rule__Passage__Group__0__Impl"
    // InternalHouseBuilderV2.g:2733:1: rule__Passage__Group__0__Impl : ( 'Passage' ) ;
    public final void rule__Passage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2737:1: ( ( 'Passage' ) )
            // InternalHouseBuilderV2.g:2738:1: ( 'Passage' )
            {
            // InternalHouseBuilderV2.g:2738:1: ( 'Passage' )
            // InternalHouseBuilderV2.g:2739:2: 'Passage'
            {
             before(grammarAccess.getPassageAccess().getPassageKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getPassageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__0__Impl"


    // $ANTLR start "rule__Passage__Group__1"
    // InternalHouseBuilderV2.g:2748:1: rule__Passage__Group__1 : rule__Passage__Group__1__Impl rule__Passage__Group__2 ;
    public final void rule__Passage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2752:1: ( rule__Passage__Group__1__Impl rule__Passage__Group__2 )
            // InternalHouseBuilderV2.g:2753:2: rule__Passage__Group__1__Impl rule__Passage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Passage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__1"


    // $ANTLR start "rule__Passage__Group__1__Impl"
    // InternalHouseBuilderV2.g:2760:1: rule__Passage__Group__1__Impl : ( ( rule__Passage__NameAssignment_1 ) ) ;
    public final void rule__Passage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2764:1: ( ( ( rule__Passage__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:2765:1: ( ( rule__Passage__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:2765:1: ( ( rule__Passage__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:2766:2: ( rule__Passage__NameAssignment_1 )
            {
             before(grammarAccess.getPassageAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:2767:2: ( rule__Passage__NameAssignment_1 )
            // InternalHouseBuilderV2.g:2767:3: rule__Passage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Passage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__1__Impl"


    // $ANTLR start "rule__Passage__Group__2"
    // InternalHouseBuilderV2.g:2775:1: rule__Passage__Group__2 : rule__Passage__Group__2__Impl rule__Passage__Group__3 ;
    public final void rule__Passage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2779:1: ( rule__Passage__Group__2__Impl rule__Passage__Group__3 )
            // InternalHouseBuilderV2.g:2780:2: rule__Passage__Group__2__Impl rule__Passage__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Passage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__2"


    // $ANTLR start "rule__Passage__Group__2__Impl"
    // InternalHouseBuilderV2.g:2787:1: rule__Passage__Group__2__Impl : ( '{' ) ;
    public final void rule__Passage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2791:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:2792:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:2792:1: ( '{' )
            // InternalHouseBuilderV2.g:2793:2: '{'
            {
             before(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__2__Impl"


    // $ANTLR start "rule__Passage__Group__3"
    // InternalHouseBuilderV2.g:2802:1: rule__Passage__Group__3 : rule__Passage__Group__3__Impl rule__Passage__Group__4 ;
    public final void rule__Passage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2806:1: ( rule__Passage__Group__3__Impl rule__Passage__Group__4 )
            // InternalHouseBuilderV2.g:2807:2: rule__Passage__Group__3__Impl rule__Passage__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Passage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__3"


    // $ANTLR start "rule__Passage__Group__3__Impl"
    // InternalHouseBuilderV2.g:2814:1: rule__Passage__Group__3__Impl : ( 'doorType' ) ;
    public final void rule__Passage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2818:1: ( ( 'doorType' ) )
            // InternalHouseBuilderV2.g:2819:1: ( 'doorType' )
            {
            // InternalHouseBuilderV2.g:2819:1: ( 'doorType' )
            // InternalHouseBuilderV2.g:2820:2: 'doorType'
            {
             before(grammarAccess.getPassageAccess().getDoorTypeKeyword_3()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getDoorTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__3__Impl"


    // $ANTLR start "rule__Passage__Group__4"
    // InternalHouseBuilderV2.g:2829:1: rule__Passage__Group__4 : rule__Passage__Group__4__Impl rule__Passage__Group__5 ;
    public final void rule__Passage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2833:1: ( rule__Passage__Group__4__Impl rule__Passage__Group__5 )
            // InternalHouseBuilderV2.g:2834:2: rule__Passage__Group__4__Impl rule__Passage__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Passage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__4"


    // $ANTLR start "rule__Passage__Group__4__Impl"
    // InternalHouseBuilderV2.g:2841:1: rule__Passage__Group__4__Impl : ( ( rule__Passage__DoorTypeAssignment_4 ) ) ;
    public final void rule__Passage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2845:1: ( ( ( rule__Passage__DoorTypeAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:2846:1: ( ( rule__Passage__DoorTypeAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:2846:1: ( ( rule__Passage__DoorTypeAssignment_4 ) )
            // InternalHouseBuilderV2.g:2847:2: ( rule__Passage__DoorTypeAssignment_4 )
            {
             before(grammarAccess.getPassageAccess().getDoorTypeAssignment_4()); 
            // InternalHouseBuilderV2.g:2848:2: ( rule__Passage__DoorTypeAssignment_4 )
            // InternalHouseBuilderV2.g:2848:3: rule__Passage__DoorTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DoorTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDoorTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__4__Impl"


    // $ANTLR start "rule__Passage__Group__5"
    // InternalHouseBuilderV2.g:2856:1: rule__Passage__Group__5 : rule__Passage__Group__5__Impl rule__Passage__Group__6 ;
    public final void rule__Passage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2860:1: ( rule__Passage__Group__5__Impl rule__Passage__Group__6 )
            // InternalHouseBuilderV2.g:2861:2: rule__Passage__Group__5__Impl rule__Passage__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Passage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__5"


    // $ANTLR start "rule__Passage__Group__5__Impl"
    // InternalHouseBuilderV2.g:2868:1: rule__Passage__Group__5__Impl : ( 'doorsNumber' ) ;
    public final void rule__Passage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2872:1: ( ( 'doorsNumber' ) )
            // InternalHouseBuilderV2.g:2873:1: ( 'doorsNumber' )
            {
            // InternalHouseBuilderV2.g:2873:1: ( 'doorsNumber' )
            // InternalHouseBuilderV2.g:2874:2: 'doorsNumber'
            {
             before(grammarAccess.getPassageAccess().getDoorsNumberKeyword_5()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getDoorsNumberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__5__Impl"


    // $ANTLR start "rule__Passage__Group__6"
    // InternalHouseBuilderV2.g:2883:1: rule__Passage__Group__6 : rule__Passage__Group__6__Impl rule__Passage__Group__7 ;
    public final void rule__Passage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2887:1: ( rule__Passage__Group__6__Impl rule__Passage__Group__7 )
            // InternalHouseBuilderV2.g:2888:2: rule__Passage__Group__6__Impl rule__Passage__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Passage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__6"


    // $ANTLR start "rule__Passage__Group__6__Impl"
    // InternalHouseBuilderV2.g:2895:1: rule__Passage__Group__6__Impl : ( ( rule__Passage__DoorsNumberAssignment_6 ) ) ;
    public final void rule__Passage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2899:1: ( ( ( rule__Passage__DoorsNumberAssignment_6 ) ) )
            // InternalHouseBuilderV2.g:2900:1: ( ( rule__Passage__DoorsNumberAssignment_6 ) )
            {
            // InternalHouseBuilderV2.g:2900:1: ( ( rule__Passage__DoorsNumberAssignment_6 ) )
            // InternalHouseBuilderV2.g:2901:2: ( rule__Passage__DoorsNumberAssignment_6 )
            {
             before(grammarAccess.getPassageAccess().getDoorsNumberAssignment_6()); 
            // InternalHouseBuilderV2.g:2902:2: ( rule__Passage__DoorsNumberAssignment_6 )
            // InternalHouseBuilderV2.g:2902:3: rule__Passage__DoorsNumberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DoorsNumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDoorsNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__6__Impl"


    // $ANTLR start "rule__Passage__Group__7"
    // InternalHouseBuilderV2.g:2910:1: rule__Passage__Group__7 : rule__Passage__Group__7__Impl rule__Passage__Group__8 ;
    public final void rule__Passage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2914:1: ( rule__Passage__Group__7__Impl rule__Passage__Group__8 )
            // InternalHouseBuilderV2.g:2915:2: rule__Passage__Group__7__Impl rule__Passage__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Passage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__7"


    // $ANTLR start "rule__Passage__Group__7__Impl"
    // InternalHouseBuilderV2.g:2922:1: rule__Passage__Group__7__Impl : ( 'width' ) ;
    public final void rule__Passage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2926:1: ( ( 'width' ) )
            // InternalHouseBuilderV2.g:2927:1: ( 'width' )
            {
            // InternalHouseBuilderV2.g:2927:1: ( 'width' )
            // InternalHouseBuilderV2.g:2928:2: 'width'
            {
             before(grammarAccess.getPassageAccess().getWidthKeyword_7()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getWidthKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__7__Impl"


    // $ANTLR start "rule__Passage__Group__8"
    // InternalHouseBuilderV2.g:2937:1: rule__Passage__Group__8 : rule__Passage__Group__8__Impl rule__Passage__Group__9 ;
    public final void rule__Passage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2941:1: ( rule__Passage__Group__8__Impl rule__Passage__Group__9 )
            // InternalHouseBuilderV2.g:2942:2: rule__Passage__Group__8__Impl rule__Passage__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Passage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__8"


    // $ANTLR start "rule__Passage__Group__8__Impl"
    // InternalHouseBuilderV2.g:2949:1: rule__Passage__Group__8__Impl : ( ( rule__Passage__WidthAssignment_8 ) ) ;
    public final void rule__Passage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2953:1: ( ( ( rule__Passage__WidthAssignment_8 ) ) )
            // InternalHouseBuilderV2.g:2954:1: ( ( rule__Passage__WidthAssignment_8 ) )
            {
            // InternalHouseBuilderV2.g:2954:1: ( ( rule__Passage__WidthAssignment_8 ) )
            // InternalHouseBuilderV2.g:2955:2: ( rule__Passage__WidthAssignment_8 )
            {
             before(grammarAccess.getPassageAccess().getWidthAssignment_8()); 
            // InternalHouseBuilderV2.g:2956:2: ( rule__Passage__WidthAssignment_8 )
            // InternalHouseBuilderV2.g:2956:3: rule__Passage__WidthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Passage__WidthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getWidthAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__8__Impl"


    // $ANTLR start "rule__Passage__Group__9"
    // InternalHouseBuilderV2.g:2964:1: rule__Passage__Group__9 : rule__Passage__Group__9__Impl rule__Passage__Group__10 ;
    public final void rule__Passage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2968:1: ( rule__Passage__Group__9__Impl rule__Passage__Group__10 )
            // InternalHouseBuilderV2.g:2969:2: rule__Passage__Group__9__Impl rule__Passage__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Passage__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__9"


    // $ANTLR start "rule__Passage__Group__9__Impl"
    // InternalHouseBuilderV2.g:2976:1: rule__Passage__Group__9__Impl : ( 'height' ) ;
    public final void rule__Passage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2980:1: ( ( 'height' ) )
            // InternalHouseBuilderV2.g:2981:1: ( 'height' )
            {
            // InternalHouseBuilderV2.g:2981:1: ( 'height' )
            // InternalHouseBuilderV2.g:2982:2: 'height'
            {
             before(grammarAccess.getPassageAccess().getHeightKeyword_9()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getHeightKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__9__Impl"


    // $ANTLR start "rule__Passage__Group__10"
    // InternalHouseBuilderV2.g:2991:1: rule__Passage__Group__10 : rule__Passage__Group__10__Impl rule__Passage__Group__11 ;
    public final void rule__Passage__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:2995:1: ( rule__Passage__Group__10__Impl rule__Passage__Group__11 )
            // InternalHouseBuilderV2.g:2996:2: rule__Passage__Group__10__Impl rule__Passage__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__Passage__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__10"


    // $ANTLR start "rule__Passage__Group__10__Impl"
    // InternalHouseBuilderV2.g:3003:1: rule__Passage__Group__10__Impl : ( ( rule__Passage__HeightAssignment_10 ) ) ;
    public final void rule__Passage__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3007:1: ( ( ( rule__Passage__HeightAssignment_10 ) ) )
            // InternalHouseBuilderV2.g:3008:1: ( ( rule__Passage__HeightAssignment_10 ) )
            {
            // InternalHouseBuilderV2.g:3008:1: ( ( rule__Passage__HeightAssignment_10 ) )
            // InternalHouseBuilderV2.g:3009:2: ( rule__Passage__HeightAssignment_10 )
            {
             before(grammarAccess.getPassageAccess().getHeightAssignment_10()); 
            // InternalHouseBuilderV2.g:3010:2: ( rule__Passage__HeightAssignment_10 )
            // InternalHouseBuilderV2.g:3010:3: rule__Passage__HeightAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Passage__HeightAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getHeightAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__10__Impl"


    // $ANTLR start "rule__Passage__Group__11"
    // InternalHouseBuilderV2.g:3018:1: rule__Passage__Group__11 : rule__Passage__Group__11__Impl rule__Passage__Group__12 ;
    public final void rule__Passage__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3022:1: ( rule__Passage__Group__11__Impl rule__Passage__Group__12 )
            // InternalHouseBuilderV2.g:3023:2: rule__Passage__Group__11__Impl rule__Passage__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__Passage__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__11"


    // $ANTLR start "rule__Passage__Group__11__Impl"
    // InternalHouseBuilderV2.g:3030:1: rule__Passage__Group__11__Impl : ( 'spaceA' ) ;
    public final void rule__Passage__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3034:1: ( ( 'spaceA' ) )
            // InternalHouseBuilderV2.g:3035:1: ( 'spaceA' )
            {
            // InternalHouseBuilderV2.g:3035:1: ( 'spaceA' )
            // InternalHouseBuilderV2.g:3036:2: 'spaceA'
            {
             before(grammarAccess.getPassageAccess().getSpaceAKeyword_11()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getSpaceAKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__11__Impl"


    // $ANTLR start "rule__Passage__Group__12"
    // InternalHouseBuilderV2.g:3045:1: rule__Passage__Group__12 : rule__Passage__Group__12__Impl rule__Passage__Group__13 ;
    public final void rule__Passage__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3049:1: ( rule__Passage__Group__12__Impl rule__Passage__Group__13 )
            // InternalHouseBuilderV2.g:3050:2: rule__Passage__Group__12__Impl rule__Passage__Group__13
            {
            pushFollow(FOLLOW_26);
            rule__Passage__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__12"


    // $ANTLR start "rule__Passage__Group__12__Impl"
    // InternalHouseBuilderV2.g:3057:1: rule__Passage__Group__12__Impl : ( ( rule__Passage__SpaceAAssignment_12 ) ) ;
    public final void rule__Passage__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3061:1: ( ( ( rule__Passage__SpaceAAssignment_12 ) ) )
            // InternalHouseBuilderV2.g:3062:1: ( ( rule__Passage__SpaceAAssignment_12 ) )
            {
            // InternalHouseBuilderV2.g:3062:1: ( ( rule__Passage__SpaceAAssignment_12 ) )
            // InternalHouseBuilderV2.g:3063:2: ( rule__Passage__SpaceAAssignment_12 )
            {
             before(grammarAccess.getPassageAccess().getSpaceAAssignment_12()); 
            // InternalHouseBuilderV2.g:3064:2: ( rule__Passage__SpaceAAssignment_12 )
            // InternalHouseBuilderV2.g:3064:3: rule__Passage__SpaceAAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Passage__SpaceAAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getSpaceAAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__12__Impl"


    // $ANTLR start "rule__Passage__Group__13"
    // InternalHouseBuilderV2.g:3072:1: rule__Passage__Group__13 : rule__Passage__Group__13__Impl rule__Passage__Group__14 ;
    public final void rule__Passage__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3076:1: ( rule__Passage__Group__13__Impl rule__Passage__Group__14 )
            // InternalHouseBuilderV2.g:3077:2: rule__Passage__Group__13__Impl rule__Passage__Group__14
            {
            pushFollow(FOLLOW_3);
            rule__Passage__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__13"


    // $ANTLR start "rule__Passage__Group__13__Impl"
    // InternalHouseBuilderV2.g:3084:1: rule__Passage__Group__13__Impl : ( 'spaceB' ) ;
    public final void rule__Passage__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3088:1: ( ( 'spaceB' ) )
            // InternalHouseBuilderV2.g:3089:1: ( 'spaceB' )
            {
            // InternalHouseBuilderV2.g:3089:1: ( 'spaceB' )
            // InternalHouseBuilderV2.g:3090:2: 'spaceB'
            {
             before(grammarAccess.getPassageAccess().getSpaceBKeyword_13()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getSpaceBKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__13__Impl"


    // $ANTLR start "rule__Passage__Group__14"
    // InternalHouseBuilderV2.g:3099:1: rule__Passage__Group__14 : rule__Passage__Group__14__Impl rule__Passage__Group__15 ;
    public final void rule__Passage__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3103:1: ( rule__Passage__Group__14__Impl rule__Passage__Group__15 )
            // InternalHouseBuilderV2.g:3104:2: rule__Passage__Group__14__Impl rule__Passage__Group__15
            {
            pushFollow(FOLLOW_27);
            rule__Passage__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__14"


    // $ANTLR start "rule__Passage__Group__14__Impl"
    // InternalHouseBuilderV2.g:3111:1: rule__Passage__Group__14__Impl : ( ( rule__Passage__SpaceBAssignment_14 ) ) ;
    public final void rule__Passage__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3115:1: ( ( ( rule__Passage__SpaceBAssignment_14 ) ) )
            // InternalHouseBuilderV2.g:3116:1: ( ( rule__Passage__SpaceBAssignment_14 ) )
            {
            // InternalHouseBuilderV2.g:3116:1: ( ( rule__Passage__SpaceBAssignment_14 ) )
            // InternalHouseBuilderV2.g:3117:2: ( rule__Passage__SpaceBAssignment_14 )
            {
             before(grammarAccess.getPassageAccess().getSpaceBAssignment_14()); 
            // InternalHouseBuilderV2.g:3118:2: ( rule__Passage__SpaceBAssignment_14 )
            // InternalHouseBuilderV2.g:3118:3: rule__Passage__SpaceBAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Passage__SpaceBAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getSpaceBAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__14__Impl"


    // $ANTLR start "rule__Passage__Group__15"
    // InternalHouseBuilderV2.g:3126:1: rule__Passage__Group__15 : rule__Passage__Group__15__Impl rule__Passage__Group__16 ;
    public final void rule__Passage__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3130:1: ( rule__Passage__Group__15__Impl rule__Passage__Group__16 )
            // InternalHouseBuilderV2.g:3131:2: rule__Passage__Group__15__Impl rule__Passage__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__Passage__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__15"


    // $ANTLR start "rule__Passage__Group__15__Impl"
    // InternalHouseBuilderV2.g:3138:1: rule__Passage__Group__15__Impl : ( ( rule__Passage__Group_15__0 )? ) ;
    public final void rule__Passage__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3142:1: ( ( ( rule__Passage__Group_15__0 )? ) )
            // InternalHouseBuilderV2.g:3143:1: ( ( rule__Passage__Group_15__0 )? )
            {
            // InternalHouseBuilderV2.g:3143:1: ( ( rule__Passage__Group_15__0 )? )
            // InternalHouseBuilderV2.g:3144:2: ( rule__Passage__Group_15__0 )?
            {
             before(grammarAccess.getPassageAccess().getGroup_15()); 
            // InternalHouseBuilderV2.g:3145:2: ( rule__Passage__Group_15__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==82) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHouseBuilderV2.g:3145:3: rule__Passage__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Passage__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPassageAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__15__Impl"


    // $ANTLR start "rule__Passage__Group__16"
    // InternalHouseBuilderV2.g:3153:1: rule__Passage__Group__16 : rule__Passage__Group__16__Impl ;
    public final void rule__Passage__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3157:1: ( rule__Passage__Group__16__Impl )
            // InternalHouseBuilderV2.g:3158:2: rule__Passage__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__16"


    // $ANTLR start "rule__Passage__Group__16__Impl"
    // InternalHouseBuilderV2.g:3164:1: rule__Passage__Group__16__Impl : ( '}' ) ;
    public final void rule__Passage__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3168:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:3169:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:3169:1: ( '}' )
            // InternalHouseBuilderV2.g:3170:2: '}'
            {
             before(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_16()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__16__Impl"


    // $ANTLR start "rule__Passage__Group_15__0"
    // InternalHouseBuilderV2.g:3180:1: rule__Passage__Group_15__0 : rule__Passage__Group_15__0__Impl rule__Passage__Group_15__1 ;
    public final void rule__Passage__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3184:1: ( rule__Passage__Group_15__0__Impl rule__Passage__Group_15__1 )
            // InternalHouseBuilderV2.g:3185:2: rule__Passage__Group_15__0__Impl rule__Passage__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__Passage__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__0"


    // $ANTLR start "rule__Passage__Group_15__0__Impl"
    // InternalHouseBuilderV2.g:3192:1: rule__Passage__Group_15__0__Impl : ( 'devices' ) ;
    public final void rule__Passage__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3196:1: ( ( 'devices' ) )
            // InternalHouseBuilderV2.g:3197:1: ( 'devices' )
            {
            // InternalHouseBuilderV2.g:3197:1: ( 'devices' )
            // InternalHouseBuilderV2.g:3198:2: 'devices'
            {
             before(grammarAccess.getPassageAccess().getDevicesKeyword_15_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getDevicesKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__0__Impl"


    // $ANTLR start "rule__Passage__Group_15__1"
    // InternalHouseBuilderV2.g:3207:1: rule__Passage__Group_15__1 : rule__Passage__Group_15__1__Impl rule__Passage__Group_15__2 ;
    public final void rule__Passage__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3211:1: ( rule__Passage__Group_15__1__Impl rule__Passage__Group_15__2 )
            // InternalHouseBuilderV2.g:3212:2: rule__Passage__Group_15__1__Impl rule__Passage__Group_15__2
            {
            pushFollow(FOLLOW_28);
            rule__Passage__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__1"


    // $ANTLR start "rule__Passage__Group_15__1__Impl"
    // InternalHouseBuilderV2.g:3219:1: rule__Passage__Group_15__1__Impl : ( '{' ) ;
    public final void rule__Passage__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3223:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:3224:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:3224:1: ( '{' )
            // InternalHouseBuilderV2.g:3225:2: '{'
            {
             before(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_15_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__1__Impl"


    // $ANTLR start "rule__Passage__Group_15__2"
    // InternalHouseBuilderV2.g:3234:1: rule__Passage__Group_15__2 : rule__Passage__Group_15__2__Impl rule__Passage__Group_15__3 ;
    public final void rule__Passage__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3238:1: ( rule__Passage__Group_15__2__Impl rule__Passage__Group_15__3 )
            // InternalHouseBuilderV2.g:3239:2: rule__Passage__Group_15__2__Impl rule__Passage__Group_15__3
            {
            pushFollow(FOLLOW_7);
            rule__Passage__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__2"


    // $ANTLR start "rule__Passage__Group_15__2__Impl"
    // InternalHouseBuilderV2.g:3246:1: rule__Passage__Group_15__2__Impl : ( ( rule__Passage__DevicesAssignment_15_2 ) ) ;
    public final void rule__Passage__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3250:1: ( ( ( rule__Passage__DevicesAssignment_15_2 ) ) )
            // InternalHouseBuilderV2.g:3251:1: ( ( rule__Passage__DevicesAssignment_15_2 ) )
            {
            // InternalHouseBuilderV2.g:3251:1: ( ( rule__Passage__DevicesAssignment_15_2 ) )
            // InternalHouseBuilderV2.g:3252:2: ( rule__Passage__DevicesAssignment_15_2 )
            {
             before(grammarAccess.getPassageAccess().getDevicesAssignment_15_2()); 
            // InternalHouseBuilderV2.g:3253:2: ( rule__Passage__DevicesAssignment_15_2 )
            // InternalHouseBuilderV2.g:3253:3: rule__Passage__DevicesAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DevicesAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDevicesAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__2__Impl"


    // $ANTLR start "rule__Passage__Group_15__3"
    // InternalHouseBuilderV2.g:3261:1: rule__Passage__Group_15__3 : rule__Passage__Group_15__3__Impl rule__Passage__Group_15__4 ;
    public final void rule__Passage__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3265:1: ( rule__Passage__Group_15__3__Impl rule__Passage__Group_15__4 )
            // InternalHouseBuilderV2.g:3266:2: rule__Passage__Group_15__3__Impl rule__Passage__Group_15__4
            {
            pushFollow(FOLLOW_7);
            rule__Passage__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__3"


    // $ANTLR start "rule__Passage__Group_15__3__Impl"
    // InternalHouseBuilderV2.g:3273:1: rule__Passage__Group_15__3__Impl : ( ( rule__Passage__Group_15_3__0 )* ) ;
    public final void rule__Passage__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3277:1: ( ( ( rule__Passage__Group_15_3__0 )* ) )
            // InternalHouseBuilderV2.g:3278:1: ( ( rule__Passage__Group_15_3__0 )* )
            {
            // InternalHouseBuilderV2.g:3278:1: ( ( rule__Passage__Group_15_3__0 )* )
            // InternalHouseBuilderV2.g:3279:2: ( rule__Passage__Group_15_3__0 )*
            {
             before(grammarAccess.getPassageAccess().getGroup_15_3()); 
            // InternalHouseBuilderV2.g:3280:2: ( rule__Passage__Group_15_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==69) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:3280:3: rule__Passage__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Passage__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getPassageAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__3__Impl"


    // $ANTLR start "rule__Passage__Group_15__4"
    // InternalHouseBuilderV2.g:3288:1: rule__Passage__Group_15__4 : rule__Passage__Group_15__4__Impl ;
    public final void rule__Passage__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3292:1: ( rule__Passage__Group_15__4__Impl )
            // InternalHouseBuilderV2.g:3293:2: rule__Passage__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__4"


    // $ANTLR start "rule__Passage__Group_15__4__Impl"
    // InternalHouseBuilderV2.g:3299:1: rule__Passage__Group_15__4__Impl : ( '}' ) ;
    public final void rule__Passage__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3303:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:3304:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:3304:1: ( '}' )
            // InternalHouseBuilderV2.g:3305:2: '}'
            {
             before(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15__4__Impl"


    // $ANTLR start "rule__Passage__Group_15_3__0"
    // InternalHouseBuilderV2.g:3315:1: rule__Passage__Group_15_3__0 : rule__Passage__Group_15_3__0__Impl rule__Passage__Group_15_3__1 ;
    public final void rule__Passage__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3319:1: ( rule__Passage__Group_15_3__0__Impl rule__Passage__Group_15_3__1 )
            // InternalHouseBuilderV2.g:3320:2: rule__Passage__Group_15_3__0__Impl rule__Passage__Group_15_3__1
            {
            pushFollow(FOLLOW_28);
            rule__Passage__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_15_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15_3__0"


    // $ANTLR start "rule__Passage__Group_15_3__0__Impl"
    // InternalHouseBuilderV2.g:3327:1: rule__Passage__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__Passage__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3331:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:3332:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:3332:1: ( ',' )
            // InternalHouseBuilderV2.g:3333:2: ','
            {
             before(grammarAccess.getPassageAccess().getCommaKeyword_15_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15_3__0__Impl"


    // $ANTLR start "rule__Passage__Group_15_3__1"
    // InternalHouseBuilderV2.g:3342:1: rule__Passage__Group_15_3__1 : rule__Passage__Group_15_3__1__Impl ;
    public final void rule__Passage__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3346:1: ( rule__Passage__Group_15_3__1__Impl )
            // InternalHouseBuilderV2.g:3347:2: rule__Passage__Group_15_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group_15_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15_3__1"


    // $ANTLR start "rule__Passage__Group_15_3__1__Impl"
    // InternalHouseBuilderV2.g:3353:1: rule__Passage__Group_15_3__1__Impl : ( ( rule__Passage__DevicesAssignment_15_3_1 ) ) ;
    public final void rule__Passage__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3357:1: ( ( ( rule__Passage__DevicesAssignment_15_3_1 ) ) )
            // InternalHouseBuilderV2.g:3358:1: ( ( rule__Passage__DevicesAssignment_15_3_1 ) )
            {
            // InternalHouseBuilderV2.g:3358:1: ( ( rule__Passage__DevicesAssignment_15_3_1 ) )
            // InternalHouseBuilderV2.g:3359:2: ( rule__Passage__DevicesAssignment_15_3_1 )
            {
             before(grammarAccess.getPassageAccess().getDevicesAssignment_15_3_1()); 
            // InternalHouseBuilderV2.g:3360:2: ( rule__Passage__DevicesAssignment_15_3_1 )
            // InternalHouseBuilderV2.g:3360:3: rule__Passage__DevicesAssignment_15_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DevicesAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDevicesAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_15_3__1__Impl"


    // $ANTLR start "rule__Controller__Group__0"
    // InternalHouseBuilderV2.g:3369:1: rule__Controller__Group__0 : rule__Controller__Group__0__Impl rule__Controller__Group__1 ;
    public final void rule__Controller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3373:1: ( rule__Controller__Group__0__Impl rule__Controller__Group__1 )
            // InternalHouseBuilderV2.g:3374:2: rule__Controller__Group__0__Impl rule__Controller__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__0"


    // $ANTLR start "rule__Controller__Group__0__Impl"
    // InternalHouseBuilderV2.g:3381:1: rule__Controller__Group__0__Impl : ( 'Controller' ) ;
    public final void rule__Controller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3385:1: ( ( 'Controller' ) )
            // InternalHouseBuilderV2.g:3386:1: ( 'Controller' )
            {
            // InternalHouseBuilderV2.g:3386:1: ( 'Controller' )
            // InternalHouseBuilderV2.g:3387:2: 'Controller'
            {
             before(grammarAccess.getControllerAccess().getControllerKeyword_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getControllerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__0__Impl"


    // $ANTLR start "rule__Controller__Group__1"
    // InternalHouseBuilderV2.g:3396:1: rule__Controller__Group__1 : rule__Controller__Group__1__Impl rule__Controller__Group__2 ;
    public final void rule__Controller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3400:1: ( rule__Controller__Group__1__Impl rule__Controller__Group__2 )
            // InternalHouseBuilderV2.g:3401:2: rule__Controller__Group__1__Impl rule__Controller__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Controller__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__1"


    // $ANTLR start "rule__Controller__Group__1__Impl"
    // InternalHouseBuilderV2.g:3408:1: rule__Controller__Group__1__Impl : ( ( rule__Controller__NameAssignment_1 ) ) ;
    public final void rule__Controller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3412:1: ( ( ( rule__Controller__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:3413:1: ( ( rule__Controller__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:3413:1: ( ( rule__Controller__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:3414:2: ( rule__Controller__NameAssignment_1 )
            {
             before(grammarAccess.getControllerAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:3415:2: ( rule__Controller__NameAssignment_1 )
            // InternalHouseBuilderV2.g:3415:3: rule__Controller__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__1__Impl"


    // $ANTLR start "rule__Controller__Group__2"
    // InternalHouseBuilderV2.g:3423:1: rule__Controller__Group__2 : rule__Controller__Group__2__Impl rule__Controller__Group__3 ;
    public final void rule__Controller__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3427:1: ( rule__Controller__Group__2__Impl rule__Controller__Group__3 )
            // InternalHouseBuilderV2.g:3428:2: rule__Controller__Group__2__Impl rule__Controller__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Controller__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__2"


    // $ANTLR start "rule__Controller__Group__2__Impl"
    // InternalHouseBuilderV2.g:3435:1: rule__Controller__Group__2__Impl : ( '{' ) ;
    public final void rule__Controller__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3439:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:3440:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:3440:1: ( '{' )
            // InternalHouseBuilderV2.g:3441:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__2__Impl"


    // $ANTLR start "rule__Controller__Group__3"
    // InternalHouseBuilderV2.g:3450:1: rule__Controller__Group__3 : rule__Controller__Group__3__Impl rule__Controller__Group__4 ;
    public final void rule__Controller__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3454:1: ( rule__Controller__Group__3__Impl rule__Controller__Group__4 )
            // InternalHouseBuilderV2.g:3455:2: rule__Controller__Group__3__Impl rule__Controller__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__3"


    // $ANTLR start "rule__Controller__Group__3__Impl"
    // InternalHouseBuilderV2.g:3462:1: rule__Controller__Group__3__Impl : ( 'model' ) ;
    public final void rule__Controller__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3466:1: ( ( 'model' ) )
            // InternalHouseBuilderV2.g:3467:1: ( 'model' )
            {
            // InternalHouseBuilderV2.g:3467:1: ( 'model' )
            // InternalHouseBuilderV2.g:3468:2: 'model'
            {
             before(grammarAccess.getControllerAccess().getModelKeyword_3()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getModelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__3__Impl"


    // $ANTLR start "rule__Controller__Group__4"
    // InternalHouseBuilderV2.g:3477:1: rule__Controller__Group__4 : rule__Controller__Group__4__Impl rule__Controller__Group__5 ;
    public final void rule__Controller__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3481:1: ( rule__Controller__Group__4__Impl rule__Controller__Group__5 )
            // InternalHouseBuilderV2.g:3482:2: rule__Controller__Group__4__Impl rule__Controller__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Controller__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__4"


    // $ANTLR start "rule__Controller__Group__4__Impl"
    // InternalHouseBuilderV2.g:3489:1: rule__Controller__Group__4__Impl : ( ( rule__Controller__ModelAssignment_4 ) ) ;
    public final void rule__Controller__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3493:1: ( ( ( rule__Controller__ModelAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:3494:1: ( ( rule__Controller__ModelAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:3494:1: ( ( rule__Controller__ModelAssignment_4 ) )
            // InternalHouseBuilderV2.g:3495:2: ( rule__Controller__ModelAssignment_4 )
            {
             before(grammarAccess.getControllerAccess().getModelAssignment_4()); 
            // InternalHouseBuilderV2.g:3496:2: ( rule__Controller__ModelAssignment_4 )
            // InternalHouseBuilderV2.g:3496:3: rule__Controller__ModelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Controller__ModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getModelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__4__Impl"


    // $ANTLR start "rule__Controller__Group__5"
    // InternalHouseBuilderV2.g:3504:1: rule__Controller__Group__5 : rule__Controller__Group__5__Impl rule__Controller__Group__6 ;
    public final void rule__Controller__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3508:1: ( rule__Controller__Group__5__Impl rule__Controller__Group__6 )
            // InternalHouseBuilderV2.g:3509:2: rule__Controller__Group__5__Impl rule__Controller__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Controller__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__5"


    // $ANTLR start "rule__Controller__Group__5__Impl"
    // InternalHouseBuilderV2.g:3516:1: rule__Controller__Group__5__Impl : ( ( rule__Controller__Group_5__0 )? ) ;
    public final void rule__Controller__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3520:1: ( ( ( rule__Controller__Group_5__0 )? ) )
            // InternalHouseBuilderV2.g:3521:1: ( ( rule__Controller__Group_5__0 )? )
            {
            // InternalHouseBuilderV2.g:3521:1: ( ( rule__Controller__Group_5__0 )? )
            // InternalHouseBuilderV2.g:3522:2: ( rule__Controller__Group_5__0 )?
            {
             before(grammarAccess.getControllerAccess().getGroup_5()); 
            // InternalHouseBuilderV2.g:3523:2: ( rule__Controller__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==87) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHouseBuilderV2.g:3523:3: rule__Controller__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Controller__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControllerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__5__Impl"


    // $ANTLR start "rule__Controller__Group__6"
    // InternalHouseBuilderV2.g:3531:1: rule__Controller__Group__6 : rule__Controller__Group__6__Impl rule__Controller__Group__7 ;
    public final void rule__Controller__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3535:1: ( rule__Controller__Group__6__Impl rule__Controller__Group__7 )
            // InternalHouseBuilderV2.g:3536:2: rule__Controller__Group__6__Impl rule__Controller__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Controller__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__6"


    // $ANTLR start "rule__Controller__Group__6__Impl"
    // InternalHouseBuilderV2.g:3543:1: rule__Controller__Group__6__Impl : ( ( rule__Controller__Group_6__0 )? ) ;
    public final void rule__Controller__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3547:1: ( ( ( rule__Controller__Group_6__0 )? ) )
            // InternalHouseBuilderV2.g:3548:1: ( ( rule__Controller__Group_6__0 )? )
            {
            // InternalHouseBuilderV2.g:3548:1: ( ( rule__Controller__Group_6__0 )? )
            // InternalHouseBuilderV2.g:3549:2: ( rule__Controller__Group_6__0 )?
            {
             before(grammarAccess.getControllerAccess().getGroup_6()); 
            // InternalHouseBuilderV2.g:3550:2: ( rule__Controller__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==88) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHouseBuilderV2.g:3550:3: rule__Controller__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Controller__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControllerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__6__Impl"


    // $ANTLR start "rule__Controller__Group__7"
    // InternalHouseBuilderV2.g:3558:1: rule__Controller__Group__7 : rule__Controller__Group__7__Impl rule__Controller__Group__8 ;
    public final void rule__Controller__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3562:1: ( rule__Controller__Group__7__Impl rule__Controller__Group__8 )
            // InternalHouseBuilderV2.g:3563:2: rule__Controller__Group__7__Impl rule__Controller__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Controller__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__7"


    // $ANTLR start "rule__Controller__Group__7__Impl"
    // InternalHouseBuilderV2.g:3570:1: rule__Controller__Group__7__Impl : ( 'actuators' ) ;
    public final void rule__Controller__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3574:1: ( ( 'actuators' ) )
            // InternalHouseBuilderV2.g:3575:1: ( 'actuators' )
            {
            // InternalHouseBuilderV2.g:3575:1: ( 'actuators' )
            // InternalHouseBuilderV2.g:3576:2: 'actuators'
            {
             before(grammarAccess.getControllerAccess().getActuatorsKeyword_7()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getActuatorsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__7__Impl"


    // $ANTLR start "rule__Controller__Group__8"
    // InternalHouseBuilderV2.g:3585:1: rule__Controller__Group__8 : rule__Controller__Group__8__Impl rule__Controller__Group__9 ;
    public final void rule__Controller__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3589:1: ( rule__Controller__Group__8__Impl rule__Controller__Group__9 )
            // InternalHouseBuilderV2.g:3590:2: rule__Controller__Group__8__Impl rule__Controller__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__Controller__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__8"


    // $ANTLR start "rule__Controller__Group__8__Impl"
    // InternalHouseBuilderV2.g:3597:1: rule__Controller__Group__8__Impl : ( '{' ) ;
    public final void rule__Controller__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3601:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:3602:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:3602:1: ( '{' )
            // InternalHouseBuilderV2.g:3603:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__8__Impl"


    // $ANTLR start "rule__Controller__Group__9"
    // InternalHouseBuilderV2.g:3612:1: rule__Controller__Group__9 : rule__Controller__Group__9__Impl rule__Controller__Group__10 ;
    public final void rule__Controller__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3616:1: ( rule__Controller__Group__9__Impl rule__Controller__Group__10 )
            // InternalHouseBuilderV2.g:3617:2: rule__Controller__Group__9__Impl rule__Controller__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__9"


    // $ANTLR start "rule__Controller__Group__9__Impl"
    // InternalHouseBuilderV2.g:3624:1: rule__Controller__Group__9__Impl : ( ( rule__Controller__ActuatorsAssignment_9 ) ) ;
    public final void rule__Controller__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3628:1: ( ( ( rule__Controller__ActuatorsAssignment_9 ) ) )
            // InternalHouseBuilderV2.g:3629:1: ( ( rule__Controller__ActuatorsAssignment_9 ) )
            {
            // InternalHouseBuilderV2.g:3629:1: ( ( rule__Controller__ActuatorsAssignment_9 ) )
            // InternalHouseBuilderV2.g:3630:2: ( rule__Controller__ActuatorsAssignment_9 )
            {
             before(grammarAccess.getControllerAccess().getActuatorsAssignment_9()); 
            // InternalHouseBuilderV2.g:3631:2: ( rule__Controller__ActuatorsAssignment_9 )
            // InternalHouseBuilderV2.g:3631:3: rule__Controller__ActuatorsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Controller__ActuatorsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getActuatorsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__9__Impl"


    // $ANTLR start "rule__Controller__Group__10"
    // InternalHouseBuilderV2.g:3639:1: rule__Controller__Group__10 : rule__Controller__Group__10__Impl rule__Controller__Group__11 ;
    public final void rule__Controller__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3643:1: ( rule__Controller__Group__10__Impl rule__Controller__Group__11 )
            // InternalHouseBuilderV2.g:3644:2: rule__Controller__Group__10__Impl rule__Controller__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__10"


    // $ANTLR start "rule__Controller__Group__10__Impl"
    // InternalHouseBuilderV2.g:3651:1: rule__Controller__Group__10__Impl : ( ( rule__Controller__Group_10__0 )* ) ;
    public final void rule__Controller__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3655:1: ( ( ( rule__Controller__Group_10__0 )* ) )
            // InternalHouseBuilderV2.g:3656:1: ( ( rule__Controller__Group_10__0 )* )
            {
            // InternalHouseBuilderV2.g:3656:1: ( ( rule__Controller__Group_10__0 )* )
            // InternalHouseBuilderV2.g:3657:2: ( rule__Controller__Group_10__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_10()); 
            // InternalHouseBuilderV2.g:3658:2: ( rule__Controller__Group_10__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==69) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:3658:3: rule__Controller__Group_10__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Controller__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getControllerAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__10__Impl"


    // $ANTLR start "rule__Controller__Group__11"
    // InternalHouseBuilderV2.g:3666:1: rule__Controller__Group__11 : rule__Controller__Group__11__Impl rule__Controller__Group__12 ;
    public final void rule__Controller__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3670:1: ( rule__Controller__Group__11__Impl rule__Controller__Group__12 )
            // InternalHouseBuilderV2.g:3671:2: rule__Controller__Group__11__Impl rule__Controller__Group__12
            {
            pushFollow(FOLLOW_32);
            rule__Controller__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__11"


    // $ANTLR start "rule__Controller__Group__11__Impl"
    // InternalHouseBuilderV2.g:3678:1: rule__Controller__Group__11__Impl : ( '}' ) ;
    public final void rule__Controller__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3682:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:3683:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:3683:1: ( '}' )
            // InternalHouseBuilderV2.g:3684:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_11()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__11__Impl"


    // $ANTLR start "rule__Controller__Group__12"
    // InternalHouseBuilderV2.g:3693:1: rule__Controller__Group__12 : rule__Controller__Group__12__Impl rule__Controller__Group__13 ;
    public final void rule__Controller__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3697:1: ( rule__Controller__Group__12__Impl rule__Controller__Group__13 )
            // InternalHouseBuilderV2.g:3698:2: rule__Controller__Group__12__Impl rule__Controller__Group__13
            {
            pushFollow(FOLLOW_4);
            rule__Controller__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__12"


    // $ANTLR start "rule__Controller__Group__12__Impl"
    // InternalHouseBuilderV2.g:3705:1: rule__Controller__Group__12__Impl : ( 'sensors' ) ;
    public final void rule__Controller__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3709:1: ( ( 'sensors' ) )
            // InternalHouseBuilderV2.g:3710:1: ( 'sensors' )
            {
            // InternalHouseBuilderV2.g:3710:1: ( 'sensors' )
            // InternalHouseBuilderV2.g:3711:2: 'sensors'
            {
             before(grammarAccess.getControllerAccess().getSensorsKeyword_12()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getSensorsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__12__Impl"


    // $ANTLR start "rule__Controller__Group__13"
    // InternalHouseBuilderV2.g:3720:1: rule__Controller__Group__13 : rule__Controller__Group__13__Impl rule__Controller__Group__14 ;
    public final void rule__Controller__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3724:1: ( rule__Controller__Group__13__Impl rule__Controller__Group__14 )
            // InternalHouseBuilderV2.g:3725:2: rule__Controller__Group__13__Impl rule__Controller__Group__14
            {
            pushFollow(FOLLOW_33);
            rule__Controller__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__13"


    // $ANTLR start "rule__Controller__Group__13__Impl"
    // InternalHouseBuilderV2.g:3732:1: rule__Controller__Group__13__Impl : ( '{' ) ;
    public final void rule__Controller__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3736:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:3737:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:3737:1: ( '{' )
            // InternalHouseBuilderV2.g:3738:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__13__Impl"


    // $ANTLR start "rule__Controller__Group__14"
    // InternalHouseBuilderV2.g:3747:1: rule__Controller__Group__14 : rule__Controller__Group__14__Impl rule__Controller__Group__15 ;
    public final void rule__Controller__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3751:1: ( rule__Controller__Group__14__Impl rule__Controller__Group__15 )
            // InternalHouseBuilderV2.g:3752:2: rule__Controller__Group__14__Impl rule__Controller__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__14"


    // $ANTLR start "rule__Controller__Group__14__Impl"
    // InternalHouseBuilderV2.g:3759:1: rule__Controller__Group__14__Impl : ( ( rule__Controller__SensorsAssignment_14 ) ) ;
    public final void rule__Controller__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3763:1: ( ( ( rule__Controller__SensorsAssignment_14 ) ) )
            // InternalHouseBuilderV2.g:3764:1: ( ( rule__Controller__SensorsAssignment_14 ) )
            {
            // InternalHouseBuilderV2.g:3764:1: ( ( rule__Controller__SensorsAssignment_14 ) )
            // InternalHouseBuilderV2.g:3765:2: ( rule__Controller__SensorsAssignment_14 )
            {
             before(grammarAccess.getControllerAccess().getSensorsAssignment_14()); 
            // InternalHouseBuilderV2.g:3766:2: ( rule__Controller__SensorsAssignment_14 )
            // InternalHouseBuilderV2.g:3766:3: rule__Controller__SensorsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Controller__SensorsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getSensorsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__14__Impl"


    // $ANTLR start "rule__Controller__Group__15"
    // InternalHouseBuilderV2.g:3774:1: rule__Controller__Group__15 : rule__Controller__Group__15__Impl rule__Controller__Group__16 ;
    public final void rule__Controller__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3778:1: ( rule__Controller__Group__15__Impl rule__Controller__Group__16 )
            // InternalHouseBuilderV2.g:3779:2: rule__Controller__Group__15__Impl rule__Controller__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__15"


    // $ANTLR start "rule__Controller__Group__15__Impl"
    // InternalHouseBuilderV2.g:3786:1: rule__Controller__Group__15__Impl : ( ( rule__Controller__Group_15__0 )* ) ;
    public final void rule__Controller__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3790:1: ( ( ( rule__Controller__Group_15__0 )* ) )
            // InternalHouseBuilderV2.g:3791:1: ( ( rule__Controller__Group_15__0 )* )
            {
            // InternalHouseBuilderV2.g:3791:1: ( ( rule__Controller__Group_15__0 )* )
            // InternalHouseBuilderV2.g:3792:2: ( rule__Controller__Group_15__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_15()); 
            // InternalHouseBuilderV2.g:3793:2: ( rule__Controller__Group_15__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==69) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:3793:3: rule__Controller__Group_15__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Controller__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getControllerAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__15__Impl"


    // $ANTLR start "rule__Controller__Group__16"
    // InternalHouseBuilderV2.g:3801:1: rule__Controller__Group__16 : rule__Controller__Group__16__Impl rule__Controller__Group__17 ;
    public final void rule__Controller__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3805:1: ( rule__Controller__Group__16__Impl rule__Controller__Group__17 )
            // InternalHouseBuilderV2.g:3806:2: rule__Controller__Group__16__Impl rule__Controller__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__Controller__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__16"


    // $ANTLR start "rule__Controller__Group__16__Impl"
    // InternalHouseBuilderV2.g:3813:1: rule__Controller__Group__16__Impl : ( '}' ) ;
    public final void rule__Controller__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3817:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:3818:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:3818:1: ( '}' )
            // InternalHouseBuilderV2.g:3819:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_16()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__16__Impl"


    // $ANTLR start "rule__Controller__Group__17"
    // InternalHouseBuilderV2.g:3828:1: rule__Controller__Group__17 : rule__Controller__Group__17__Impl ;
    public final void rule__Controller__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3832:1: ( rule__Controller__Group__17__Impl )
            // InternalHouseBuilderV2.g:3833:2: rule__Controller__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__17"


    // $ANTLR start "rule__Controller__Group__17__Impl"
    // InternalHouseBuilderV2.g:3839:1: rule__Controller__Group__17__Impl : ( '}' ) ;
    public final void rule__Controller__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3843:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:3844:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:3844:1: ( '}' )
            // InternalHouseBuilderV2.g:3845:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_17()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__17__Impl"


    // $ANTLR start "rule__Controller__Group_5__0"
    // InternalHouseBuilderV2.g:3855:1: rule__Controller__Group_5__0 : rule__Controller__Group_5__0__Impl rule__Controller__Group_5__1 ;
    public final void rule__Controller__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3859:1: ( rule__Controller__Group_5__0__Impl rule__Controller__Group_5__1 )
            // InternalHouseBuilderV2.g:3860:2: rule__Controller__Group_5__0__Impl rule__Controller__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__0"


    // $ANTLR start "rule__Controller__Group_5__0__Impl"
    // InternalHouseBuilderV2.g:3867:1: rule__Controller__Group_5__0__Impl : ( 'os' ) ;
    public final void rule__Controller__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3871:1: ( ( 'os' ) )
            // InternalHouseBuilderV2.g:3872:1: ( 'os' )
            {
            // InternalHouseBuilderV2.g:3872:1: ( 'os' )
            // InternalHouseBuilderV2.g:3873:2: 'os'
            {
             before(grammarAccess.getControllerAccess().getOsKeyword_5_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getOsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__0__Impl"


    // $ANTLR start "rule__Controller__Group_5__1"
    // InternalHouseBuilderV2.g:3882:1: rule__Controller__Group_5__1 : rule__Controller__Group_5__1__Impl ;
    public final void rule__Controller__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3886:1: ( rule__Controller__Group_5__1__Impl )
            // InternalHouseBuilderV2.g:3887:2: rule__Controller__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__1"


    // $ANTLR start "rule__Controller__Group_5__1__Impl"
    // InternalHouseBuilderV2.g:3893:1: rule__Controller__Group_5__1__Impl : ( ( rule__Controller__OsAssignment_5_1 ) ) ;
    public final void rule__Controller__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3897:1: ( ( ( rule__Controller__OsAssignment_5_1 ) ) )
            // InternalHouseBuilderV2.g:3898:1: ( ( rule__Controller__OsAssignment_5_1 ) )
            {
            // InternalHouseBuilderV2.g:3898:1: ( ( rule__Controller__OsAssignment_5_1 ) )
            // InternalHouseBuilderV2.g:3899:2: ( rule__Controller__OsAssignment_5_1 )
            {
             before(grammarAccess.getControllerAccess().getOsAssignment_5_1()); 
            // InternalHouseBuilderV2.g:3900:2: ( rule__Controller__OsAssignment_5_1 )
            // InternalHouseBuilderV2.g:3900:3: rule__Controller__OsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__OsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getOsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__1__Impl"


    // $ANTLR start "rule__Controller__Group_6__0"
    // InternalHouseBuilderV2.g:3909:1: rule__Controller__Group_6__0 : rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1 ;
    public final void rule__Controller__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3913:1: ( rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1 )
            // InternalHouseBuilderV2.g:3914:2: rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_6__0"


    // $ANTLR start "rule__Controller__Group_6__0__Impl"
    // InternalHouseBuilderV2.g:3921:1: rule__Controller__Group_6__0__Impl : ( 'osVersion' ) ;
    public final void rule__Controller__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3925:1: ( ( 'osVersion' ) )
            // InternalHouseBuilderV2.g:3926:1: ( 'osVersion' )
            {
            // InternalHouseBuilderV2.g:3926:1: ( 'osVersion' )
            // InternalHouseBuilderV2.g:3927:2: 'osVersion'
            {
             before(grammarAccess.getControllerAccess().getOsVersionKeyword_6_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getOsVersionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_6__0__Impl"


    // $ANTLR start "rule__Controller__Group_6__1"
    // InternalHouseBuilderV2.g:3936:1: rule__Controller__Group_6__1 : rule__Controller__Group_6__1__Impl ;
    public final void rule__Controller__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3940:1: ( rule__Controller__Group_6__1__Impl )
            // InternalHouseBuilderV2.g:3941:2: rule__Controller__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_6__1"


    // $ANTLR start "rule__Controller__Group_6__1__Impl"
    // InternalHouseBuilderV2.g:3947:1: rule__Controller__Group_6__1__Impl : ( ( rule__Controller__OsVersionAssignment_6_1 ) ) ;
    public final void rule__Controller__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3951:1: ( ( ( rule__Controller__OsVersionAssignment_6_1 ) ) )
            // InternalHouseBuilderV2.g:3952:1: ( ( rule__Controller__OsVersionAssignment_6_1 ) )
            {
            // InternalHouseBuilderV2.g:3952:1: ( ( rule__Controller__OsVersionAssignment_6_1 ) )
            // InternalHouseBuilderV2.g:3953:2: ( rule__Controller__OsVersionAssignment_6_1 )
            {
             before(grammarAccess.getControllerAccess().getOsVersionAssignment_6_1()); 
            // InternalHouseBuilderV2.g:3954:2: ( rule__Controller__OsVersionAssignment_6_1 )
            // InternalHouseBuilderV2.g:3954:3: rule__Controller__OsVersionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__OsVersionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getOsVersionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_6__1__Impl"


    // $ANTLR start "rule__Controller__Group_10__0"
    // InternalHouseBuilderV2.g:3963:1: rule__Controller__Group_10__0 : rule__Controller__Group_10__0__Impl rule__Controller__Group_10__1 ;
    public final void rule__Controller__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3967:1: ( rule__Controller__Group_10__0__Impl rule__Controller__Group_10__1 )
            // InternalHouseBuilderV2.g:3968:2: rule__Controller__Group_10__0__Impl rule__Controller__Group_10__1
            {
            pushFollow(FOLLOW_31);
            rule__Controller__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_10__0"


    // $ANTLR start "rule__Controller__Group_10__0__Impl"
    // InternalHouseBuilderV2.g:3975:1: rule__Controller__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Controller__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3979:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:3980:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:3980:1: ( ',' )
            // InternalHouseBuilderV2.g:3981:2: ','
            {
             before(grammarAccess.getControllerAccess().getCommaKeyword_10_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_10__0__Impl"


    // $ANTLR start "rule__Controller__Group_10__1"
    // InternalHouseBuilderV2.g:3990:1: rule__Controller__Group_10__1 : rule__Controller__Group_10__1__Impl ;
    public final void rule__Controller__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:3994:1: ( rule__Controller__Group_10__1__Impl )
            // InternalHouseBuilderV2.g:3995:2: rule__Controller__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_10__1"


    // $ANTLR start "rule__Controller__Group_10__1__Impl"
    // InternalHouseBuilderV2.g:4001:1: rule__Controller__Group_10__1__Impl : ( ( rule__Controller__ActuatorsAssignment_10_1 ) ) ;
    public final void rule__Controller__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4005:1: ( ( ( rule__Controller__ActuatorsAssignment_10_1 ) ) )
            // InternalHouseBuilderV2.g:4006:1: ( ( rule__Controller__ActuatorsAssignment_10_1 ) )
            {
            // InternalHouseBuilderV2.g:4006:1: ( ( rule__Controller__ActuatorsAssignment_10_1 ) )
            // InternalHouseBuilderV2.g:4007:2: ( rule__Controller__ActuatorsAssignment_10_1 )
            {
             before(grammarAccess.getControllerAccess().getActuatorsAssignment_10_1()); 
            // InternalHouseBuilderV2.g:4008:2: ( rule__Controller__ActuatorsAssignment_10_1 )
            // InternalHouseBuilderV2.g:4008:3: rule__Controller__ActuatorsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__ActuatorsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getActuatorsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_10__1__Impl"


    // $ANTLR start "rule__Controller__Group_15__0"
    // InternalHouseBuilderV2.g:4017:1: rule__Controller__Group_15__0 : rule__Controller__Group_15__0__Impl rule__Controller__Group_15__1 ;
    public final void rule__Controller__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4021:1: ( rule__Controller__Group_15__0__Impl rule__Controller__Group_15__1 )
            // InternalHouseBuilderV2.g:4022:2: rule__Controller__Group_15__0__Impl rule__Controller__Group_15__1
            {
            pushFollow(FOLLOW_33);
            rule__Controller__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_15__0"


    // $ANTLR start "rule__Controller__Group_15__0__Impl"
    // InternalHouseBuilderV2.g:4029:1: rule__Controller__Group_15__0__Impl : ( ',' ) ;
    public final void rule__Controller__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4033:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:4034:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:4034:1: ( ',' )
            // InternalHouseBuilderV2.g:4035:2: ','
            {
             before(grammarAccess.getControllerAccess().getCommaKeyword_15_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_15__0__Impl"


    // $ANTLR start "rule__Controller__Group_15__1"
    // InternalHouseBuilderV2.g:4044:1: rule__Controller__Group_15__1 : rule__Controller__Group_15__1__Impl ;
    public final void rule__Controller__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4048:1: ( rule__Controller__Group_15__1__Impl )
            // InternalHouseBuilderV2.g:4049:2: rule__Controller__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_15__1"


    // $ANTLR start "rule__Controller__Group_15__1__Impl"
    // InternalHouseBuilderV2.g:4055:1: rule__Controller__Group_15__1__Impl : ( ( rule__Controller__SensorsAssignment_15_1 ) ) ;
    public final void rule__Controller__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4059:1: ( ( ( rule__Controller__SensorsAssignment_15_1 ) ) )
            // InternalHouseBuilderV2.g:4060:1: ( ( rule__Controller__SensorsAssignment_15_1 ) )
            {
            // InternalHouseBuilderV2.g:4060:1: ( ( rule__Controller__SensorsAssignment_15_1 ) )
            // InternalHouseBuilderV2.g:4061:2: ( rule__Controller__SensorsAssignment_15_1 )
            {
             before(grammarAccess.getControllerAccess().getSensorsAssignment_15_1()); 
            // InternalHouseBuilderV2.g:4062:2: ( rule__Controller__SensorsAssignment_15_1 )
            // InternalHouseBuilderV2.g:4062:3: rule__Controller__SensorsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__SensorsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getSensorsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_15__1__Impl"


    // $ANTLR start "rule__Entrance__Group__0"
    // InternalHouseBuilderV2.g:4071:1: rule__Entrance__Group__0 : rule__Entrance__Group__0__Impl rule__Entrance__Group__1 ;
    public final void rule__Entrance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4075:1: ( rule__Entrance__Group__0__Impl rule__Entrance__Group__1 )
            // InternalHouseBuilderV2.g:4076:2: rule__Entrance__Group__0__Impl rule__Entrance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entrance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__0"


    // $ANTLR start "rule__Entrance__Group__0__Impl"
    // InternalHouseBuilderV2.g:4083:1: rule__Entrance__Group__0__Impl : ( 'Entrance' ) ;
    public final void rule__Entrance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4087:1: ( ( 'Entrance' ) )
            // InternalHouseBuilderV2.g:4088:1: ( 'Entrance' )
            {
            // InternalHouseBuilderV2.g:4088:1: ( 'Entrance' )
            // InternalHouseBuilderV2.g:4089:2: 'Entrance'
            {
             before(grammarAccess.getEntranceAccess().getEntranceKeyword_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getEntranceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__0__Impl"


    // $ANTLR start "rule__Entrance__Group__1"
    // InternalHouseBuilderV2.g:4098:1: rule__Entrance__Group__1 : rule__Entrance__Group__1__Impl rule__Entrance__Group__2 ;
    public final void rule__Entrance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4102:1: ( rule__Entrance__Group__1__Impl rule__Entrance__Group__2 )
            // InternalHouseBuilderV2.g:4103:2: rule__Entrance__Group__1__Impl rule__Entrance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entrance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__1"


    // $ANTLR start "rule__Entrance__Group__1__Impl"
    // InternalHouseBuilderV2.g:4110:1: rule__Entrance__Group__1__Impl : ( ( rule__Entrance__NameAssignment_1 ) ) ;
    public final void rule__Entrance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4114:1: ( ( ( rule__Entrance__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:4115:1: ( ( rule__Entrance__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:4115:1: ( ( rule__Entrance__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:4116:2: ( rule__Entrance__NameAssignment_1 )
            {
             before(grammarAccess.getEntranceAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:4117:2: ( rule__Entrance__NameAssignment_1 )
            // InternalHouseBuilderV2.g:4117:3: rule__Entrance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__1__Impl"


    // $ANTLR start "rule__Entrance__Group__2"
    // InternalHouseBuilderV2.g:4125:1: rule__Entrance__Group__2 : rule__Entrance__Group__2__Impl rule__Entrance__Group__3 ;
    public final void rule__Entrance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4129:1: ( rule__Entrance__Group__2__Impl rule__Entrance__Group__3 )
            // InternalHouseBuilderV2.g:4130:2: rule__Entrance__Group__2__Impl rule__Entrance__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Entrance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__2"


    // $ANTLR start "rule__Entrance__Group__2__Impl"
    // InternalHouseBuilderV2.g:4137:1: rule__Entrance__Group__2__Impl : ( '{' ) ;
    public final void rule__Entrance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4141:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:4142:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:4142:1: ( '{' )
            // InternalHouseBuilderV2.g:4143:2: '{'
            {
             before(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__2__Impl"


    // $ANTLR start "rule__Entrance__Group__3"
    // InternalHouseBuilderV2.g:4152:1: rule__Entrance__Group__3 : rule__Entrance__Group__3__Impl rule__Entrance__Group__4 ;
    public final void rule__Entrance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4156:1: ( rule__Entrance__Group__3__Impl rule__Entrance__Group__4 )
            // InternalHouseBuilderV2.g:4157:2: rule__Entrance__Group__3__Impl rule__Entrance__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Entrance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__3"


    // $ANTLR start "rule__Entrance__Group__3__Impl"
    // InternalHouseBuilderV2.g:4164:1: rule__Entrance__Group__3__Impl : ( 'doorType' ) ;
    public final void rule__Entrance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4168:1: ( ( 'doorType' ) )
            // InternalHouseBuilderV2.g:4169:1: ( 'doorType' )
            {
            // InternalHouseBuilderV2.g:4169:1: ( 'doorType' )
            // InternalHouseBuilderV2.g:4170:2: 'doorType'
            {
             before(grammarAccess.getEntranceAccess().getDoorTypeKeyword_3()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getDoorTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__3__Impl"


    // $ANTLR start "rule__Entrance__Group__4"
    // InternalHouseBuilderV2.g:4179:1: rule__Entrance__Group__4 : rule__Entrance__Group__4__Impl rule__Entrance__Group__5 ;
    public final void rule__Entrance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4183:1: ( rule__Entrance__Group__4__Impl rule__Entrance__Group__5 )
            // InternalHouseBuilderV2.g:4184:2: rule__Entrance__Group__4__Impl rule__Entrance__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Entrance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__4"


    // $ANTLR start "rule__Entrance__Group__4__Impl"
    // InternalHouseBuilderV2.g:4191:1: rule__Entrance__Group__4__Impl : ( ( rule__Entrance__DoorTypeAssignment_4 ) ) ;
    public final void rule__Entrance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4195:1: ( ( ( rule__Entrance__DoorTypeAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:4196:1: ( ( rule__Entrance__DoorTypeAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:4196:1: ( ( rule__Entrance__DoorTypeAssignment_4 ) )
            // InternalHouseBuilderV2.g:4197:2: ( rule__Entrance__DoorTypeAssignment_4 )
            {
             before(grammarAccess.getEntranceAccess().getDoorTypeAssignment_4()); 
            // InternalHouseBuilderV2.g:4198:2: ( rule__Entrance__DoorTypeAssignment_4 )
            // InternalHouseBuilderV2.g:4198:3: rule__Entrance__DoorTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DoorTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDoorTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__4__Impl"


    // $ANTLR start "rule__Entrance__Group__5"
    // InternalHouseBuilderV2.g:4206:1: rule__Entrance__Group__5 : rule__Entrance__Group__5__Impl rule__Entrance__Group__6 ;
    public final void rule__Entrance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4210:1: ( rule__Entrance__Group__5__Impl rule__Entrance__Group__6 )
            // InternalHouseBuilderV2.g:4211:2: rule__Entrance__Group__5__Impl rule__Entrance__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Entrance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__5"


    // $ANTLR start "rule__Entrance__Group__5__Impl"
    // InternalHouseBuilderV2.g:4218:1: rule__Entrance__Group__5__Impl : ( 'doorsNumber' ) ;
    public final void rule__Entrance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4222:1: ( ( 'doorsNumber' ) )
            // InternalHouseBuilderV2.g:4223:1: ( 'doorsNumber' )
            {
            // InternalHouseBuilderV2.g:4223:1: ( 'doorsNumber' )
            // InternalHouseBuilderV2.g:4224:2: 'doorsNumber'
            {
             before(grammarAccess.getEntranceAccess().getDoorsNumberKeyword_5()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getDoorsNumberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__5__Impl"


    // $ANTLR start "rule__Entrance__Group__6"
    // InternalHouseBuilderV2.g:4233:1: rule__Entrance__Group__6 : rule__Entrance__Group__6__Impl rule__Entrance__Group__7 ;
    public final void rule__Entrance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4237:1: ( rule__Entrance__Group__6__Impl rule__Entrance__Group__7 )
            // InternalHouseBuilderV2.g:4238:2: rule__Entrance__Group__6__Impl rule__Entrance__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Entrance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__6"


    // $ANTLR start "rule__Entrance__Group__6__Impl"
    // InternalHouseBuilderV2.g:4245:1: rule__Entrance__Group__6__Impl : ( ( rule__Entrance__DoorsNumberAssignment_6 ) ) ;
    public final void rule__Entrance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4249:1: ( ( ( rule__Entrance__DoorsNumberAssignment_6 ) ) )
            // InternalHouseBuilderV2.g:4250:1: ( ( rule__Entrance__DoorsNumberAssignment_6 ) )
            {
            // InternalHouseBuilderV2.g:4250:1: ( ( rule__Entrance__DoorsNumberAssignment_6 ) )
            // InternalHouseBuilderV2.g:4251:2: ( rule__Entrance__DoorsNumberAssignment_6 )
            {
             before(grammarAccess.getEntranceAccess().getDoorsNumberAssignment_6()); 
            // InternalHouseBuilderV2.g:4252:2: ( rule__Entrance__DoorsNumberAssignment_6 )
            // InternalHouseBuilderV2.g:4252:3: rule__Entrance__DoorsNumberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DoorsNumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDoorsNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__6__Impl"


    // $ANTLR start "rule__Entrance__Group__7"
    // InternalHouseBuilderV2.g:4260:1: rule__Entrance__Group__7 : rule__Entrance__Group__7__Impl rule__Entrance__Group__8 ;
    public final void rule__Entrance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4264:1: ( rule__Entrance__Group__7__Impl rule__Entrance__Group__8 )
            // InternalHouseBuilderV2.g:4265:2: rule__Entrance__Group__7__Impl rule__Entrance__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Entrance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__7"


    // $ANTLR start "rule__Entrance__Group__7__Impl"
    // InternalHouseBuilderV2.g:4272:1: rule__Entrance__Group__7__Impl : ( 'width' ) ;
    public final void rule__Entrance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4276:1: ( ( 'width' ) )
            // InternalHouseBuilderV2.g:4277:1: ( 'width' )
            {
            // InternalHouseBuilderV2.g:4277:1: ( 'width' )
            // InternalHouseBuilderV2.g:4278:2: 'width'
            {
             before(grammarAccess.getEntranceAccess().getWidthKeyword_7()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getWidthKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__7__Impl"


    // $ANTLR start "rule__Entrance__Group__8"
    // InternalHouseBuilderV2.g:4287:1: rule__Entrance__Group__8 : rule__Entrance__Group__8__Impl rule__Entrance__Group__9 ;
    public final void rule__Entrance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4291:1: ( rule__Entrance__Group__8__Impl rule__Entrance__Group__9 )
            // InternalHouseBuilderV2.g:4292:2: rule__Entrance__Group__8__Impl rule__Entrance__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Entrance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__8"


    // $ANTLR start "rule__Entrance__Group__8__Impl"
    // InternalHouseBuilderV2.g:4299:1: rule__Entrance__Group__8__Impl : ( ( rule__Entrance__WidthAssignment_8 ) ) ;
    public final void rule__Entrance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4303:1: ( ( ( rule__Entrance__WidthAssignment_8 ) ) )
            // InternalHouseBuilderV2.g:4304:1: ( ( rule__Entrance__WidthAssignment_8 ) )
            {
            // InternalHouseBuilderV2.g:4304:1: ( ( rule__Entrance__WidthAssignment_8 ) )
            // InternalHouseBuilderV2.g:4305:2: ( rule__Entrance__WidthAssignment_8 )
            {
             before(grammarAccess.getEntranceAccess().getWidthAssignment_8()); 
            // InternalHouseBuilderV2.g:4306:2: ( rule__Entrance__WidthAssignment_8 )
            // InternalHouseBuilderV2.g:4306:3: rule__Entrance__WidthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__WidthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getWidthAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__8__Impl"


    // $ANTLR start "rule__Entrance__Group__9"
    // InternalHouseBuilderV2.g:4314:1: rule__Entrance__Group__9 : rule__Entrance__Group__9__Impl rule__Entrance__Group__10 ;
    public final void rule__Entrance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4318:1: ( rule__Entrance__Group__9__Impl rule__Entrance__Group__10 )
            // InternalHouseBuilderV2.g:4319:2: rule__Entrance__Group__9__Impl rule__Entrance__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Entrance__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__9"


    // $ANTLR start "rule__Entrance__Group__9__Impl"
    // InternalHouseBuilderV2.g:4326:1: rule__Entrance__Group__9__Impl : ( 'height' ) ;
    public final void rule__Entrance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4330:1: ( ( 'height' ) )
            // InternalHouseBuilderV2.g:4331:1: ( 'height' )
            {
            // InternalHouseBuilderV2.g:4331:1: ( 'height' )
            // InternalHouseBuilderV2.g:4332:2: 'height'
            {
             before(grammarAccess.getEntranceAccess().getHeightKeyword_9()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getHeightKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__9__Impl"


    // $ANTLR start "rule__Entrance__Group__10"
    // InternalHouseBuilderV2.g:4341:1: rule__Entrance__Group__10 : rule__Entrance__Group__10__Impl rule__Entrance__Group__11 ;
    public final void rule__Entrance__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4345:1: ( rule__Entrance__Group__10__Impl rule__Entrance__Group__11 )
            // InternalHouseBuilderV2.g:4346:2: rule__Entrance__Group__10__Impl rule__Entrance__Group__11
            {
            pushFollow(FOLLOW_34);
            rule__Entrance__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__10"


    // $ANTLR start "rule__Entrance__Group__10__Impl"
    // InternalHouseBuilderV2.g:4353:1: rule__Entrance__Group__10__Impl : ( ( rule__Entrance__HeightAssignment_10 ) ) ;
    public final void rule__Entrance__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4357:1: ( ( ( rule__Entrance__HeightAssignment_10 ) ) )
            // InternalHouseBuilderV2.g:4358:1: ( ( rule__Entrance__HeightAssignment_10 ) )
            {
            // InternalHouseBuilderV2.g:4358:1: ( ( rule__Entrance__HeightAssignment_10 ) )
            // InternalHouseBuilderV2.g:4359:2: ( rule__Entrance__HeightAssignment_10 )
            {
             before(grammarAccess.getEntranceAccess().getHeightAssignment_10()); 
            // InternalHouseBuilderV2.g:4360:2: ( rule__Entrance__HeightAssignment_10 )
            // InternalHouseBuilderV2.g:4360:3: rule__Entrance__HeightAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__HeightAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getHeightAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__10__Impl"


    // $ANTLR start "rule__Entrance__Group__11"
    // InternalHouseBuilderV2.g:4368:1: rule__Entrance__Group__11 : rule__Entrance__Group__11__Impl rule__Entrance__Group__12 ;
    public final void rule__Entrance__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4372:1: ( rule__Entrance__Group__11__Impl rule__Entrance__Group__12 )
            // InternalHouseBuilderV2.g:4373:2: rule__Entrance__Group__11__Impl rule__Entrance__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__Entrance__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__11"


    // $ANTLR start "rule__Entrance__Group__11__Impl"
    // InternalHouseBuilderV2.g:4380:1: rule__Entrance__Group__11__Impl : ( 'space' ) ;
    public final void rule__Entrance__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4384:1: ( ( 'space' ) )
            // InternalHouseBuilderV2.g:4385:1: ( 'space' )
            {
            // InternalHouseBuilderV2.g:4385:1: ( 'space' )
            // InternalHouseBuilderV2.g:4386:2: 'space'
            {
             before(grammarAccess.getEntranceAccess().getSpaceKeyword_11()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getSpaceKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__11__Impl"


    // $ANTLR start "rule__Entrance__Group__12"
    // InternalHouseBuilderV2.g:4395:1: rule__Entrance__Group__12 : rule__Entrance__Group__12__Impl rule__Entrance__Group__13 ;
    public final void rule__Entrance__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4399:1: ( rule__Entrance__Group__12__Impl rule__Entrance__Group__13 )
            // InternalHouseBuilderV2.g:4400:2: rule__Entrance__Group__12__Impl rule__Entrance__Group__13
            {
            pushFollow(FOLLOW_27);
            rule__Entrance__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__12"


    // $ANTLR start "rule__Entrance__Group__12__Impl"
    // InternalHouseBuilderV2.g:4407:1: rule__Entrance__Group__12__Impl : ( ( rule__Entrance__SpaceAssignment_12 ) ) ;
    public final void rule__Entrance__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4411:1: ( ( ( rule__Entrance__SpaceAssignment_12 ) ) )
            // InternalHouseBuilderV2.g:4412:1: ( ( rule__Entrance__SpaceAssignment_12 ) )
            {
            // InternalHouseBuilderV2.g:4412:1: ( ( rule__Entrance__SpaceAssignment_12 ) )
            // InternalHouseBuilderV2.g:4413:2: ( rule__Entrance__SpaceAssignment_12 )
            {
             before(grammarAccess.getEntranceAccess().getSpaceAssignment_12()); 
            // InternalHouseBuilderV2.g:4414:2: ( rule__Entrance__SpaceAssignment_12 )
            // InternalHouseBuilderV2.g:4414:3: rule__Entrance__SpaceAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__SpaceAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getSpaceAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__12__Impl"


    // $ANTLR start "rule__Entrance__Group__13"
    // InternalHouseBuilderV2.g:4422:1: rule__Entrance__Group__13 : rule__Entrance__Group__13__Impl rule__Entrance__Group__14 ;
    public final void rule__Entrance__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4426:1: ( rule__Entrance__Group__13__Impl rule__Entrance__Group__14 )
            // InternalHouseBuilderV2.g:4427:2: rule__Entrance__Group__13__Impl rule__Entrance__Group__14
            {
            pushFollow(FOLLOW_27);
            rule__Entrance__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__13"


    // $ANTLR start "rule__Entrance__Group__13__Impl"
    // InternalHouseBuilderV2.g:4434:1: rule__Entrance__Group__13__Impl : ( ( rule__Entrance__Group_13__0 )? ) ;
    public final void rule__Entrance__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4438:1: ( ( ( rule__Entrance__Group_13__0 )? ) )
            // InternalHouseBuilderV2.g:4439:1: ( ( rule__Entrance__Group_13__0 )? )
            {
            // InternalHouseBuilderV2.g:4439:1: ( ( rule__Entrance__Group_13__0 )? )
            // InternalHouseBuilderV2.g:4440:2: ( rule__Entrance__Group_13__0 )?
            {
             before(grammarAccess.getEntranceAccess().getGroup_13()); 
            // InternalHouseBuilderV2.g:4441:2: ( rule__Entrance__Group_13__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==82) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHouseBuilderV2.g:4441:3: rule__Entrance__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrance__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntranceAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__13__Impl"


    // $ANTLR start "rule__Entrance__Group__14"
    // InternalHouseBuilderV2.g:4449:1: rule__Entrance__Group__14 : rule__Entrance__Group__14__Impl ;
    public final void rule__Entrance__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4453:1: ( rule__Entrance__Group__14__Impl )
            // InternalHouseBuilderV2.g:4454:2: rule__Entrance__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__14"


    // $ANTLR start "rule__Entrance__Group__14__Impl"
    // InternalHouseBuilderV2.g:4460:1: rule__Entrance__Group__14__Impl : ( '}' ) ;
    public final void rule__Entrance__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4464:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:4465:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:4465:1: ( '}' )
            // InternalHouseBuilderV2.g:4466:2: '}'
            {
             before(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_14()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__14__Impl"


    // $ANTLR start "rule__Entrance__Group_13__0"
    // InternalHouseBuilderV2.g:4476:1: rule__Entrance__Group_13__0 : rule__Entrance__Group_13__0__Impl rule__Entrance__Group_13__1 ;
    public final void rule__Entrance__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4480:1: ( rule__Entrance__Group_13__0__Impl rule__Entrance__Group_13__1 )
            // InternalHouseBuilderV2.g:4481:2: rule__Entrance__Group_13__0__Impl rule__Entrance__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__Entrance__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__0"


    // $ANTLR start "rule__Entrance__Group_13__0__Impl"
    // InternalHouseBuilderV2.g:4488:1: rule__Entrance__Group_13__0__Impl : ( 'devices' ) ;
    public final void rule__Entrance__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4492:1: ( ( 'devices' ) )
            // InternalHouseBuilderV2.g:4493:1: ( 'devices' )
            {
            // InternalHouseBuilderV2.g:4493:1: ( 'devices' )
            // InternalHouseBuilderV2.g:4494:2: 'devices'
            {
             before(grammarAccess.getEntranceAccess().getDevicesKeyword_13_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getDevicesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__0__Impl"


    // $ANTLR start "rule__Entrance__Group_13__1"
    // InternalHouseBuilderV2.g:4503:1: rule__Entrance__Group_13__1 : rule__Entrance__Group_13__1__Impl rule__Entrance__Group_13__2 ;
    public final void rule__Entrance__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4507:1: ( rule__Entrance__Group_13__1__Impl rule__Entrance__Group_13__2 )
            // InternalHouseBuilderV2.g:4508:2: rule__Entrance__Group_13__1__Impl rule__Entrance__Group_13__2
            {
            pushFollow(FOLLOW_28);
            rule__Entrance__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__1"


    // $ANTLR start "rule__Entrance__Group_13__1__Impl"
    // InternalHouseBuilderV2.g:4515:1: rule__Entrance__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Entrance__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4519:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:4520:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:4520:1: ( '{' )
            // InternalHouseBuilderV2.g:4521:2: '{'
            {
             before(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__1__Impl"


    // $ANTLR start "rule__Entrance__Group_13__2"
    // InternalHouseBuilderV2.g:4530:1: rule__Entrance__Group_13__2 : rule__Entrance__Group_13__2__Impl rule__Entrance__Group_13__3 ;
    public final void rule__Entrance__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4534:1: ( rule__Entrance__Group_13__2__Impl rule__Entrance__Group_13__3 )
            // InternalHouseBuilderV2.g:4535:2: rule__Entrance__Group_13__2__Impl rule__Entrance__Group_13__3
            {
            pushFollow(FOLLOW_7);
            rule__Entrance__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__2"


    // $ANTLR start "rule__Entrance__Group_13__2__Impl"
    // InternalHouseBuilderV2.g:4542:1: rule__Entrance__Group_13__2__Impl : ( ( rule__Entrance__DevicesAssignment_13_2 ) ) ;
    public final void rule__Entrance__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4546:1: ( ( ( rule__Entrance__DevicesAssignment_13_2 ) ) )
            // InternalHouseBuilderV2.g:4547:1: ( ( rule__Entrance__DevicesAssignment_13_2 ) )
            {
            // InternalHouseBuilderV2.g:4547:1: ( ( rule__Entrance__DevicesAssignment_13_2 ) )
            // InternalHouseBuilderV2.g:4548:2: ( rule__Entrance__DevicesAssignment_13_2 )
            {
             before(grammarAccess.getEntranceAccess().getDevicesAssignment_13_2()); 
            // InternalHouseBuilderV2.g:4549:2: ( rule__Entrance__DevicesAssignment_13_2 )
            // InternalHouseBuilderV2.g:4549:3: rule__Entrance__DevicesAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DevicesAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDevicesAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__2__Impl"


    // $ANTLR start "rule__Entrance__Group_13__3"
    // InternalHouseBuilderV2.g:4557:1: rule__Entrance__Group_13__3 : rule__Entrance__Group_13__3__Impl rule__Entrance__Group_13__4 ;
    public final void rule__Entrance__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4561:1: ( rule__Entrance__Group_13__3__Impl rule__Entrance__Group_13__4 )
            // InternalHouseBuilderV2.g:4562:2: rule__Entrance__Group_13__3__Impl rule__Entrance__Group_13__4
            {
            pushFollow(FOLLOW_7);
            rule__Entrance__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__3"


    // $ANTLR start "rule__Entrance__Group_13__3__Impl"
    // InternalHouseBuilderV2.g:4569:1: rule__Entrance__Group_13__3__Impl : ( ( rule__Entrance__Group_13_3__0 )* ) ;
    public final void rule__Entrance__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4573:1: ( ( ( rule__Entrance__Group_13_3__0 )* ) )
            // InternalHouseBuilderV2.g:4574:1: ( ( rule__Entrance__Group_13_3__0 )* )
            {
            // InternalHouseBuilderV2.g:4574:1: ( ( rule__Entrance__Group_13_3__0 )* )
            // InternalHouseBuilderV2.g:4575:2: ( rule__Entrance__Group_13_3__0 )*
            {
             before(grammarAccess.getEntranceAccess().getGroup_13_3()); 
            // InternalHouseBuilderV2.g:4576:2: ( rule__Entrance__Group_13_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==69) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:4576:3: rule__Entrance__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entrance__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEntranceAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__3__Impl"


    // $ANTLR start "rule__Entrance__Group_13__4"
    // InternalHouseBuilderV2.g:4584:1: rule__Entrance__Group_13__4 : rule__Entrance__Group_13__4__Impl ;
    public final void rule__Entrance__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4588:1: ( rule__Entrance__Group_13__4__Impl )
            // InternalHouseBuilderV2.g:4589:2: rule__Entrance__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__4"


    // $ANTLR start "rule__Entrance__Group_13__4__Impl"
    // InternalHouseBuilderV2.g:4595:1: rule__Entrance__Group_13__4__Impl : ( '}' ) ;
    public final void rule__Entrance__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4599:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:4600:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:4600:1: ( '}' )
            // InternalHouseBuilderV2.g:4601:2: '}'
            {
             before(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13__4__Impl"


    // $ANTLR start "rule__Entrance__Group_13_3__0"
    // InternalHouseBuilderV2.g:4611:1: rule__Entrance__Group_13_3__0 : rule__Entrance__Group_13_3__0__Impl rule__Entrance__Group_13_3__1 ;
    public final void rule__Entrance__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4615:1: ( rule__Entrance__Group_13_3__0__Impl rule__Entrance__Group_13_3__1 )
            // InternalHouseBuilderV2.g:4616:2: rule__Entrance__Group_13_3__0__Impl rule__Entrance__Group_13_3__1
            {
            pushFollow(FOLLOW_28);
            rule__Entrance__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13_3__0"


    // $ANTLR start "rule__Entrance__Group_13_3__0__Impl"
    // InternalHouseBuilderV2.g:4623:1: rule__Entrance__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Entrance__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4627:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:4628:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:4628:1: ( ',' )
            // InternalHouseBuilderV2.g:4629:2: ','
            {
             before(grammarAccess.getEntranceAccess().getCommaKeyword_13_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13_3__0__Impl"


    // $ANTLR start "rule__Entrance__Group_13_3__1"
    // InternalHouseBuilderV2.g:4638:1: rule__Entrance__Group_13_3__1 : rule__Entrance__Group_13_3__1__Impl ;
    public final void rule__Entrance__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4642:1: ( rule__Entrance__Group_13_3__1__Impl )
            // InternalHouseBuilderV2.g:4643:2: rule__Entrance__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13_3__1"


    // $ANTLR start "rule__Entrance__Group_13_3__1__Impl"
    // InternalHouseBuilderV2.g:4649:1: rule__Entrance__Group_13_3__1__Impl : ( ( rule__Entrance__DevicesAssignment_13_3_1 ) ) ;
    public final void rule__Entrance__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4653:1: ( ( ( rule__Entrance__DevicesAssignment_13_3_1 ) ) )
            // InternalHouseBuilderV2.g:4654:1: ( ( rule__Entrance__DevicesAssignment_13_3_1 ) )
            {
            // InternalHouseBuilderV2.g:4654:1: ( ( rule__Entrance__DevicesAssignment_13_3_1 ) )
            // InternalHouseBuilderV2.g:4655:2: ( rule__Entrance__DevicesAssignment_13_3_1 )
            {
             before(grammarAccess.getEntranceAccess().getDevicesAssignment_13_3_1()); 
            // InternalHouseBuilderV2.g:4656:2: ( rule__Entrance__DevicesAssignment_13_3_1 )
            // InternalHouseBuilderV2.g:4656:3: rule__Entrance__DevicesAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DevicesAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDevicesAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_13_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalHouseBuilderV2.g:4665:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4669:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalHouseBuilderV2.g:4670:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalHouseBuilderV2.g:4677:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4681:1: ( ( ( '-' )? ) )
            // InternalHouseBuilderV2.g:4682:1: ( ( '-' )? )
            {
            // InternalHouseBuilderV2.g:4682:1: ( ( '-' )? )
            // InternalHouseBuilderV2.g:4683:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalHouseBuilderV2.g:4684:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==91) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalHouseBuilderV2.g:4684:3: '-'
                    {
                    match(input,91,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalHouseBuilderV2.g:4692:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4696:1: ( rule__EInt__Group__1__Impl )
            // InternalHouseBuilderV2.g:4697:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalHouseBuilderV2.g:4703:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4707:1: ( ( RULE_INT ) )
            // InternalHouseBuilderV2.g:4708:1: ( RULE_INT )
            {
            // InternalHouseBuilderV2.g:4708:1: ( RULE_INT )
            // InternalHouseBuilderV2.g:4709:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalHouseBuilderV2.g:4719:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4723:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalHouseBuilderV2.g:4724:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalHouseBuilderV2.g:4731:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4735:1: ( ( ( '-' )? ) )
            // InternalHouseBuilderV2.g:4736:1: ( ( '-' )? )
            {
            // InternalHouseBuilderV2.g:4736:1: ( ( '-' )? )
            // InternalHouseBuilderV2.g:4737:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalHouseBuilderV2.g:4738:2: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==91) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalHouseBuilderV2.g:4738:3: '-'
                    {
                    match(input,91,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalHouseBuilderV2.g:4746:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4750:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalHouseBuilderV2.g:4751:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalHouseBuilderV2.g:4758:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4762:1: ( ( ( RULE_INT )? ) )
            // InternalHouseBuilderV2.g:4763:1: ( ( RULE_INT )? )
            {
            // InternalHouseBuilderV2.g:4763:1: ( ( RULE_INT )? )
            // InternalHouseBuilderV2.g:4764:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalHouseBuilderV2.g:4765:2: ( RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalHouseBuilderV2.g:4765:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalHouseBuilderV2.g:4773:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4777:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalHouseBuilderV2.g:4778:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalHouseBuilderV2.g:4785:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4789:1: ( ( '.' ) )
            // InternalHouseBuilderV2.g:4790:1: ( '.' )
            {
            // InternalHouseBuilderV2.g:4790:1: ( '.' )
            // InternalHouseBuilderV2.g:4791:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalHouseBuilderV2.g:4800:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4804:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalHouseBuilderV2.g:4805:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalHouseBuilderV2.g:4812:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4816:1: ( ( RULE_INT ) )
            // InternalHouseBuilderV2.g:4817:1: ( RULE_INT )
            {
            // InternalHouseBuilderV2.g:4817:1: ( RULE_INT )
            // InternalHouseBuilderV2.g:4818:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalHouseBuilderV2.g:4827:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4831:1: ( rule__EFloat__Group__4__Impl )
            // InternalHouseBuilderV2.g:4832:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalHouseBuilderV2.g:4838:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4842:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalHouseBuilderV2.g:4843:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalHouseBuilderV2.g:4843:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalHouseBuilderV2.g:4844:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalHouseBuilderV2.g:4845:2: ( rule__EFloat__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=12 && LA35_0<=13)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalHouseBuilderV2.g:4845:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalHouseBuilderV2.g:4854:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4858:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalHouseBuilderV2.g:4859:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalHouseBuilderV2.g:4866:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4870:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalHouseBuilderV2.g:4871:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalHouseBuilderV2.g:4871:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalHouseBuilderV2.g:4872:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalHouseBuilderV2.g:4873:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalHouseBuilderV2.g:4873:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalHouseBuilderV2.g:4881:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4885:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalHouseBuilderV2.g:4886:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalHouseBuilderV2.g:4893:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4897:1: ( ( ( '-' )? ) )
            // InternalHouseBuilderV2.g:4898:1: ( ( '-' )? )
            {
            // InternalHouseBuilderV2.g:4898:1: ( ( '-' )? )
            // InternalHouseBuilderV2.g:4899:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalHouseBuilderV2.g:4900:2: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==91) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalHouseBuilderV2.g:4900:3: '-'
                    {
                    match(input,91,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalHouseBuilderV2.g:4908:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4912:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalHouseBuilderV2.g:4913:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalHouseBuilderV2.g:4919:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4923:1: ( ( RULE_INT ) )
            // InternalHouseBuilderV2.g:4924:1: ( RULE_INT )
            {
            // InternalHouseBuilderV2.g:4924:1: ( RULE_INT )
            // InternalHouseBuilderV2.g:4925:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalHouseBuilderV2.g:4935:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4939:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalHouseBuilderV2.g:4940:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalHouseBuilderV2.g:4947:1: rule__Device__Group__0__Impl : ( () ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4951:1: ( ( () ) )
            // InternalHouseBuilderV2.g:4952:1: ( () )
            {
            // InternalHouseBuilderV2.g:4952:1: ( () )
            // InternalHouseBuilderV2.g:4953:2: ()
            {
             before(grammarAccess.getDeviceAccess().getDeviceAction_0()); 
            // InternalHouseBuilderV2.g:4954:2: ()
            // InternalHouseBuilderV2.g:4954:3: 
            {
            }

             after(grammarAccess.getDeviceAccess().getDeviceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalHouseBuilderV2.g:4962:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4966:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalHouseBuilderV2.g:4967:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalHouseBuilderV2.g:4974:1: rule__Device__Group__1__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4978:1: ( ( 'Device' ) )
            // InternalHouseBuilderV2.g:4979:1: ( 'Device' )
            {
            // InternalHouseBuilderV2.g:4979:1: ( 'Device' )
            // InternalHouseBuilderV2.g:4980:2: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_1()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalHouseBuilderV2.g:4989:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:4993:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalHouseBuilderV2.g:4994:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalHouseBuilderV2.g:5001:1: rule__Device__Group__2__Impl : ( ( rule__Device__NameAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5005:1: ( ( ( rule__Device__NameAssignment_2 ) ) )
            // InternalHouseBuilderV2.g:5006:1: ( ( rule__Device__NameAssignment_2 ) )
            {
            // InternalHouseBuilderV2.g:5006:1: ( ( rule__Device__NameAssignment_2 ) )
            // InternalHouseBuilderV2.g:5007:2: ( rule__Device__NameAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_2()); 
            // InternalHouseBuilderV2.g:5008:2: ( rule__Device__NameAssignment_2 )
            // InternalHouseBuilderV2.g:5008:3: rule__Device__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalHouseBuilderV2.g:5016:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5020:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalHouseBuilderV2.g:5021:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalHouseBuilderV2.g:5028:1: rule__Device__Group__3__Impl : ( '{' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5032:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:5033:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:5033:1: ( '{' )
            // InternalHouseBuilderV2.g:5034:2: '{'
            {
             before(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalHouseBuilderV2.g:5043:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5047:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalHouseBuilderV2.g:5048:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalHouseBuilderV2.g:5055:1: rule__Device__Group__4__Impl : ( ( rule__Device__Group_4__0 )? ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5059:1: ( ( ( rule__Device__Group_4__0 )? ) )
            // InternalHouseBuilderV2.g:5060:1: ( ( rule__Device__Group_4__0 )? )
            {
            // InternalHouseBuilderV2.g:5060:1: ( ( rule__Device__Group_4__0 )? )
            // InternalHouseBuilderV2.g:5061:2: ( rule__Device__Group_4__0 )?
            {
             before(grammarAccess.getDeviceAccess().getGroup_4()); 
            // InternalHouseBuilderV2.g:5062:2: ( rule__Device__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==94) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalHouseBuilderV2.g:5062:3: rule__Device__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalHouseBuilderV2.g:5070:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5074:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalHouseBuilderV2.g:5075:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Device__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalHouseBuilderV2.g:5082:1: rule__Device__Group__5__Impl : ( ( rule__Device__Group_5__0 )? ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5086:1: ( ( ( rule__Device__Group_5__0 )? ) )
            // InternalHouseBuilderV2.g:5087:1: ( ( rule__Device__Group_5__0 )? )
            {
            // InternalHouseBuilderV2.g:5087:1: ( ( rule__Device__Group_5__0 )? )
            // InternalHouseBuilderV2.g:5088:2: ( rule__Device__Group_5__0 )?
            {
             before(grammarAccess.getDeviceAccess().getGroup_5()); 
            // InternalHouseBuilderV2.g:5089:2: ( rule__Device__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==84) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalHouseBuilderV2.g:5089:3: rule__Device__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group__6"
    // InternalHouseBuilderV2.g:5097:1: rule__Device__Group__6 : rule__Device__Group__6__Impl rule__Device__Group__7 ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5101:1: ( rule__Device__Group__6__Impl rule__Device__Group__7 )
            // InternalHouseBuilderV2.g:5102:2: rule__Device__Group__6__Impl rule__Device__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__Device__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6"


    // $ANTLR start "rule__Device__Group__6__Impl"
    // InternalHouseBuilderV2.g:5109:1: rule__Device__Group__6__Impl : ( ( rule__Device__Group_6__0 )? ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5113:1: ( ( ( rule__Device__Group_6__0 )? ) )
            // InternalHouseBuilderV2.g:5114:1: ( ( rule__Device__Group_6__0 )? )
            {
            // InternalHouseBuilderV2.g:5114:1: ( ( rule__Device__Group_6__0 )? )
            // InternalHouseBuilderV2.g:5115:2: ( rule__Device__Group_6__0 )?
            {
             before(grammarAccess.getDeviceAccess().getGroup_6()); 
            // InternalHouseBuilderV2.g:5116:2: ( rule__Device__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==95) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalHouseBuilderV2.g:5116:3: rule__Device__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6__Impl"


    // $ANTLR start "rule__Device__Group__7"
    // InternalHouseBuilderV2.g:5124:1: rule__Device__Group__7 : rule__Device__Group__7__Impl ;
    public final void rule__Device__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5128:1: ( rule__Device__Group__7__Impl )
            // InternalHouseBuilderV2.g:5129:2: rule__Device__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7"


    // $ANTLR start "rule__Device__Group__7__Impl"
    // InternalHouseBuilderV2.g:5135:1: rule__Device__Group__7__Impl : ( '}' ) ;
    public final void rule__Device__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5139:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:5140:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:5140:1: ( '}' )
            // InternalHouseBuilderV2.g:5141:2: '}'
            {
             before(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__7__Impl"


    // $ANTLR start "rule__Device__Group_4__0"
    // InternalHouseBuilderV2.g:5151:1: rule__Device__Group_4__0 : rule__Device__Group_4__0__Impl rule__Device__Group_4__1 ;
    public final void rule__Device__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5155:1: ( rule__Device__Group_4__0__Impl rule__Device__Group_4__1 )
            // InternalHouseBuilderV2.g:5156:2: rule__Device__Group_4__0__Impl rule__Device__Group_4__1
            {
            pushFollow(FOLLOW_38);
            rule__Device__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__0"


    // $ANTLR start "rule__Device__Group_4__0__Impl"
    // InternalHouseBuilderV2.g:5163:1: rule__Device__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Device__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5167:1: ( ( 'type' ) )
            // InternalHouseBuilderV2.g:5168:1: ( 'type' )
            {
            // InternalHouseBuilderV2.g:5168:1: ( 'type' )
            // InternalHouseBuilderV2.g:5169:2: 'type'
            {
             before(grammarAccess.getDeviceAccess().getTypeKeyword_4_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__0__Impl"


    // $ANTLR start "rule__Device__Group_4__1"
    // InternalHouseBuilderV2.g:5178:1: rule__Device__Group_4__1 : rule__Device__Group_4__1__Impl ;
    public final void rule__Device__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5182:1: ( rule__Device__Group_4__1__Impl )
            // InternalHouseBuilderV2.g:5183:2: rule__Device__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__1"


    // $ANTLR start "rule__Device__Group_4__1__Impl"
    // InternalHouseBuilderV2.g:5189:1: rule__Device__Group_4__1__Impl : ( ( rule__Device__TypeAssignment_4_1 ) ) ;
    public final void rule__Device__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5193:1: ( ( ( rule__Device__TypeAssignment_4_1 ) ) )
            // InternalHouseBuilderV2.g:5194:1: ( ( rule__Device__TypeAssignment_4_1 ) )
            {
            // InternalHouseBuilderV2.g:5194:1: ( ( rule__Device__TypeAssignment_4_1 ) )
            // InternalHouseBuilderV2.g:5195:2: ( rule__Device__TypeAssignment_4_1 )
            {
             before(grammarAccess.getDeviceAccess().getTypeAssignment_4_1()); 
            // InternalHouseBuilderV2.g:5196:2: ( rule__Device__TypeAssignment_4_1 )
            // InternalHouseBuilderV2.g:5196:3: rule__Device__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__1__Impl"


    // $ANTLR start "rule__Device__Group_5__0"
    // InternalHouseBuilderV2.g:5205:1: rule__Device__Group_5__0 : rule__Device__Group_5__0__Impl rule__Device__Group_5__1 ;
    public final void rule__Device__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5209:1: ( rule__Device__Group_5__0__Impl rule__Device__Group_5__1 )
            // InternalHouseBuilderV2.g:5210:2: rule__Device__Group_5__0__Impl rule__Device__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Device__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__0"


    // $ANTLR start "rule__Device__Group_5__0__Impl"
    // InternalHouseBuilderV2.g:5217:1: rule__Device__Group_5__0__Impl : ( 'model' ) ;
    public final void rule__Device__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5221:1: ( ( 'model' ) )
            // InternalHouseBuilderV2.g:5222:1: ( 'model' )
            {
            // InternalHouseBuilderV2.g:5222:1: ( 'model' )
            // InternalHouseBuilderV2.g:5223:2: 'model'
            {
             before(grammarAccess.getDeviceAccess().getModelKeyword_5_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getModelKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__0__Impl"


    // $ANTLR start "rule__Device__Group_5__1"
    // InternalHouseBuilderV2.g:5232:1: rule__Device__Group_5__1 : rule__Device__Group_5__1__Impl ;
    public final void rule__Device__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5236:1: ( rule__Device__Group_5__1__Impl )
            // InternalHouseBuilderV2.g:5237:2: rule__Device__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__1"


    // $ANTLR start "rule__Device__Group_5__1__Impl"
    // InternalHouseBuilderV2.g:5243:1: rule__Device__Group_5__1__Impl : ( ( rule__Device__ModelAssignment_5_1 ) ) ;
    public final void rule__Device__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5247:1: ( ( ( rule__Device__ModelAssignment_5_1 ) ) )
            // InternalHouseBuilderV2.g:5248:1: ( ( rule__Device__ModelAssignment_5_1 ) )
            {
            // InternalHouseBuilderV2.g:5248:1: ( ( rule__Device__ModelAssignment_5_1 ) )
            // InternalHouseBuilderV2.g:5249:2: ( rule__Device__ModelAssignment_5_1 )
            {
             before(grammarAccess.getDeviceAccess().getModelAssignment_5_1()); 
            // InternalHouseBuilderV2.g:5250:2: ( rule__Device__ModelAssignment_5_1 )
            // InternalHouseBuilderV2.g:5250:3: rule__Device__ModelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__ModelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getModelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__1__Impl"


    // $ANTLR start "rule__Device__Group_6__0"
    // InternalHouseBuilderV2.g:5259:1: rule__Device__Group_6__0 : rule__Device__Group_6__0__Impl rule__Device__Group_6__1 ;
    public final void rule__Device__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5263:1: ( rule__Device__Group_6__0__Impl rule__Device__Group_6__1 )
            // InternalHouseBuilderV2.g:5264:2: rule__Device__Group_6__0__Impl rule__Device__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Device__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__0"


    // $ANTLR start "rule__Device__Group_6__0__Impl"
    // InternalHouseBuilderV2.g:5271:1: rule__Device__Group_6__0__Impl : ( 'actuator' ) ;
    public final void rule__Device__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5275:1: ( ( 'actuator' ) )
            // InternalHouseBuilderV2.g:5276:1: ( 'actuator' )
            {
            // InternalHouseBuilderV2.g:5276:1: ( 'actuator' )
            // InternalHouseBuilderV2.g:5277:2: 'actuator'
            {
             before(grammarAccess.getDeviceAccess().getActuatorKeyword_6_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getActuatorKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__0__Impl"


    // $ANTLR start "rule__Device__Group_6__1"
    // InternalHouseBuilderV2.g:5286:1: rule__Device__Group_6__1 : rule__Device__Group_6__1__Impl ;
    public final void rule__Device__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5290:1: ( rule__Device__Group_6__1__Impl )
            // InternalHouseBuilderV2.g:5291:2: rule__Device__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__1"


    // $ANTLR start "rule__Device__Group_6__1__Impl"
    // InternalHouseBuilderV2.g:5297:1: rule__Device__Group_6__1__Impl : ( ( rule__Device__ActuatorAssignment_6_1 ) ) ;
    public final void rule__Device__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5301:1: ( ( ( rule__Device__ActuatorAssignment_6_1 ) ) )
            // InternalHouseBuilderV2.g:5302:1: ( ( rule__Device__ActuatorAssignment_6_1 ) )
            {
            // InternalHouseBuilderV2.g:5302:1: ( ( rule__Device__ActuatorAssignment_6_1 ) )
            // InternalHouseBuilderV2.g:5303:2: ( rule__Device__ActuatorAssignment_6_1 )
            {
             before(grammarAccess.getDeviceAccess().getActuatorAssignment_6_1()); 
            // InternalHouseBuilderV2.g:5304:2: ( rule__Device__ActuatorAssignment_6_1 )
            // InternalHouseBuilderV2.g:5304:3: rule__Device__ActuatorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__ActuatorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getActuatorAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalHouseBuilderV2.g:5313:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5317:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalHouseBuilderV2.g:5318:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalHouseBuilderV2.g:5325:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5329:1: ( ( 'Sensor' ) )
            // InternalHouseBuilderV2.g:5330:1: ( 'Sensor' )
            {
            // InternalHouseBuilderV2.g:5330:1: ( 'Sensor' )
            // InternalHouseBuilderV2.g:5331:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalHouseBuilderV2.g:5340:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5344:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalHouseBuilderV2.g:5345:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalHouseBuilderV2.g:5352:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5356:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:5357:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:5357:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:5358:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:5359:2: ( rule__Sensor__NameAssignment_1 )
            // InternalHouseBuilderV2.g:5359:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalHouseBuilderV2.g:5367:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5371:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalHouseBuilderV2.g:5372:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalHouseBuilderV2.g:5379:1: rule__Sensor__Group__2__Impl : ( '{' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5383:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:5384:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:5384:1: ( '{' )
            // InternalHouseBuilderV2.g:5385:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalHouseBuilderV2.g:5394:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5398:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalHouseBuilderV2.g:5399:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalHouseBuilderV2.g:5406:1: rule__Sensor__Group__3__Impl : ( 'type' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5410:1: ( ( 'type' ) )
            // InternalHouseBuilderV2.g:5411:1: ( 'type' )
            {
            // InternalHouseBuilderV2.g:5411:1: ( 'type' )
            // InternalHouseBuilderV2.g:5412:2: 'type'
            {
             before(grammarAccess.getSensorAccess().getTypeKeyword_3()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalHouseBuilderV2.g:5421:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5425:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalHouseBuilderV2.g:5426:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalHouseBuilderV2.g:5433:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__TypeAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5437:1: ( ( ( rule__Sensor__TypeAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:5438:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:5438:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            // InternalHouseBuilderV2.g:5439:2: ( rule__Sensor__TypeAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_4()); 
            // InternalHouseBuilderV2.g:5440:2: ( rule__Sensor__TypeAssignment_4 )
            // InternalHouseBuilderV2.g:5440:3: rule__Sensor__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalHouseBuilderV2.g:5448:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5452:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalHouseBuilderV2.g:5453:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalHouseBuilderV2.g:5460:1: rule__Sensor__Group__5__Impl : ( 'value' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5464:1: ( ( 'value' ) )
            // InternalHouseBuilderV2.g:5465:1: ( 'value' )
            {
            // InternalHouseBuilderV2.g:5465:1: ( 'value' )
            // InternalHouseBuilderV2.g:5466:2: 'value'
            {
             before(grammarAccess.getSensorAccess().getValueKeyword_5()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getValueKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalHouseBuilderV2.g:5475:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5479:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalHouseBuilderV2.g:5480:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalHouseBuilderV2.g:5487:1: rule__Sensor__Group__6__Impl : ( ( rule__Sensor__ValueAssignment_6 ) ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5491:1: ( ( ( rule__Sensor__ValueAssignment_6 ) ) )
            // InternalHouseBuilderV2.g:5492:1: ( ( rule__Sensor__ValueAssignment_6 ) )
            {
            // InternalHouseBuilderV2.g:5492:1: ( ( rule__Sensor__ValueAssignment_6 ) )
            // InternalHouseBuilderV2.g:5493:2: ( rule__Sensor__ValueAssignment_6 )
            {
             before(grammarAccess.getSensorAccess().getValueAssignment_6()); 
            // InternalHouseBuilderV2.g:5494:2: ( rule__Sensor__ValueAssignment_6 )
            // InternalHouseBuilderV2.g:5494:3: rule__Sensor__ValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalHouseBuilderV2.g:5502:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl rule__Sensor__Group__8 ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5506:1: ( rule__Sensor__Group__7__Impl rule__Sensor__Group__8 )
            // InternalHouseBuilderV2.g:5507:2: rule__Sensor__Group__7__Impl rule__Sensor__Group__8
            {
            pushFollow(FOLLOW_42);
            rule__Sensor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalHouseBuilderV2.g:5514:1: rule__Sensor__Group__7__Impl : ( ( rule__Sensor__Group_7__0 )? ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5518:1: ( ( ( rule__Sensor__Group_7__0 )? ) )
            // InternalHouseBuilderV2.g:5519:1: ( ( rule__Sensor__Group_7__0 )? )
            {
            // InternalHouseBuilderV2.g:5519:1: ( ( rule__Sensor__Group_7__0 )? )
            // InternalHouseBuilderV2.g:5520:2: ( rule__Sensor__Group_7__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_7()); 
            // InternalHouseBuilderV2.g:5521:2: ( rule__Sensor__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==84) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHouseBuilderV2.g:5521:3: rule__Sensor__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group__8"
    // InternalHouseBuilderV2.g:5529:1: rule__Sensor__Group__8 : rule__Sensor__Group__8__Impl rule__Sensor__Group__9 ;
    public final void rule__Sensor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5533:1: ( rule__Sensor__Group__8__Impl rule__Sensor__Group__9 )
            // InternalHouseBuilderV2.g:5534:2: rule__Sensor__Group__8__Impl rule__Sensor__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8"


    // $ANTLR start "rule__Sensor__Group__8__Impl"
    // InternalHouseBuilderV2.g:5541:1: rule__Sensor__Group__8__Impl : ( 'space' ) ;
    public final void rule__Sensor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5545:1: ( ( 'space' ) )
            // InternalHouseBuilderV2.g:5546:1: ( 'space' )
            {
            // InternalHouseBuilderV2.g:5546:1: ( 'space' )
            // InternalHouseBuilderV2.g:5547:2: 'space'
            {
             before(grammarAccess.getSensorAccess().getSpaceKeyword_8()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSpaceKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8__Impl"


    // $ANTLR start "rule__Sensor__Group__9"
    // InternalHouseBuilderV2.g:5556:1: rule__Sensor__Group__9 : rule__Sensor__Group__9__Impl rule__Sensor__Group__10 ;
    public final void rule__Sensor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5560:1: ( rule__Sensor__Group__9__Impl rule__Sensor__Group__10 )
            // InternalHouseBuilderV2.g:5561:2: rule__Sensor__Group__9__Impl rule__Sensor__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Sensor__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__9"


    // $ANTLR start "rule__Sensor__Group__9__Impl"
    // InternalHouseBuilderV2.g:5568:1: rule__Sensor__Group__9__Impl : ( ( rule__Sensor__SpaceAssignment_9 ) ) ;
    public final void rule__Sensor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5572:1: ( ( ( rule__Sensor__SpaceAssignment_9 ) ) )
            // InternalHouseBuilderV2.g:5573:1: ( ( rule__Sensor__SpaceAssignment_9 ) )
            {
            // InternalHouseBuilderV2.g:5573:1: ( ( rule__Sensor__SpaceAssignment_9 ) )
            // InternalHouseBuilderV2.g:5574:2: ( rule__Sensor__SpaceAssignment_9 )
            {
             before(grammarAccess.getSensorAccess().getSpaceAssignment_9()); 
            // InternalHouseBuilderV2.g:5575:2: ( rule__Sensor__SpaceAssignment_9 )
            // InternalHouseBuilderV2.g:5575:3: rule__Sensor__SpaceAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SpaceAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSpaceAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__9__Impl"


    // $ANTLR start "rule__Sensor__Group__10"
    // InternalHouseBuilderV2.g:5583:1: rule__Sensor__Group__10 : rule__Sensor__Group__10__Impl ;
    public final void rule__Sensor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5587:1: ( rule__Sensor__Group__10__Impl )
            // InternalHouseBuilderV2.g:5588:2: rule__Sensor__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__10"


    // $ANTLR start "rule__Sensor__Group__10__Impl"
    // InternalHouseBuilderV2.g:5594:1: rule__Sensor__Group__10__Impl : ( '}' ) ;
    public final void rule__Sensor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5598:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:5599:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:5599:1: ( '}' )
            // InternalHouseBuilderV2.g:5600:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_10()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__10__Impl"


    // $ANTLR start "rule__Sensor__Group_7__0"
    // InternalHouseBuilderV2.g:5610:1: rule__Sensor__Group_7__0 : rule__Sensor__Group_7__0__Impl rule__Sensor__Group_7__1 ;
    public final void rule__Sensor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5614:1: ( rule__Sensor__Group_7__0__Impl rule__Sensor__Group_7__1 )
            // InternalHouseBuilderV2.g:5615:2: rule__Sensor__Group_7__0__Impl rule__Sensor__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__0"


    // $ANTLR start "rule__Sensor__Group_7__0__Impl"
    // InternalHouseBuilderV2.g:5622:1: rule__Sensor__Group_7__0__Impl : ( 'model' ) ;
    public final void rule__Sensor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5626:1: ( ( 'model' ) )
            // InternalHouseBuilderV2.g:5627:1: ( 'model' )
            {
            // InternalHouseBuilderV2.g:5627:1: ( 'model' )
            // InternalHouseBuilderV2.g:5628:2: 'model'
            {
             before(grammarAccess.getSensorAccess().getModelKeyword_7_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getModelKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__0__Impl"


    // $ANTLR start "rule__Sensor__Group_7__1"
    // InternalHouseBuilderV2.g:5637:1: rule__Sensor__Group_7__1 : rule__Sensor__Group_7__1__Impl ;
    public final void rule__Sensor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5641:1: ( rule__Sensor__Group_7__1__Impl )
            // InternalHouseBuilderV2.g:5642:2: rule__Sensor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__1"


    // $ANTLR start "rule__Sensor__Group_7__1__Impl"
    // InternalHouseBuilderV2.g:5648:1: rule__Sensor__Group_7__1__Impl : ( ( rule__Sensor__ModelAssignment_7_1 ) ) ;
    public final void rule__Sensor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5652:1: ( ( ( rule__Sensor__ModelAssignment_7_1 ) ) )
            // InternalHouseBuilderV2.g:5653:1: ( ( rule__Sensor__ModelAssignment_7_1 ) )
            {
            // InternalHouseBuilderV2.g:5653:1: ( ( rule__Sensor__ModelAssignment_7_1 ) )
            // InternalHouseBuilderV2.g:5654:2: ( rule__Sensor__ModelAssignment_7_1 )
            {
             before(grammarAccess.getSensorAccess().getModelAssignment_7_1()); 
            // InternalHouseBuilderV2.g:5655:2: ( rule__Sensor__ModelAssignment_7_1 )
            // InternalHouseBuilderV2.g:5655:3: rule__Sensor__ModelAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ModelAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getModelAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalHouseBuilderV2.g:5664:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5668:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalHouseBuilderV2.g:5669:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalHouseBuilderV2.g:5676:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5680:1: ( ( 'Room' ) )
            // InternalHouseBuilderV2.g:5681:1: ( 'Room' )
            {
            // InternalHouseBuilderV2.g:5681:1: ( 'Room' )
            // InternalHouseBuilderV2.g:5682:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalHouseBuilderV2.g:5691:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5695:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalHouseBuilderV2.g:5696:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalHouseBuilderV2.g:5703:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5707:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:5708:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:5708:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:5709:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:5710:2: ( rule__Room__NameAssignment_1 )
            // InternalHouseBuilderV2.g:5710:3: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalHouseBuilderV2.g:5718:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5722:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalHouseBuilderV2.g:5723:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalHouseBuilderV2.g:5730:1: rule__Room__Group__2__Impl : ( '{' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5734:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:5735:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:5735:1: ( '{' )
            // InternalHouseBuilderV2.g:5736:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalHouseBuilderV2.g:5745:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5749:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalHouseBuilderV2.g:5750:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalHouseBuilderV2.g:5757:1: rule__Room__Group__3__Impl : ( 'length' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5761:1: ( ( 'length' ) )
            // InternalHouseBuilderV2.g:5762:1: ( 'length' )
            {
            // InternalHouseBuilderV2.g:5762:1: ( 'length' )
            // InternalHouseBuilderV2.g:5763:2: 'length'
            {
             before(grammarAccess.getRoomAccess().getLengthKeyword_3()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLengthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalHouseBuilderV2.g:5772:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5776:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalHouseBuilderV2.g:5777:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalHouseBuilderV2.g:5784:1: rule__Room__Group__4__Impl : ( ( rule__Room__LengthAssignment_4 ) ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5788:1: ( ( ( rule__Room__LengthAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:5789:1: ( ( rule__Room__LengthAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:5789:1: ( ( rule__Room__LengthAssignment_4 ) )
            // InternalHouseBuilderV2.g:5790:2: ( rule__Room__LengthAssignment_4 )
            {
             before(grammarAccess.getRoomAccess().getLengthAssignment_4()); 
            // InternalHouseBuilderV2.g:5791:2: ( rule__Room__LengthAssignment_4 )
            // InternalHouseBuilderV2.g:5791:3: rule__Room__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Room__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalHouseBuilderV2.g:5799:1: rule__Room__Group__5 : rule__Room__Group__5__Impl rule__Room__Group__6 ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5803:1: ( rule__Room__Group__5__Impl rule__Room__Group__6 )
            // InternalHouseBuilderV2.g:5804:2: rule__Room__Group__5__Impl rule__Room__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Room__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalHouseBuilderV2.g:5811:1: rule__Room__Group__5__Impl : ( 'width' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5815:1: ( ( 'width' ) )
            // InternalHouseBuilderV2.g:5816:1: ( 'width' )
            {
            // InternalHouseBuilderV2.g:5816:1: ( 'width' )
            // InternalHouseBuilderV2.g:5817:2: 'width'
            {
             before(grammarAccess.getRoomAccess().getWidthKeyword_5()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getWidthKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group__6"
    // InternalHouseBuilderV2.g:5826:1: rule__Room__Group__6 : rule__Room__Group__6__Impl rule__Room__Group__7 ;
    public final void rule__Room__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5830:1: ( rule__Room__Group__6__Impl rule__Room__Group__7 )
            // InternalHouseBuilderV2.g:5831:2: rule__Room__Group__6__Impl rule__Room__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Room__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__6"


    // $ANTLR start "rule__Room__Group__6__Impl"
    // InternalHouseBuilderV2.g:5838:1: rule__Room__Group__6__Impl : ( ( rule__Room__WidthAssignment_6 ) ) ;
    public final void rule__Room__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5842:1: ( ( ( rule__Room__WidthAssignment_6 ) ) )
            // InternalHouseBuilderV2.g:5843:1: ( ( rule__Room__WidthAssignment_6 ) )
            {
            // InternalHouseBuilderV2.g:5843:1: ( ( rule__Room__WidthAssignment_6 ) )
            // InternalHouseBuilderV2.g:5844:2: ( rule__Room__WidthAssignment_6 )
            {
             before(grammarAccess.getRoomAccess().getWidthAssignment_6()); 
            // InternalHouseBuilderV2.g:5845:2: ( rule__Room__WidthAssignment_6 )
            // InternalHouseBuilderV2.g:5845:3: rule__Room__WidthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Room__WidthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getWidthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__6__Impl"


    // $ANTLR start "rule__Room__Group__7"
    // InternalHouseBuilderV2.g:5853:1: rule__Room__Group__7 : rule__Room__Group__7__Impl rule__Room__Group__8 ;
    public final void rule__Room__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5857:1: ( rule__Room__Group__7__Impl rule__Room__Group__8 )
            // InternalHouseBuilderV2.g:5858:2: rule__Room__Group__7__Impl rule__Room__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Room__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__7"


    // $ANTLR start "rule__Room__Group__7__Impl"
    // InternalHouseBuilderV2.g:5865:1: rule__Room__Group__7__Impl : ( 'height' ) ;
    public final void rule__Room__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5869:1: ( ( 'height' ) )
            // InternalHouseBuilderV2.g:5870:1: ( 'height' )
            {
            // InternalHouseBuilderV2.g:5870:1: ( 'height' )
            // InternalHouseBuilderV2.g:5871:2: 'height'
            {
             before(grammarAccess.getRoomAccess().getHeightKeyword_7()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getHeightKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__7__Impl"


    // $ANTLR start "rule__Room__Group__8"
    // InternalHouseBuilderV2.g:5880:1: rule__Room__Group__8 : rule__Room__Group__8__Impl rule__Room__Group__9 ;
    public final void rule__Room__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5884:1: ( rule__Room__Group__8__Impl rule__Room__Group__9 )
            // InternalHouseBuilderV2.g:5885:2: rule__Room__Group__8__Impl rule__Room__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__8"


    // $ANTLR start "rule__Room__Group__8__Impl"
    // InternalHouseBuilderV2.g:5892:1: rule__Room__Group__8__Impl : ( ( rule__Room__HeightAssignment_8 ) ) ;
    public final void rule__Room__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5896:1: ( ( ( rule__Room__HeightAssignment_8 ) ) )
            // InternalHouseBuilderV2.g:5897:1: ( ( rule__Room__HeightAssignment_8 ) )
            {
            // InternalHouseBuilderV2.g:5897:1: ( ( rule__Room__HeightAssignment_8 ) )
            // InternalHouseBuilderV2.g:5898:2: ( rule__Room__HeightAssignment_8 )
            {
             before(grammarAccess.getRoomAccess().getHeightAssignment_8()); 
            // InternalHouseBuilderV2.g:5899:2: ( rule__Room__HeightAssignment_8 )
            // InternalHouseBuilderV2.g:5899:3: rule__Room__HeightAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Room__HeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getHeightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__8__Impl"


    // $ANTLR start "rule__Room__Group__9"
    // InternalHouseBuilderV2.g:5907:1: rule__Room__Group__9 : rule__Room__Group__9__Impl rule__Room__Group__10 ;
    public final void rule__Room__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5911:1: ( rule__Room__Group__9__Impl rule__Room__Group__10 )
            // InternalHouseBuilderV2.g:5912:2: rule__Room__Group__9__Impl rule__Room__Group__10
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__9"


    // $ANTLR start "rule__Room__Group__9__Impl"
    // InternalHouseBuilderV2.g:5919:1: rule__Room__Group__9__Impl : ( ( rule__Room__Group_9__0 )? ) ;
    public final void rule__Room__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5923:1: ( ( ( rule__Room__Group_9__0 )? ) )
            // InternalHouseBuilderV2.g:5924:1: ( ( rule__Room__Group_9__0 )? )
            {
            // InternalHouseBuilderV2.g:5924:1: ( ( rule__Room__Group_9__0 )? )
            // InternalHouseBuilderV2.g:5925:2: ( rule__Room__Group_9__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_9()); 
            // InternalHouseBuilderV2.g:5926:2: ( rule__Room__Group_9__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==100) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalHouseBuilderV2.g:5926:3: rule__Room__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__9__Impl"


    // $ANTLR start "rule__Room__Group__10"
    // InternalHouseBuilderV2.g:5934:1: rule__Room__Group__10 : rule__Room__Group__10__Impl rule__Room__Group__11 ;
    public final void rule__Room__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5938:1: ( rule__Room__Group__10__Impl rule__Room__Group__11 )
            // InternalHouseBuilderV2.g:5939:2: rule__Room__Group__10__Impl rule__Room__Group__11
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__10"


    // $ANTLR start "rule__Room__Group__10__Impl"
    // InternalHouseBuilderV2.g:5946:1: rule__Room__Group__10__Impl : ( ( rule__Room__Group_10__0 )? ) ;
    public final void rule__Room__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5950:1: ( ( ( rule__Room__Group_10__0 )? ) )
            // InternalHouseBuilderV2.g:5951:1: ( ( rule__Room__Group_10__0 )? )
            {
            // InternalHouseBuilderV2.g:5951:1: ( ( rule__Room__Group_10__0 )? )
            // InternalHouseBuilderV2.g:5952:2: ( rule__Room__Group_10__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_10()); 
            // InternalHouseBuilderV2.g:5953:2: ( rule__Room__Group_10__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==86) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalHouseBuilderV2.g:5953:3: rule__Room__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__10__Impl"


    // $ANTLR start "rule__Room__Group__11"
    // InternalHouseBuilderV2.g:5961:1: rule__Room__Group__11 : rule__Room__Group__11__Impl rule__Room__Group__12 ;
    public final void rule__Room__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5965:1: ( rule__Room__Group__11__Impl rule__Room__Group__12 )
            // InternalHouseBuilderV2.g:5966:2: rule__Room__Group__11__Impl rule__Room__Group__12
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__11"


    // $ANTLR start "rule__Room__Group__11__Impl"
    // InternalHouseBuilderV2.g:5973:1: rule__Room__Group__11__Impl : ( ( rule__Room__Group_11__0 )? ) ;
    public final void rule__Room__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5977:1: ( ( ( rule__Room__Group_11__0 )? ) )
            // InternalHouseBuilderV2.g:5978:1: ( ( rule__Room__Group_11__0 )? )
            {
            // InternalHouseBuilderV2.g:5978:1: ( ( rule__Room__Group_11__0 )? )
            // InternalHouseBuilderV2.g:5979:2: ( rule__Room__Group_11__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_11()); 
            // InternalHouseBuilderV2.g:5980:2: ( rule__Room__Group_11__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==103) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalHouseBuilderV2.g:5980:3: rule__Room__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__11__Impl"


    // $ANTLR start "rule__Room__Group__12"
    // InternalHouseBuilderV2.g:5988:1: rule__Room__Group__12 : rule__Room__Group__12__Impl rule__Room__Group__13 ;
    public final void rule__Room__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:5992:1: ( rule__Room__Group__12__Impl rule__Room__Group__13 )
            // InternalHouseBuilderV2.g:5993:2: rule__Room__Group__12__Impl rule__Room__Group__13
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__12"


    // $ANTLR start "rule__Room__Group__12__Impl"
    // InternalHouseBuilderV2.g:6000:1: rule__Room__Group__12__Impl : ( ( rule__Room__Group_12__0 )? ) ;
    public final void rule__Room__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6004:1: ( ( ( rule__Room__Group_12__0 )? ) )
            // InternalHouseBuilderV2.g:6005:1: ( ( rule__Room__Group_12__0 )? )
            {
            // InternalHouseBuilderV2.g:6005:1: ( ( rule__Room__Group_12__0 )? )
            // InternalHouseBuilderV2.g:6006:2: ( rule__Room__Group_12__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_12()); 
            // InternalHouseBuilderV2.g:6007:2: ( rule__Room__Group_12__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==104) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalHouseBuilderV2.g:6007:3: rule__Room__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__12__Impl"


    // $ANTLR start "rule__Room__Group__13"
    // InternalHouseBuilderV2.g:6015:1: rule__Room__Group__13 : rule__Room__Group__13__Impl rule__Room__Group__14 ;
    public final void rule__Room__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6019:1: ( rule__Room__Group__13__Impl rule__Room__Group__14 )
            // InternalHouseBuilderV2.g:6020:2: rule__Room__Group__13__Impl rule__Room__Group__14
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__13"


    // $ANTLR start "rule__Room__Group__13__Impl"
    // InternalHouseBuilderV2.g:6027:1: rule__Room__Group__13__Impl : ( ( rule__Room__Group_13__0 )? ) ;
    public final void rule__Room__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6031:1: ( ( ( rule__Room__Group_13__0 )? ) )
            // InternalHouseBuilderV2.g:6032:1: ( ( rule__Room__Group_13__0 )? )
            {
            // InternalHouseBuilderV2.g:6032:1: ( ( rule__Room__Group_13__0 )? )
            // InternalHouseBuilderV2.g:6033:2: ( rule__Room__Group_13__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_13()); 
            // InternalHouseBuilderV2.g:6034:2: ( rule__Room__Group_13__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalHouseBuilderV2.g:6034:3: rule__Room__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__13__Impl"


    // $ANTLR start "rule__Room__Group__14"
    // InternalHouseBuilderV2.g:6042:1: rule__Room__Group__14 : rule__Room__Group__14__Impl rule__Room__Group__15 ;
    public final void rule__Room__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6046:1: ( rule__Room__Group__14__Impl rule__Room__Group__15 )
            // InternalHouseBuilderV2.g:6047:2: rule__Room__Group__14__Impl rule__Room__Group__15
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__14"


    // $ANTLR start "rule__Room__Group__14__Impl"
    // InternalHouseBuilderV2.g:6054:1: rule__Room__Group__14__Impl : ( ( rule__Room__Group_14__0 )? ) ;
    public final void rule__Room__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6058:1: ( ( ( rule__Room__Group_14__0 )? ) )
            // InternalHouseBuilderV2.g:6059:1: ( ( rule__Room__Group_14__0 )? )
            {
            // InternalHouseBuilderV2.g:6059:1: ( ( rule__Room__Group_14__0 )? )
            // InternalHouseBuilderV2.g:6060:2: ( rule__Room__Group_14__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_14()); 
            // InternalHouseBuilderV2.g:6061:2: ( rule__Room__Group_14__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==82) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalHouseBuilderV2.g:6061:3: rule__Room__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__14__Impl"


    // $ANTLR start "rule__Room__Group__15"
    // InternalHouseBuilderV2.g:6069:1: rule__Room__Group__15 : rule__Room__Group__15__Impl rule__Room__Group__16 ;
    public final void rule__Room__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6073:1: ( rule__Room__Group__15__Impl rule__Room__Group__16 )
            // InternalHouseBuilderV2.g:6074:2: rule__Room__Group__15__Impl rule__Room__Group__16
            {
            pushFollow(FOLLOW_44);
            rule__Room__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__15"


    // $ANTLR start "rule__Room__Group__15__Impl"
    // InternalHouseBuilderV2.g:6081:1: rule__Room__Group__15__Impl : ( ( rule__Room__Group_15__0 )? ) ;
    public final void rule__Room__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6085:1: ( ( ( rule__Room__Group_15__0 )? ) )
            // InternalHouseBuilderV2.g:6086:1: ( ( rule__Room__Group_15__0 )? )
            {
            // InternalHouseBuilderV2.g:6086:1: ( ( rule__Room__Group_15__0 )? )
            // InternalHouseBuilderV2.g:6087:2: ( rule__Room__Group_15__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_15()); 
            // InternalHouseBuilderV2.g:6088:2: ( rule__Room__Group_15__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==105) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalHouseBuilderV2.g:6088:3: rule__Room__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__15__Impl"


    // $ANTLR start "rule__Room__Group__16"
    // InternalHouseBuilderV2.g:6096:1: rule__Room__Group__16 : rule__Room__Group__16__Impl ;
    public final void rule__Room__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6100:1: ( rule__Room__Group__16__Impl )
            // InternalHouseBuilderV2.g:6101:2: rule__Room__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__16"


    // $ANTLR start "rule__Room__Group__16__Impl"
    // InternalHouseBuilderV2.g:6107:1: rule__Room__Group__16__Impl : ( '}' ) ;
    public final void rule__Room__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6111:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:6112:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:6112:1: ( '}' )
            // InternalHouseBuilderV2.g:6113:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_16()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__16__Impl"


    // $ANTLR start "rule__Room__Group_9__0"
    // InternalHouseBuilderV2.g:6123:1: rule__Room__Group_9__0 : rule__Room__Group_9__0__Impl rule__Room__Group_9__1 ;
    public final void rule__Room__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6127:1: ( rule__Room__Group_9__0__Impl rule__Room__Group_9__1 )
            // InternalHouseBuilderV2.g:6128:2: rule__Room__Group_9__0__Impl rule__Room__Group_9__1
            {
            pushFollow(FOLLOW_45);
            rule__Room__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__0"


    // $ANTLR start "rule__Room__Group_9__0__Impl"
    // InternalHouseBuilderV2.g:6135:1: rule__Room__Group_9__0__Impl : ( 'roomType' ) ;
    public final void rule__Room__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6139:1: ( ( 'roomType' ) )
            // InternalHouseBuilderV2.g:6140:1: ( 'roomType' )
            {
            // InternalHouseBuilderV2.g:6140:1: ( 'roomType' )
            // InternalHouseBuilderV2.g:6141:2: 'roomType'
            {
             before(grammarAccess.getRoomAccess().getRoomTypeKeyword_9_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomTypeKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__0__Impl"


    // $ANTLR start "rule__Room__Group_9__1"
    // InternalHouseBuilderV2.g:6150:1: rule__Room__Group_9__1 : rule__Room__Group_9__1__Impl ;
    public final void rule__Room__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6154:1: ( rule__Room__Group_9__1__Impl )
            // InternalHouseBuilderV2.g:6155:2: rule__Room__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__1"


    // $ANTLR start "rule__Room__Group_9__1__Impl"
    // InternalHouseBuilderV2.g:6161:1: rule__Room__Group_9__1__Impl : ( ( rule__Room__RoomTypeAssignment_9_1 ) ) ;
    public final void rule__Room__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6165:1: ( ( ( rule__Room__RoomTypeAssignment_9_1 ) ) )
            // InternalHouseBuilderV2.g:6166:1: ( ( rule__Room__RoomTypeAssignment_9_1 ) )
            {
            // InternalHouseBuilderV2.g:6166:1: ( ( rule__Room__RoomTypeAssignment_9_1 ) )
            // InternalHouseBuilderV2.g:6167:2: ( rule__Room__RoomTypeAssignment_9_1 )
            {
             before(grammarAccess.getRoomAccess().getRoomTypeAssignment_9_1()); 
            // InternalHouseBuilderV2.g:6168:2: ( rule__Room__RoomTypeAssignment_9_1 )
            // InternalHouseBuilderV2.g:6168:3: rule__Room__RoomTypeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__RoomTypeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getRoomTypeAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__1__Impl"


    // $ANTLR start "rule__Room__Group_10__0"
    // InternalHouseBuilderV2.g:6177:1: rule__Room__Group_10__0 : rule__Room__Group_10__0__Impl rule__Room__Group_10__1 ;
    public final void rule__Room__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6181:1: ( rule__Room__Group_10__0__Impl rule__Room__Group_10__1 )
            // InternalHouseBuilderV2.g:6182:2: rule__Room__Group_10__0__Impl rule__Room__Group_10__1
            {
            pushFollow(FOLLOW_46);
            rule__Room__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__0"


    // $ANTLR start "rule__Room__Group_10__0__Impl"
    // InternalHouseBuilderV2.g:6189:1: rule__Room__Group_10__0__Impl : ( 'sensors' ) ;
    public final void rule__Room__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6193:1: ( ( 'sensors' ) )
            // InternalHouseBuilderV2.g:6194:1: ( 'sensors' )
            {
            // InternalHouseBuilderV2.g:6194:1: ( 'sensors' )
            // InternalHouseBuilderV2.g:6195:2: 'sensors'
            {
             before(grammarAccess.getRoomAccess().getSensorsKeyword_10_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getSensorsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__0__Impl"


    // $ANTLR start "rule__Room__Group_10__1"
    // InternalHouseBuilderV2.g:6204:1: rule__Room__Group_10__1 : rule__Room__Group_10__1__Impl rule__Room__Group_10__2 ;
    public final void rule__Room__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6208:1: ( rule__Room__Group_10__1__Impl rule__Room__Group_10__2 )
            // InternalHouseBuilderV2.g:6209:2: rule__Room__Group_10__1__Impl rule__Room__Group_10__2
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__1"


    // $ANTLR start "rule__Room__Group_10__1__Impl"
    // InternalHouseBuilderV2.g:6216:1: rule__Room__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Room__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6220:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:6221:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:6221:1: ( '(' )
            // InternalHouseBuilderV2.g:6222:2: '('
            {
             before(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__1__Impl"


    // $ANTLR start "rule__Room__Group_10__2"
    // InternalHouseBuilderV2.g:6231:1: rule__Room__Group_10__2 : rule__Room__Group_10__2__Impl rule__Room__Group_10__3 ;
    public final void rule__Room__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6235:1: ( rule__Room__Group_10__2__Impl rule__Room__Group_10__3 )
            // InternalHouseBuilderV2.g:6236:2: rule__Room__Group_10__2__Impl rule__Room__Group_10__3
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__2"


    // $ANTLR start "rule__Room__Group_10__2__Impl"
    // InternalHouseBuilderV2.g:6243:1: rule__Room__Group_10__2__Impl : ( ( rule__Room__SensorsAssignment_10_2 ) ) ;
    public final void rule__Room__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6247:1: ( ( ( rule__Room__SensorsAssignment_10_2 ) ) )
            // InternalHouseBuilderV2.g:6248:1: ( ( rule__Room__SensorsAssignment_10_2 ) )
            {
            // InternalHouseBuilderV2.g:6248:1: ( ( rule__Room__SensorsAssignment_10_2 ) )
            // InternalHouseBuilderV2.g:6249:2: ( rule__Room__SensorsAssignment_10_2 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_10_2()); 
            // InternalHouseBuilderV2.g:6250:2: ( rule__Room__SensorsAssignment_10_2 )
            // InternalHouseBuilderV2.g:6250:3: rule__Room__SensorsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__2__Impl"


    // $ANTLR start "rule__Room__Group_10__3"
    // InternalHouseBuilderV2.g:6258:1: rule__Room__Group_10__3 : rule__Room__Group_10__3__Impl rule__Room__Group_10__4 ;
    public final void rule__Room__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6262:1: ( rule__Room__Group_10__3__Impl rule__Room__Group_10__4 )
            // InternalHouseBuilderV2.g:6263:2: rule__Room__Group_10__3__Impl rule__Room__Group_10__4
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__3"


    // $ANTLR start "rule__Room__Group_10__3__Impl"
    // InternalHouseBuilderV2.g:6270:1: rule__Room__Group_10__3__Impl : ( ( rule__Room__Group_10_3__0 )* ) ;
    public final void rule__Room__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6274:1: ( ( ( rule__Room__Group_10_3__0 )* ) )
            // InternalHouseBuilderV2.g:6275:1: ( ( rule__Room__Group_10_3__0 )* )
            {
            // InternalHouseBuilderV2.g:6275:1: ( ( rule__Room__Group_10_3__0 )* )
            // InternalHouseBuilderV2.g:6276:2: ( rule__Room__Group_10_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_10_3()); 
            // InternalHouseBuilderV2.g:6277:2: ( rule__Room__Group_10_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==69) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:6277:3: rule__Room__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__3__Impl"


    // $ANTLR start "rule__Room__Group_10__4"
    // InternalHouseBuilderV2.g:6285:1: rule__Room__Group_10__4 : rule__Room__Group_10__4__Impl ;
    public final void rule__Room__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6289:1: ( rule__Room__Group_10__4__Impl )
            // InternalHouseBuilderV2.g:6290:2: rule__Room__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__4"


    // $ANTLR start "rule__Room__Group_10__4__Impl"
    // InternalHouseBuilderV2.g:6296:1: rule__Room__Group_10__4__Impl : ( ')' ) ;
    public final void rule__Room__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6300:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:6301:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:6301:1: ( ')' )
            // InternalHouseBuilderV2.g:6302:2: ')'
            {
             before(grammarAccess.getRoomAccess().getRightParenthesisKeyword_10_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__4__Impl"


    // $ANTLR start "rule__Room__Group_10_3__0"
    // InternalHouseBuilderV2.g:6312:1: rule__Room__Group_10_3__0 : rule__Room__Group_10_3__0__Impl rule__Room__Group_10_3__1 ;
    public final void rule__Room__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6316:1: ( rule__Room__Group_10_3__0__Impl rule__Room__Group_10_3__1 )
            // InternalHouseBuilderV2.g:6317:2: rule__Room__Group_10_3__0__Impl rule__Room__Group_10_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__0"


    // $ANTLR start "rule__Room__Group_10_3__0__Impl"
    // InternalHouseBuilderV2.g:6324:1: rule__Room__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6328:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:6329:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:6329:1: ( ',' )
            // InternalHouseBuilderV2.g:6330:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_10_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__0__Impl"


    // $ANTLR start "rule__Room__Group_10_3__1"
    // InternalHouseBuilderV2.g:6339:1: rule__Room__Group_10_3__1 : rule__Room__Group_10_3__1__Impl ;
    public final void rule__Room__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6343:1: ( rule__Room__Group_10_3__1__Impl )
            // InternalHouseBuilderV2.g:6344:2: rule__Room__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__1"


    // $ANTLR start "rule__Room__Group_10_3__1__Impl"
    // InternalHouseBuilderV2.g:6350:1: rule__Room__Group_10_3__1__Impl : ( ( rule__Room__SensorsAssignment_10_3_1 ) ) ;
    public final void rule__Room__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6354:1: ( ( ( rule__Room__SensorsAssignment_10_3_1 ) ) )
            // InternalHouseBuilderV2.g:6355:1: ( ( rule__Room__SensorsAssignment_10_3_1 ) )
            {
            // InternalHouseBuilderV2.g:6355:1: ( ( rule__Room__SensorsAssignment_10_3_1 ) )
            // InternalHouseBuilderV2.g:6356:2: ( rule__Room__SensorsAssignment_10_3_1 )
            {
             before(grammarAccess.getRoomAccess().getSensorsAssignment_10_3_1()); 
            // InternalHouseBuilderV2.g:6357:2: ( rule__Room__SensorsAssignment_10_3_1 )
            // InternalHouseBuilderV2.g:6357:3: rule__Room__SensorsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__SensorsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getSensorsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__1__Impl"


    // $ANTLR start "rule__Room__Group_11__0"
    // InternalHouseBuilderV2.g:6366:1: rule__Room__Group_11__0 : rule__Room__Group_11__0__Impl rule__Room__Group_11__1 ;
    public final void rule__Room__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6370:1: ( rule__Room__Group_11__0__Impl rule__Room__Group_11__1 )
            // InternalHouseBuilderV2.g:6371:2: rule__Room__Group_11__0__Impl rule__Room__Group_11__1
            {
            pushFollow(FOLLOW_46);
            rule__Room__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__0"


    // $ANTLR start "rule__Room__Group_11__0__Impl"
    // InternalHouseBuilderV2.g:6378:1: rule__Room__Group_11__0__Impl : ( 'passagesA' ) ;
    public final void rule__Room__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6382:1: ( ( 'passagesA' ) )
            // InternalHouseBuilderV2.g:6383:1: ( 'passagesA' )
            {
            // InternalHouseBuilderV2.g:6383:1: ( 'passagesA' )
            // InternalHouseBuilderV2.g:6384:2: 'passagesA'
            {
             before(grammarAccess.getRoomAccess().getPassagesAKeyword_11_0()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getPassagesAKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__0__Impl"


    // $ANTLR start "rule__Room__Group_11__1"
    // InternalHouseBuilderV2.g:6393:1: rule__Room__Group_11__1 : rule__Room__Group_11__1__Impl rule__Room__Group_11__2 ;
    public final void rule__Room__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6397:1: ( rule__Room__Group_11__1__Impl rule__Room__Group_11__2 )
            // InternalHouseBuilderV2.g:6398:2: rule__Room__Group_11__1__Impl rule__Room__Group_11__2
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__1"


    // $ANTLR start "rule__Room__Group_11__1__Impl"
    // InternalHouseBuilderV2.g:6405:1: rule__Room__Group_11__1__Impl : ( '(' ) ;
    public final void rule__Room__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6409:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:6410:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:6410:1: ( '(' )
            // InternalHouseBuilderV2.g:6411:2: '('
            {
             before(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__1__Impl"


    // $ANTLR start "rule__Room__Group_11__2"
    // InternalHouseBuilderV2.g:6420:1: rule__Room__Group_11__2 : rule__Room__Group_11__2__Impl rule__Room__Group_11__3 ;
    public final void rule__Room__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6424:1: ( rule__Room__Group_11__2__Impl rule__Room__Group_11__3 )
            // InternalHouseBuilderV2.g:6425:2: rule__Room__Group_11__2__Impl rule__Room__Group_11__3
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__2"


    // $ANTLR start "rule__Room__Group_11__2__Impl"
    // InternalHouseBuilderV2.g:6432:1: rule__Room__Group_11__2__Impl : ( ( rule__Room__PassagesAAssignment_11_2 ) ) ;
    public final void rule__Room__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6436:1: ( ( ( rule__Room__PassagesAAssignment_11_2 ) ) )
            // InternalHouseBuilderV2.g:6437:1: ( ( rule__Room__PassagesAAssignment_11_2 ) )
            {
            // InternalHouseBuilderV2.g:6437:1: ( ( rule__Room__PassagesAAssignment_11_2 ) )
            // InternalHouseBuilderV2.g:6438:2: ( rule__Room__PassagesAAssignment_11_2 )
            {
             before(grammarAccess.getRoomAccess().getPassagesAAssignment_11_2()); 
            // InternalHouseBuilderV2.g:6439:2: ( rule__Room__PassagesAAssignment_11_2 )
            // InternalHouseBuilderV2.g:6439:3: rule__Room__PassagesAAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__PassagesAAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getPassagesAAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__2__Impl"


    // $ANTLR start "rule__Room__Group_11__3"
    // InternalHouseBuilderV2.g:6447:1: rule__Room__Group_11__3 : rule__Room__Group_11__3__Impl rule__Room__Group_11__4 ;
    public final void rule__Room__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6451:1: ( rule__Room__Group_11__3__Impl rule__Room__Group_11__4 )
            // InternalHouseBuilderV2.g:6452:2: rule__Room__Group_11__3__Impl rule__Room__Group_11__4
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__3"


    // $ANTLR start "rule__Room__Group_11__3__Impl"
    // InternalHouseBuilderV2.g:6459:1: rule__Room__Group_11__3__Impl : ( ( rule__Room__Group_11_3__0 )* ) ;
    public final void rule__Room__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6463:1: ( ( ( rule__Room__Group_11_3__0 )* ) )
            // InternalHouseBuilderV2.g:6464:1: ( ( rule__Room__Group_11_3__0 )* )
            {
            // InternalHouseBuilderV2.g:6464:1: ( ( rule__Room__Group_11_3__0 )* )
            // InternalHouseBuilderV2.g:6465:2: ( rule__Room__Group_11_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_11_3()); 
            // InternalHouseBuilderV2.g:6466:2: ( rule__Room__Group_11_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==69) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:6466:3: rule__Room__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__3__Impl"


    // $ANTLR start "rule__Room__Group_11__4"
    // InternalHouseBuilderV2.g:6474:1: rule__Room__Group_11__4 : rule__Room__Group_11__4__Impl ;
    public final void rule__Room__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6478:1: ( rule__Room__Group_11__4__Impl )
            // InternalHouseBuilderV2.g:6479:2: rule__Room__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__4"


    // $ANTLR start "rule__Room__Group_11__4__Impl"
    // InternalHouseBuilderV2.g:6485:1: rule__Room__Group_11__4__Impl : ( ')' ) ;
    public final void rule__Room__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6489:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:6490:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:6490:1: ( ')' )
            // InternalHouseBuilderV2.g:6491:2: ')'
            {
             before(grammarAccess.getRoomAccess().getRightParenthesisKeyword_11_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11__4__Impl"


    // $ANTLR start "rule__Room__Group_11_3__0"
    // InternalHouseBuilderV2.g:6501:1: rule__Room__Group_11_3__0 : rule__Room__Group_11_3__0__Impl rule__Room__Group_11_3__1 ;
    public final void rule__Room__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6505:1: ( rule__Room__Group_11_3__0__Impl rule__Room__Group_11_3__1 )
            // InternalHouseBuilderV2.g:6506:2: rule__Room__Group_11_3__0__Impl rule__Room__Group_11_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11_3__0"


    // $ANTLR start "rule__Room__Group_11_3__0__Impl"
    // InternalHouseBuilderV2.g:6513:1: rule__Room__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6517:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:6518:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:6518:1: ( ',' )
            // InternalHouseBuilderV2.g:6519:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_11_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11_3__0__Impl"


    // $ANTLR start "rule__Room__Group_11_3__1"
    // InternalHouseBuilderV2.g:6528:1: rule__Room__Group_11_3__1 : rule__Room__Group_11_3__1__Impl ;
    public final void rule__Room__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6532:1: ( rule__Room__Group_11_3__1__Impl )
            // InternalHouseBuilderV2.g:6533:2: rule__Room__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11_3__1"


    // $ANTLR start "rule__Room__Group_11_3__1__Impl"
    // InternalHouseBuilderV2.g:6539:1: rule__Room__Group_11_3__1__Impl : ( ( rule__Room__PassagesAAssignment_11_3_1 ) ) ;
    public final void rule__Room__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6543:1: ( ( ( rule__Room__PassagesAAssignment_11_3_1 ) ) )
            // InternalHouseBuilderV2.g:6544:1: ( ( rule__Room__PassagesAAssignment_11_3_1 ) )
            {
            // InternalHouseBuilderV2.g:6544:1: ( ( rule__Room__PassagesAAssignment_11_3_1 ) )
            // InternalHouseBuilderV2.g:6545:2: ( rule__Room__PassagesAAssignment_11_3_1 )
            {
             before(grammarAccess.getRoomAccess().getPassagesAAssignment_11_3_1()); 
            // InternalHouseBuilderV2.g:6546:2: ( rule__Room__PassagesAAssignment_11_3_1 )
            // InternalHouseBuilderV2.g:6546:3: rule__Room__PassagesAAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__PassagesAAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getPassagesAAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_11_3__1__Impl"


    // $ANTLR start "rule__Room__Group_12__0"
    // InternalHouseBuilderV2.g:6555:1: rule__Room__Group_12__0 : rule__Room__Group_12__0__Impl rule__Room__Group_12__1 ;
    public final void rule__Room__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6559:1: ( rule__Room__Group_12__0__Impl rule__Room__Group_12__1 )
            // InternalHouseBuilderV2.g:6560:2: rule__Room__Group_12__0__Impl rule__Room__Group_12__1
            {
            pushFollow(FOLLOW_46);
            rule__Room__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__0"


    // $ANTLR start "rule__Room__Group_12__0__Impl"
    // InternalHouseBuilderV2.g:6567:1: rule__Room__Group_12__0__Impl : ( 'passagesB' ) ;
    public final void rule__Room__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6571:1: ( ( 'passagesB' ) )
            // InternalHouseBuilderV2.g:6572:1: ( 'passagesB' )
            {
            // InternalHouseBuilderV2.g:6572:1: ( 'passagesB' )
            // InternalHouseBuilderV2.g:6573:2: 'passagesB'
            {
             before(grammarAccess.getRoomAccess().getPassagesBKeyword_12_0()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getPassagesBKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__0__Impl"


    // $ANTLR start "rule__Room__Group_12__1"
    // InternalHouseBuilderV2.g:6582:1: rule__Room__Group_12__1 : rule__Room__Group_12__1__Impl rule__Room__Group_12__2 ;
    public final void rule__Room__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6586:1: ( rule__Room__Group_12__1__Impl rule__Room__Group_12__2 )
            // InternalHouseBuilderV2.g:6587:2: rule__Room__Group_12__1__Impl rule__Room__Group_12__2
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__1"


    // $ANTLR start "rule__Room__Group_12__1__Impl"
    // InternalHouseBuilderV2.g:6594:1: rule__Room__Group_12__1__Impl : ( '(' ) ;
    public final void rule__Room__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6598:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:6599:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:6599:1: ( '(' )
            // InternalHouseBuilderV2.g:6600:2: '('
            {
             before(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_12_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__1__Impl"


    // $ANTLR start "rule__Room__Group_12__2"
    // InternalHouseBuilderV2.g:6609:1: rule__Room__Group_12__2 : rule__Room__Group_12__2__Impl rule__Room__Group_12__3 ;
    public final void rule__Room__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6613:1: ( rule__Room__Group_12__2__Impl rule__Room__Group_12__3 )
            // InternalHouseBuilderV2.g:6614:2: rule__Room__Group_12__2__Impl rule__Room__Group_12__3
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__2"


    // $ANTLR start "rule__Room__Group_12__2__Impl"
    // InternalHouseBuilderV2.g:6621:1: rule__Room__Group_12__2__Impl : ( ( rule__Room__PassagesBAssignment_12_2 ) ) ;
    public final void rule__Room__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6625:1: ( ( ( rule__Room__PassagesBAssignment_12_2 ) ) )
            // InternalHouseBuilderV2.g:6626:1: ( ( rule__Room__PassagesBAssignment_12_2 ) )
            {
            // InternalHouseBuilderV2.g:6626:1: ( ( rule__Room__PassagesBAssignment_12_2 ) )
            // InternalHouseBuilderV2.g:6627:2: ( rule__Room__PassagesBAssignment_12_2 )
            {
             before(grammarAccess.getRoomAccess().getPassagesBAssignment_12_2()); 
            // InternalHouseBuilderV2.g:6628:2: ( rule__Room__PassagesBAssignment_12_2 )
            // InternalHouseBuilderV2.g:6628:3: rule__Room__PassagesBAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__PassagesBAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getPassagesBAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__2__Impl"


    // $ANTLR start "rule__Room__Group_12__3"
    // InternalHouseBuilderV2.g:6636:1: rule__Room__Group_12__3 : rule__Room__Group_12__3__Impl rule__Room__Group_12__4 ;
    public final void rule__Room__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6640:1: ( rule__Room__Group_12__3__Impl rule__Room__Group_12__4 )
            // InternalHouseBuilderV2.g:6641:2: rule__Room__Group_12__3__Impl rule__Room__Group_12__4
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__3"


    // $ANTLR start "rule__Room__Group_12__3__Impl"
    // InternalHouseBuilderV2.g:6648:1: rule__Room__Group_12__3__Impl : ( ( rule__Room__Group_12_3__0 )* ) ;
    public final void rule__Room__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6652:1: ( ( ( rule__Room__Group_12_3__0 )* ) )
            // InternalHouseBuilderV2.g:6653:1: ( ( rule__Room__Group_12_3__0 )* )
            {
            // InternalHouseBuilderV2.g:6653:1: ( ( rule__Room__Group_12_3__0 )* )
            // InternalHouseBuilderV2.g:6654:2: ( rule__Room__Group_12_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_12_3()); 
            // InternalHouseBuilderV2.g:6655:2: ( rule__Room__Group_12_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==69) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:6655:3: rule__Room__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__3__Impl"


    // $ANTLR start "rule__Room__Group_12__4"
    // InternalHouseBuilderV2.g:6663:1: rule__Room__Group_12__4 : rule__Room__Group_12__4__Impl ;
    public final void rule__Room__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6667:1: ( rule__Room__Group_12__4__Impl )
            // InternalHouseBuilderV2.g:6668:2: rule__Room__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__4"


    // $ANTLR start "rule__Room__Group_12__4__Impl"
    // InternalHouseBuilderV2.g:6674:1: rule__Room__Group_12__4__Impl : ( ')' ) ;
    public final void rule__Room__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6678:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:6679:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:6679:1: ( ')' )
            // InternalHouseBuilderV2.g:6680:2: ')'
            {
             before(grammarAccess.getRoomAccess().getRightParenthesisKeyword_12_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightParenthesisKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12__4__Impl"


    // $ANTLR start "rule__Room__Group_12_3__0"
    // InternalHouseBuilderV2.g:6690:1: rule__Room__Group_12_3__0 : rule__Room__Group_12_3__0__Impl rule__Room__Group_12_3__1 ;
    public final void rule__Room__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6694:1: ( rule__Room__Group_12_3__0__Impl rule__Room__Group_12_3__1 )
            // InternalHouseBuilderV2.g:6695:2: rule__Room__Group_12_3__0__Impl rule__Room__Group_12_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12_3__0"


    // $ANTLR start "rule__Room__Group_12_3__0__Impl"
    // InternalHouseBuilderV2.g:6702:1: rule__Room__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6706:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:6707:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:6707:1: ( ',' )
            // InternalHouseBuilderV2.g:6708:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_12_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12_3__0__Impl"


    // $ANTLR start "rule__Room__Group_12_3__1"
    // InternalHouseBuilderV2.g:6717:1: rule__Room__Group_12_3__1 : rule__Room__Group_12_3__1__Impl ;
    public final void rule__Room__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6721:1: ( rule__Room__Group_12_3__1__Impl )
            // InternalHouseBuilderV2.g:6722:2: rule__Room__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12_3__1"


    // $ANTLR start "rule__Room__Group_12_3__1__Impl"
    // InternalHouseBuilderV2.g:6728:1: rule__Room__Group_12_3__1__Impl : ( ( rule__Room__PassagesBAssignment_12_3_1 ) ) ;
    public final void rule__Room__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6732:1: ( ( ( rule__Room__PassagesBAssignment_12_3_1 ) ) )
            // InternalHouseBuilderV2.g:6733:1: ( ( rule__Room__PassagesBAssignment_12_3_1 ) )
            {
            // InternalHouseBuilderV2.g:6733:1: ( ( rule__Room__PassagesBAssignment_12_3_1 ) )
            // InternalHouseBuilderV2.g:6734:2: ( rule__Room__PassagesBAssignment_12_3_1 )
            {
             before(grammarAccess.getRoomAccess().getPassagesBAssignment_12_3_1()); 
            // InternalHouseBuilderV2.g:6735:2: ( rule__Room__PassagesBAssignment_12_3_1 )
            // InternalHouseBuilderV2.g:6735:3: rule__Room__PassagesBAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__PassagesBAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getPassagesBAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_12_3__1__Impl"


    // $ANTLR start "rule__Room__Group_13__0"
    // InternalHouseBuilderV2.g:6744:1: rule__Room__Group_13__0 : rule__Room__Group_13__0__Impl rule__Room__Group_13__1 ;
    public final void rule__Room__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6748:1: ( rule__Room__Group_13__0__Impl rule__Room__Group_13__1 )
            // InternalHouseBuilderV2.g:6749:2: rule__Room__Group_13__0__Impl rule__Room__Group_13__1
            {
            pushFollow(FOLLOW_46);
            rule__Room__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__0"


    // $ANTLR start "rule__Room__Group_13__0__Impl"
    // InternalHouseBuilderV2.g:6756:1: rule__Room__Group_13__0__Impl : ( 'entrances' ) ;
    public final void rule__Room__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6760:1: ( ( 'entrances' ) )
            // InternalHouseBuilderV2.g:6761:1: ( 'entrances' )
            {
            // InternalHouseBuilderV2.g:6761:1: ( 'entrances' )
            // InternalHouseBuilderV2.g:6762:2: 'entrances'
            {
             before(grammarAccess.getRoomAccess().getEntrancesKeyword_13_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getEntrancesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__0__Impl"


    // $ANTLR start "rule__Room__Group_13__1"
    // InternalHouseBuilderV2.g:6771:1: rule__Room__Group_13__1 : rule__Room__Group_13__1__Impl rule__Room__Group_13__2 ;
    public final void rule__Room__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6775:1: ( rule__Room__Group_13__1__Impl rule__Room__Group_13__2 )
            // InternalHouseBuilderV2.g:6776:2: rule__Room__Group_13__1__Impl rule__Room__Group_13__2
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__1"


    // $ANTLR start "rule__Room__Group_13__1__Impl"
    // InternalHouseBuilderV2.g:6783:1: rule__Room__Group_13__1__Impl : ( '(' ) ;
    public final void rule__Room__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6787:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:6788:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:6788:1: ( '(' )
            // InternalHouseBuilderV2.g:6789:2: '('
            {
             before(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_13_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftParenthesisKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__1__Impl"


    // $ANTLR start "rule__Room__Group_13__2"
    // InternalHouseBuilderV2.g:6798:1: rule__Room__Group_13__2 : rule__Room__Group_13__2__Impl rule__Room__Group_13__3 ;
    public final void rule__Room__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6802:1: ( rule__Room__Group_13__2__Impl rule__Room__Group_13__3 )
            // InternalHouseBuilderV2.g:6803:2: rule__Room__Group_13__2__Impl rule__Room__Group_13__3
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__2"


    // $ANTLR start "rule__Room__Group_13__2__Impl"
    // InternalHouseBuilderV2.g:6810:1: rule__Room__Group_13__2__Impl : ( ( rule__Room__EntrancesAssignment_13_2 ) ) ;
    public final void rule__Room__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6814:1: ( ( ( rule__Room__EntrancesAssignment_13_2 ) ) )
            // InternalHouseBuilderV2.g:6815:1: ( ( rule__Room__EntrancesAssignment_13_2 ) )
            {
            // InternalHouseBuilderV2.g:6815:1: ( ( rule__Room__EntrancesAssignment_13_2 ) )
            // InternalHouseBuilderV2.g:6816:2: ( rule__Room__EntrancesAssignment_13_2 )
            {
             before(grammarAccess.getRoomAccess().getEntrancesAssignment_13_2()); 
            // InternalHouseBuilderV2.g:6817:2: ( rule__Room__EntrancesAssignment_13_2 )
            // InternalHouseBuilderV2.g:6817:3: rule__Room__EntrancesAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__EntrancesAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getEntrancesAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__2__Impl"


    // $ANTLR start "rule__Room__Group_13__3"
    // InternalHouseBuilderV2.g:6825:1: rule__Room__Group_13__3 : rule__Room__Group_13__3__Impl rule__Room__Group_13__4 ;
    public final void rule__Room__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6829:1: ( rule__Room__Group_13__3__Impl rule__Room__Group_13__4 )
            // InternalHouseBuilderV2.g:6830:2: rule__Room__Group_13__3__Impl rule__Room__Group_13__4
            {
            pushFollow(FOLLOW_47);
            rule__Room__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__3"


    // $ANTLR start "rule__Room__Group_13__3__Impl"
    // InternalHouseBuilderV2.g:6837:1: rule__Room__Group_13__3__Impl : ( ( rule__Room__Group_13_3__0 )* ) ;
    public final void rule__Room__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6841:1: ( ( ( rule__Room__Group_13_3__0 )* ) )
            // InternalHouseBuilderV2.g:6842:1: ( ( rule__Room__Group_13_3__0 )* )
            {
            // InternalHouseBuilderV2.g:6842:1: ( ( rule__Room__Group_13_3__0 )* )
            // InternalHouseBuilderV2.g:6843:2: ( rule__Room__Group_13_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_13_3()); 
            // InternalHouseBuilderV2.g:6844:2: ( rule__Room__Group_13_3__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==69) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:6844:3: rule__Room__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__3__Impl"


    // $ANTLR start "rule__Room__Group_13__4"
    // InternalHouseBuilderV2.g:6852:1: rule__Room__Group_13__4 : rule__Room__Group_13__4__Impl ;
    public final void rule__Room__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6856:1: ( rule__Room__Group_13__4__Impl )
            // InternalHouseBuilderV2.g:6857:2: rule__Room__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__4"


    // $ANTLR start "rule__Room__Group_13__4__Impl"
    // InternalHouseBuilderV2.g:6863:1: rule__Room__Group_13__4__Impl : ( ')' ) ;
    public final void rule__Room__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6867:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:6868:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:6868:1: ( ')' )
            // InternalHouseBuilderV2.g:6869:2: ')'
            {
             before(grammarAccess.getRoomAccess().getRightParenthesisKeyword_13_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightParenthesisKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13__4__Impl"


    // $ANTLR start "rule__Room__Group_13_3__0"
    // InternalHouseBuilderV2.g:6879:1: rule__Room__Group_13_3__0 : rule__Room__Group_13_3__0__Impl rule__Room__Group_13_3__1 ;
    public final void rule__Room__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6883:1: ( rule__Room__Group_13_3__0__Impl rule__Room__Group_13_3__1 )
            // InternalHouseBuilderV2.g:6884:2: rule__Room__Group_13_3__0__Impl rule__Room__Group_13_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13_3__0"


    // $ANTLR start "rule__Room__Group_13_3__0__Impl"
    // InternalHouseBuilderV2.g:6891:1: rule__Room__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6895:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:6896:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:6896:1: ( ',' )
            // InternalHouseBuilderV2.g:6897:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_13_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13_3__0__Impl"


    // $ANTLR start "rule__Room__Group_13_3__1"
    // InternalHouseBuilderV2.g:6906:1: rule__Room__Group_13_3__1 : rule__Room__Group_13_3__1__Impl ;
    public final void rule__Room__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6910:1: ( rule__Room__Group_13_3__1__Impl )
            // InternalHouseBuilderV2.g:6911:2: rule__Room__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13_3__1"


    // $ANTLR start "rule__Room__Group_13_3__1__Impl"
    // InternalHouseBuilderV2.g:6917:1: rule__Room__Group_13_3__1__Impl : ( ( rule__Room__EntrancesAssignment_13_3_1 ) ) ;
    public final void rule__Room__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6921:1: ( ( ( rule__Room__EntrancesAssignment_13_3_1 ) ) )
            // InternalHouseBuilderV2.g:6922:1: ( ( rule__Room__EntrancesAssignment_13_3_1 ) )
            {
            // InternalHouseBuilderV2.g:6922:1: ( ( rule__Room__EntrancesAssignment_13_3_1 ) )
            // InternalHouseBuilderV2.g:6923:2: ( rule__Room__EntrancesAssignment_13_3_1 )
            {
             before(grammarAccess.getRoomAccess().getEntrancesAssignment_13_3_1()); 
            // InternalHouseBuilderV2.g:6924:2: ( rule__Room__EntrancesAssignment_13_3_1 )
            // InternalHouseBuilderV2.g:6924:3: rule__Room__EntrancesAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__EntrancesAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getEntrancesAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_13_3__1__Impl"


    // $ANTLR start "rule__Room__Group_14__0"
    // InternalHouseBuilderV2.g:6933:1: rule__Room__Group_14__0 : rule__Room__Group_14__0__Impl rule__Room__Group_14__1 ;
    public final void rule__Room__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6937:1: ( rule__Room__Group_14__0__Impl rule__Room__Group_14__1 )
            // InternalHouseBuilderV2.g:6938:2: rule__Room__Group_14__0__Impl rule__Room__Group_14__1
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__0"


    // $ANTLR start "rule__Room__Group_14__0__Impl"
    // InternalHouseBuilderV2.g:6945:1: rule__Room__Group_14__0__Impl : ( 'devices' ) ;
    public final void rule__Room__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6949:1: ( ( 'devices' ) )
            // InternalHouseBuilderV2.g:6950:1: ( 'devices' )
            {
            // InternalHouseBuilderV2.g:6950:1: ( 'devices' )
            // InternalHouseBuilderV2.g:6951:2: 'devices'
            {
             before(grammarAccess.getRoomAccess().getDevicesKeyword_14_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getDevicesKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__0__Impl"


    // $ANTLR start "rule__Room__Group_14__1"
    // InternalHouseBuilderV2.g:6960:1: rule__Room__Group_14__1 : rule__Room__Group_14__1__Impl rule__Room__Group_14__2 ;
    public final void rule__Room__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6964:1: ( rule__Room__Group_14__1__Impl rule__Room__Group_14__2 )
            // InternalHouseBuilderV2.g:6965:2: rule__Room__Group_14__1__Impl rule__Room__Group_14__2
            {
            pushFollow(FOLLOW_28);
            rule__Room__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__1"


    // $ANTLR start "rule__Room__Group_14__1__Impl"
    // InternalHouseBuilderV2.g:6972:1: rule__Room__Group_14__1__Impl : ( '{' ) ;
    public final void rule__Room__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6976:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:6977:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:6977:1: ( '{' )
            // InternalHouseBuilderV2.g:6978:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_14_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__1__Impl"


    // $ANTLR start "rule__Room__Group_14__2"
    // InternalHouseBuilderV2.g:6987:1: rule__Room__Group_14__2 : rule__Room__Group_14__2__Impl rule__Room__Group_14__3 ;
    public final void rule__Room__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:6991:1: ( rule__Room__Group_14__2__Impl rule__Room__Group_14__3 )
            // InternalHouseBuilderV2.g:6992:2: rule__Room__Group_14__2__Impl rule__Room__Group_14__3
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__2"


    // $ANTLR start "rule__Room__Group_14__2__Impl"
    // InternalHouseBuilderV2.g:6999:1: rule__Room__Group_14__2__Impl : ( ( rule__Room__DevicesAssignment_14_2 ) ) ;
    public final void rule__Room__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7003:1: ( ( ( rule__Room__DevicesAssignment_14_2 ) ) )
            // InternalHouseBuilderV2.g:7004:1: ( ( rule__Room__DevicesAssignment_14_2 ) )
            {
            // InternalHouseBuilderV2.g:7004:1: ( ( rule__Room__DevicesAssignment_14_2 ) )
            // InternalHouseBuilderV2.g:7005:2: ( rule__Room__DevicesAssignment_14_2 )
            {
             before(grammarAccess.getRoomAccess().getDevicesAssignment_14_2()); 
            // InternalHouseBuilderV2.g:7006:2: ( rule__Room__DevicesAssignment_14_2 )
            // InternalHouseBuilderV2.g:7006:3: rule__Room__DevicesAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__DevicesAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getDevicesAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__2__Impl"


    // $ANTLR start "rule__Room__Group_14__3"
    // InternalHouseBuilderV2.g:7014:1: rule__Room__Group_14__3 : rule__Room__Group_14__3__Impl rule__Room__Group_14__4 ;
    public final void rule__Room__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7018:1: ( rule__Room__Group_14__3__Impl rule__Room__Group_14__4 )
            // InternalHouseBuilderV2.g:7019:2: rule__Room__Group_14__3__Impl rule__Room__Group_14__4
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__3"


    // $ANTLR start "rule__Room__Group_14__3__Impl"
    // InternalHouseBuilderV2.g:7026:1: rule__Room__Group_14__3__Impl : ( ( rule__Room__Group_14_3__0 )* ) ;
    public final void rule__Room__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7030:1: ( ( ( rule__Room__Group_14_3__0 )* ) )
            // InternalHouseBuilderV2.g:7031:1: ( ( rule__Room__Group_14_3__0 )* )
            {
            // InternalHouseBuilderV2.g:7031:1: ( ( rule__Room__Group_14_3__0 )* )
            // InternalHouseBuilderV2.g:7032:2: ( rule__Room__Group_14_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_14_3()); 
            // InternalHouseBuilderV2.g:7033:2: ( rule__Room__Group_14_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==69) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:7033:3: rule__Room__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__3__Impl"


    // $ANTLR start "rule__Room__Group_14__4"
    // InternalHouseBuilderV2.g:7041:1: rule__Room__Group_14__4 : rule__Room__Group_14__4__Impl ;
    public final void rule__Room__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7045:1: ( rule__Room__Group_14__4__Impl )
            // InternalHouseBuilderV2.g:7046:2: rule__Room__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__4"


    // $ANTLR start "rule__Room__Group_14__4__Impl"
    // InternalHouseBuilderV2.g:7052:1: rule__Room__Group_14__4__Impl : ( '}' ) ;
    public final void rule__Room__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7056:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:7057:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:7057:1: ( '}' )
            // InternalHouseBuilderV2.g:7058:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_14_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14__4__Impl"


    // $ANTLR start "rule__Room__Group_14_3__0"
    // InternalHouseBuilderV2.g:7068:1: rule__Room__Group_14_3__0 : rule__Room__Group_14_3__0__Impl rule__Room__Group_14_3__1 ;
    public final void rule__Room__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7072:1: ( rule__Room__Group_14_3__0__Impl rule__Room__Group_14_3__1 )
            // InternalHouseBuilderV2.g:7073:2: rule__Room__Group_14_3__0__Impl rule__Room__Group_14_3__1
            {
            pushFollow(FOLLOW_28);
            rule__Room__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14_3__0"


    // $ANTLR start "rule__Room__Group_14_3__0__Impl"
    // InternalHouseBuilderV2.g:7080:1: rule__Room__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7084:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:7085:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:7085:1: ( ',' )
            // InternalHouseBuilderV2.g:7086:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_14_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14_3__0__Impl"


    // $ANTLR start "rule__Room__Group_14_3__1"
    // InternalHouseBuilderV2.g:7095:1: rule__Room__Group_14_3__1 : rule__Room__Group_14_3__1__Impl ;
    public final void rule__Room__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7099:1: ( rule__Room__Group_14_3__1__Impl )
            // InternalHouseBuilderV2.g:7100:2: rule__Room__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14_3__1"


    // $ANTLR start "rule__Room__Group_14_3__1__Impl"
    // InternalHouseBuilderV2.g:7106:1: rule__Room__Group_14_3__1__Impl : ( ( rule__Room__DevicesAssignment_14_3_1 ) ) ;
    public final void rule__Room__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7110:1: ( ( ( rule__Room__DevicesAssignment_14_3_1 ) ) )
            // InternalHouseBuilderV2.g:7111:1: ( ( rule__Room__DevicesAssignment_14_3_1 ) )
            {
            // InternalHouseBuilderV2.g:7111:1: ( ( rule__Room__DevicesAssignment_14_3_1 ) )
            // InternalHouseBuilderV2.g:7112:2: ( rule__Room__DevicesAssignment_14_3_1 )
            {
             before(grammarAccess.getRoomAccess().getDevicesAssignment_14_3_1()); 
            // InternalHouseBuilderV2.g:7113:2: ( rule__Room__DevicesAssignment_14_3_1 )
            // InternalHouseBuilderV2.g:7113:3: rule__Room__DevicesAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__DevicesAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getDevicesAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_14_3__1__Impl"


    // $ANTLR start "rule__Room__Group_15__0"
    // InternalHouseBuilderV2.g:7122:1: rule__Room__Group_15__0 : rule__Room__Group_15__0__Impl rule__Room__Group_15__1 ;
    public final void rule__Room__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7126:1: ( rule__Room__Group_15__0__Impl rule__Room__Group_15__1 )
            // InternalHouseBuilderV2.g:7127:2: rule__Room__Group_15__0__Impl rule__Room__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__0"


    // $ANTLR start "rule__Room__Group_15__0__Impl"
    // InternalHouseBuilderV2.g:7134:1: rule__Room__Group_15__0__Impl : ( 'windows' ) ;
    public final void rule__Room__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7138:1: ( ( 'windows' ) )
            // InternalHouseBuilderV2.g:7139:1: ( 'windows' )
            {
            // InternalHouseBuilderV2.g:7139:1: ( 'windows' )
            // InternalHouseBuilderV2.g:7140:2: 'windows'
            {
             before(grammarAccess.getRoomAccess().getWindowsKeyword_15_0()); 
            match(input,105,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getWindowsKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__0__Impl"


    // $ANTLR start "rule__Room__Group_15__1"
    // InternalHouseBuilderV2.g:7149:1: rule__Room__Group_15__1 : rule__Room__Group_15__1__Impl rule__Room__Group_15__2 ;
    public final void rule__Room__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7153:1: ( rule__Room__Group_15__1__Impl rule__Room__Group_15__2 )
            // InternalHouseBuilderV2.g:7154:2: rule__Room__Group_15__1__Impl rule__Room__Group_15__2
            {
            pushFollow(FOLLOW_48);
            rule__Room__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__1"


    // $ANTLR start "rule__Room__Group_15__1__Impl"
    // InternalHouseBuilderV2.g:7161:1: rule__Room__Group_15__1__Impl : ( '{' ) ;
    public final void rule__Room__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7165:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:7166:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:7166:1: ( '{' )
            // InternalHouseBuilderV2.g:7167:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_15_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__1__Impl"


    // $ANTLR start "rule__Room__Group_15__2"
    // InternalHouseBuilderV2.g:7176:1: rule__Room__Group_15__2 : rule__Room__Group_15__2__Impl rule__Room__Group_15__3 ;
    public final void rule__Room__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7180:1: ( rule__Room__Group_15__2__Impl rule__Room__Group_15__3 )
            // InternalHouseBuilderV2.g:7181:2: rule__Room__Group_15__2__Impl rule__Room__Group_15__3
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__2"


    // $ANTLR start "rule__Room__Group_15__2__Impl"
    // InternalHouseBuilderV2.g:7188:1: rule__Room__Group_15__2__Impl : ( ( rule__Room__WindowsAssignment_15_2 ) ) ;
    public final void rule__Room__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7192:1: ( ( ( rule__Room__WindowsAssignment_15_2 ) ) )
            // InternalHouseBuilderV2.g:7193:1: ( ( rule__Room__WindowsAssignment_15_2 ) )
            {
            // InternalHouseBuilderV2.g:7193:1: ( ( rule__Room__WindowsAssignment_15_2 ) )
            // InternalHouseBuilderV2.g:7194:2: ( rule__Room__WindowsAssignment_15_2 )
            {
             before(grammarAccess.getRoomAccess().getWindowsAssignment_15_2()); 
            // InternalHouseBuilderV2.g:7195:2: ( rule__Room__WindowsAssignment_15_2 )
            // InternalHouseBuilderV2.g:7195:3: rule__Room__WindowsAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__WindowsAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getWindowsAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__2__Impl"


    // $ANTLR start "rule__Room__Group_15__3"
    // InternalHouseBuilderV2.g:7203:1: rule__Room__Group_15__3 : rule__Room__Group_15__3__Impl rule__Room__Group_15__4 ;
    public final void rule__Room__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7207:1: ( rule__Room__Group_15__3__Impl rule__Room__Group_15__4 )
            // InternalHouseBuilderV2.g:7208:2: rule__Room__Group_15__3__Impl rule__Room__Group_15__4
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__3"


    // $ANTLR start "rule__Room__Group_15__3__Impl"
    // InternalHouseBuilderV2.g:7215:1: rule__Room__Group_15__3__Impl : ( ( rule__Room__Group_15_3__0 )* ) ;
    public final void rule__Room__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7219:1: ( ( ( rule__Room__Group_15_3__0 )* ) )
            // InternalHouseBuilderV2.g:7220:1: ( ( rule__Room__Group_15_3__0 )* )
            {
            // InternalHouseBuilderV2.g:7220:1: ( ( rule__Room__Group_15_3__0 )* )
            // InternalHouseBuilderV2.g:7221:2: ( rule__Room__Group_15_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_15_3()); 
            // InternalHouseBuilderV2.g:7222:2: ( rule__Room__Group_15_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==69) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:7222:3: rule__Room__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__3__Impl"


    // $ANTLR start "rule__Room__Group_15__4"
    // InternalHouseBuilderV2.g:7230:1: rule__Room__Group_15__4 : rule__Room__Group_15__4__Impl ;
    public final void rule__Room__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7234:1: ( rule__Room__Group_15__4__Impl )
            // InternalHouseBuilderV2.g:7235:2: rule__Room__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__4"


    // $ANTLR start "rule__Room__Group_15__4__Impl"
    // InternalHouseBuilderV2.g:7241:1: rule__Room__Group_15__4__Impl : ( '}' ) ;
    public final void rule__Room__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7245:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:7246:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:7246:1: ( '}' )
            // InternalHouseBuilderV2.g:7247:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15__4__Impl"


    // $ANTLR start "rule__Room__Group_15_3__0"
    // InternalHouseBuilderV2.g:7257:1: rule__Room__Group_15_3__0 : rule__Room__Group_15_3__0__Impl rule__Room__Group_15_3__1 ;
    public final void rule__Room__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7261:1: ( rule__Room__Group_15_3__0__Impl rule__Room__Group_15_3__1 )
            // InternalHouseBuilderV2.g:7262:2: rule__Room__Group_15_3__0__Impl rule__Room__Group_15_3__1
            {
            pushFollow(FOLLOW_48);
            rule__Room__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_15_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15_3__0"


    // $ANTLR start "rule__Room__Group_15_3__0__Impl"
    // InternalHouseBuilderV2.g:7269:1: rule__Room__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7273:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:7274:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:7274:1: ( ',' )
            // InternalHouseBuilderV2.g:7275:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_15_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15_3__0__Impl"


    // $ANTLR start "rule__Room__Group_15_3__1"
    // InternalHouseBuilderV2.g:7284:1: rule__Room__Group_15_3__1 : rule__Room__Group_15_3__1__Impl ;
    public final void rule__Room__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7288:1: ( rule__Room__Group_15_3__1__Impl )
            // InternalHouseBuilderV2.g:7289:2: rule__Room__Group_15_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_15_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15_3__1"


    // $ANTLR start "rule__Room__Group_15_3__1__Impl"
    // InternalHouseBuilderV2.g:7295:1: rule__Room__Group_15_3__1__Impl : ( ( rule__Room__WindowsAssignment_15_3_1 ) ) ;
    public final void rule__Room__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7299:1: ( ( ( rule__Room__WindowsAssignment_15_3_1 ) ) )
            // InternalHouseBuilderV2.g:7300:1: ( ( rule__Room__WindowsAssignment_15_3_1 ) )
            {
            // InternalHouseBuilderV2.g:7300:1: ( ( rule__Room__WindowsAssignment_15_3_1 ) )
            // InternalHouseBuilderV2.g:7301:2: ( rule__Room__WindowsAssignment_15_3_1 )
            {
             before(grammarAccess.getRoomAccess().getWindowsAssignment_15_3_1()); 
            // InternalHouseBuilderV2.g:7302:2: ( rule__Room__WindowsAssignment_15_3_1 )
            // InternalHouseBuilderV2.g:7302:3: rule__Room__WindowsAssignment_15_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__WindowsAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getWindowsAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_15_3__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__0"
    // InternalHouseBuilderV2.g:7311:1: rule__ExternalSpace__Group__0 : rule__ExternalSpace__Group__0__Impl rule__ExternalSpace__Group__1 ;
    public final void rule__ExternalSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7315:1: ( rule__ExternalSpace__Group__0__Impl rule__ExternalSpace__Group__1 )
            // InternalHouseBuilderV2.g:7316:2: rule__ExternalSpace__Group__0__Impl rule__ExternalSpace__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__0"


    // $ANTLR start "rule__ExternalSpace__Group__0__Impl"
    // InternalHouseBuilderV2.g:7323:1: rule__ExternalSpace__Group__0__Impl : ( 'ExternalSpace' ) ;
    public final void rule__ExternalSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7327:1: ( ( 'ExternalSpace' ) )
            // InternalHouseBuilderV2.g:7328:1: ( 'ExternalSpace' )
            {
            // InternalHouseBuilderV2.g:7328:1: ( 'ExternalSpace' )
            // InternalHouseBuilderV2.g:7329:2: 'ExternalSpace'
            {
             before(grammarAccess.getExternalSpaceAccess().getExternalSpaceKeyword_0()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getExternalSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__1"
    // InternalHouseBuilderV2.g:7338:1: rule__ExternalSpace__Group__1 : rule__ExternalSpace__Group__1__Impl rule__ExternalSpace__Group__2 ;
    public final void rule__ExternalSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7342:1: ( rule__ExternalSpace__Group__1__Impl rule__ExternalSpace__Group__2 )
            // InternalHouseBuilderV2.g:7343:2: rule__ExternalSpace__Group__1__Impl rule__ExternalSpace__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExternalSpace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__1"


    // $ANTLR start "rule__ExternalSpace__Group__1__Impl"
    // InternalHouseBuilderV2.g:7350:1: rule__ExternalSpace__Group__1__Impl : ( ( rule__ExternalSpace__NameAssignment_1 ) ) ;
    public final void rule__ExternalSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7354:1: ( ( ( rule__ExternalSpace__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:7355:1: ( ( rule__ExternalSpace__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:7355:1: ( ( rule__ExternalSpace__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:7356:2: ( rule__ExternalSpace__NameAssignment_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:7357:2: ( rule__ExternalSpace__NameAssignment_1 )
            // InternalHouseBuilderV2.g:7357:3: rule__ExternalSpace__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__2"
    // InternalHouseBuilderV2.g:7365:1: rule__ExternalSpace__Group__2 : rule__ExternalSpace__Group__2__Impl rule__ExternalSpace__Group__3 ;
    public final void rule__ExternalSpace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7369:1: ( rule__ExternalSpace__Group__2__Impl rule__ExternalSpace__Group__3 )
            // InternalHouseBuilderV2.g:7370:2: rule__ExternalSpace__Group__2__Impl rule__ExternalSpace__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__ExternalSpace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__2"


    // $ANTLR start "rule__ExternalSpace__Group__2__Impl"
    // InternalHouseBuilderV2.g:7377:1: rule__ExternalSpace__Group__2__Impl : ( '{' ) ;
    public final void rule__ExternalSpace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7381:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:7382:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:7382:1: ( '{' )
            // InternalHouseBuilderV2.g:7383:2: '{'
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__3"
    // InternalHouseBuilderV2.g:7392:1: rule__ExternalSpace__Group__3 : rule__ExternalSpace__Group__3__Impl rule__ExternalSpace__Group__4 ;
    public final void rule__ExternalSpace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7396:1: ( rule__ExternalSpace__Group__3__Impl rule__ExternalSpace__Group__4 )
            // InternalHouseBuilderV2.g:7397:2: rule__ExternalSpace__Group__3__Impl rule__ExternalSpace__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ExternalSpace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__3"


    // $ANTLR start "rule__ExternalSpace__Group__3__Impl"
    // InternalHouseBuilderV2.g:7404:1: rule__ExternalSpace__Group__3__Impl : ( 'length' ) ;
    public final void rule__ExternalSpace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7408:1: ( ( 'length' ) )
            // InternalHouseBuilderV2.g:7409:1: ( 'length' )
            {
            // InternalHouseBuilderV2.g:7409:1: ( 'length' )
            // InternalHouseBuilderV2.g:7410:2: 'length'
            {
             before(grammarAccess.getExternalSpaceAccess().getLengthKeyword_3()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLengthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__4"
    // InternalHouseBuilderV2.g:7419:1: rule__ExternalSpace__Group__4 : rule__ExternalSpace__Group__4__Impl rule__ExternalSpace__Group__5 ;
    public final void rule__ExternalSpace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7423:1: ( rule__ExternalSpace__Group__4__Impl rule__ExternalSpace__Group__5 )
            // InternalHouseBuilderV2.g:7424:2: rule__ExternalSpace__Group__4__Impl rule__ExternalSpace__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ExternalSpace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__4"


    // $ANTLR start "rule__ExternalSpace__Group__4__Impl"
    // InternalHouseBuilderV2.g:7431:1: rule__ExternalSpace__Group__4__Impl : ( ( rule__ExternalSpace__LengthAssignment_4 ) ) ;
    public final void rule__ExternalSpace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7435:1: ( ( ( rule__ExternalSpace__LengthAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:7436:1: ( ( rule__ExternalSpace__LengthAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:7436:1: ( ( rule__ExternalSpace__LengthAssignment_4 ) )
            // InternalHouseBuilderV2.g:7437:2: ( rule__ExternalSpace__LengthAssignment_4 )
            {
             before(grammarAccess.getExternalSpaceAccess().getLengthAssignment_4()); 
            // InternalHouseBuilderV2.g:7438:2: ( rule__ExternalSpace__LengthAssignment_4 )
            // InternalHouseBuilderV2.g:7438:3: rule__ExternalSpace__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__5"
    // InternalHouseBuilderV2.g:7446:1: rule__ExternalSpace__Group__5 : rule__ExternalSpace__Group__5__Impl rule__ExternalSpace__Group__6 ;
    public final void rule__ExternalSpace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7450:1: ( rule__ExternalSpace__Group__5__Impl rule__ExternalSpace__Group__6 )
            // InternalHouseBuilderV2.g:7451:2: rule__ExternalSpace__Group__5__Impl rule__ExternalSpace__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__ExternalSpace__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__5"


    // $ANTLR start "rule__ExternalSpace__Group__5__Impl"
    // InternalHouseBuilderV2.g:7458:1: rule__ExternalSpace__Group__5__Impl : ( 'width' ) ;
    public final void rule__ExternalSpace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7462:1: ( ( 'width' ) )
            // InternalHouseBuilderV2.g:7463:1: ( 'width' )
            {
            // InternalHouseBuilderV2.g:7463:1: ( 'width' )
            // InternalHouseBuilderV2.g:7464:2: 'width'
            {
             before(grammarAccess.getExternalSpaceAccess().getWidthKeyword_5()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getWidthKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__5__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__6"
    // InternalHouseBuilderV2.g:7473:1: rule__ExternalSpace__Group__6 : rule__ExternalSpace__Group__6__Impl rule__ExternalSpace__Group__7 ;
    public final void rule__ExternalSpace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7477:1: ( rule__ExternalSpace__Group__6__Impl rule__ExternalSpace__Group__7 )
            // InternalHouseBuilderV2.g:7478:2: rule__ExternalSpace__Group__6__Impl rule__ExternalSpace__Group__7
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__6"


    // $ANTLR start "rule__ExternalSpace__Group__6__Impl"
    // InternalHouseBuilderV2.g:7485:1: rule__ExternalSpace__Group__6__Impl : ( ( rule__ExternalSpace__WidthAssignment_6 ) ) ;
    public final void rule__ExternalSpace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7489:1: ( ( ( rule__ExternalSpace__WidthAssignment_6 ) ) )
            // InternalHouseBuilderV2.g:7490:1: ( ( rule__ExternalSpace__WidthAssignment_6 ) )
            {
            // InternalHouseBuilderV2.g:7490:1: ( ( rule__ExternalSpace__WidthAssignment_6 ) )
            // InternalHouseBuilderV2.g:7491:2: ( rule__ExternalSpace__WidthAssignment_6 )
            {
             before(grammarAccess.getExternalSpaceAccess().getWidthAssignment_6()); 
            // InternalHouseBuilderV2.g:7492:2: ( rule__ExternalSpace__WidthAssignment_6 )
            // InternalHouseBuilderV2.g:7492:3: rule__ExternalSpace__WidthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__WidthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getWidthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__6__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__7"
    // InternalHouseBuilderV2.g:7500:1: rule__ExternalSpace__Group__7 : rule__ExternalSpace__Group__7__Impl rule__ExternalSpace__Group__8 ;
    public final void rule__ExternalSpace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7504:1: ( rule__ExternalSpace__Group__7__Impl rule__ExternalSpace__Group__8 )
            // InternalHouseBuilderV2.g:7505:2: rule__ExternalSpace__Group__7__Impl rule__ExternalSpace__Group__8
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__7"


    // $ANTLR start "rule__ExternalSpace__Group__7__Impl"
    // InternalHouseBuilderV2.g:7512:1: rule__ExternalSpace__Group__7__Impl : ( ( rule__ExternalSpace__Group_7__0 )? ) ;
    public final void rule__ExternalSpace__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7516:1: ( ( ( rule__ExternalSpace__Group_7__0 )? ) )
            // InternalHouseBuilderV2.g:7517:1: ( ( rule__ExternalSpace__Group_7__0 )? )
            {
            // InternalHouseBuilderV2.g:7517:1: ( ( rule__ExternalSpace__Group_7__0 )? )
            // InternalHouseBuilderV2.g:7518:2: ( rule__ExternalSpace__Group_7__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_7()); 
            // InternalHouseBuilderV2.g:7519:2: ( rule__ExternalSpace__Group_7__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==94) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalHouseBuilderV2.g:7519:3: rule__ExternalSpace__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__7__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__8"
    // InternalHouseBuilderV2.g:7527:1: rule__ExternalSpace__Group__8 : rule__ExternalSpace__Group__8__Impl rule__ExternalSpace__Group__9 ;
    public final void rule__ExternalSpace__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7531:1: ( rule__ExternalSpace__Group__8__Impl rule__ExternalSpace__Group__9 )
            // InternalHouseBuilderV2.g:7532:2: rule__ExternalSpace__Group__8__Impl rule__ExternalSpace__Group__9
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__8"


    // $ANTLR start "rule__ExternalSpace__Group__8__Impl"
    // InternalHouseBuilderV2.g:7539:1: rule__ExternalSpace__Group__8__Impl : ( ( rule__ExternalSpace__Group_8__0 )? ) ;
    public final void rule__ExternalSpace__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7543:1: ( ( ( rule__ExternalSpace__Group_8__0 )? ) )
            // InternalHouseBuilderV2.g:7544:1: ( ( rule__ExternalSpace__Group_8__0 )? )
            {
            // InternalHouseBuilderV2.g:7544:1: ( ( rule__ExternalSpace__Group_8__0 )? )
            // InternalHouseBuilderV2.g:7545:2: ( rule__ExternalSpace__Group_8__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_8()); 
            // InternalHouseBuilderV2.g:7546:2: ( rule__ExternalSpace__Group_8__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==107) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalHouseBuilderV2.g:7546:3: rule__ExternalSpace__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__8__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__9"
    // InternalHouseBuilderV2.g:7554:1: rule__ExternalSpace__Group__9 : rule__ExternalSpace__Group__9__Impl rule__ExternalSpace__Group__10 ;
    public final void rule__ExternalSpace__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7558:1: ( rule__ExternalSpace__Group__9__Impl rule__ExternalSpace__Group__10 )
            // InternalHouseBuilderV2.g:7559:2: rule__ExternalSpace__Group__9__Impl rule__ExternalSpace__Group__10
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__9"


    // $ANTLR start "rule__ExternalSpace__Group__9__Impl"
    // InternalHouseBuilderV2.g:7566:1: rule__ExternalSpace__Group__9__Impl : ( ( rule__ExternalSpace__Group_9__0 )? ) ;
    public final void rule__ExternalSpace__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7570:1: ( ( ( rule__ExternalSpace__Group_9__0 )? ) )
            // InternalHouseBuilderV2.g:7571:1: ( ( rule__ExternalSpace__Group_9__0 )? )
            {
            // InternalHouseBuilderV2.g:7571:1: ( ( rule__ExternalSpace__Group_9__0 )? )
            // InternalHouseBuilderV2.g:7572:2: ( rule__ExternalSpace__Group_9__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_9()); 
            // InternalHouseBuilderV2.g:7573:2: ( rule__ExternalSpace__Group_9__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==86) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalHouseBuilderV2.g:7573:3: rule__ExternalSpace__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__9__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__10"
    // InternalHouseBuilderV2.g:7581:1: rule__ExternalSpace__Group__10 : rule__ExternalSpace__Group__10__Impl rule__ExternalSpace__Group__11 ;
    public final void rule__ExternalSpace__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7585:1: ( rule__ExternalSpace__Group__10__Impl rule__ExternalSpace__Group__11 )
            // InternalHouseBuilderV2.g:7586:2: rule__ExternalSpace__Group__10__Impl rule__ExternalSpace__Group__11
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__10"


    // $ANTLR start "rule__ExternalSpace__Group__10__Impl"
    // InternalHouseBuilderV2.g:7593:1: rule__ExternalSpace__Group__10__Impl : ( ( rule__ExternalSpace__Group_10__0 )? ) ;
    public final void rule__ExternalSpace__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7597:1: ( ( ( rule__ExternalSpace__Group_10__0 )? ) )
            // InternalHouseBuilderV2.g:7598:1: ( ( rule__ExternalSpace__Group_10__0 )? )
            {
            // InternalHouseBuilderV2.g:7598:1: ( ( rule__ExternalSpace__Group_10__0 )? )
            // InternalHouseBuilderV2.g:7599:2: ( rule__ExternalSpace__Group_10__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_10()); 
            // InternalHouseBuilderV2.g:7600:2: ( rule__ExternalSpace__Group_10__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==103) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalHouseBuilderV2.g:7600:3: rule__ExternalSpace__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__10__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__11"
    // InternalHouseBuilderV2.g:7608:1: rule__ExternalSpace__Group__11 : rule__ExternalSpace__Group__11__Impl rule__ExternalSpace__Group__12 ;
    public final void rule__ExternalSpace__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7612:1: ( rule__ExternalSpace__Group__11__Impl rule__ExternalSpace__Group__12 )
            // InternalHouseBuilderV2.g:7613:2: rule__ExternalSpace__Group__11__Impl rule__ExternalSpace__Group__12
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__11"


    // $ANTLR start "rule__ExternalSpace__Group__11__Impl"
    // InternalHouseBuilderV2.g:7620:1: rule__ExternalSpace__Group__11__Impl : ( ( rule__ExternalSpace__Group_11__0 )? ) ;
    public final void rule__ExternalSpace__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7624:1: ( ( ( rule__ExternalSpace__Group_11__0 )? ) )
            // InternalHouseBuilderV2.g:7625:1: ( ( rule__ExternalSpace__Group_11__0 )? )
            {
            // InternalHouseBuilderV2.g:7625:1: ( ( rule__ExternalSpace__Group_11__0 )? )
            // InternalHouseBuilderV2.g:7626:2: ( rule__ExternalSpace__Group_11__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_11()); 
            // InternalHouseBuilderV2.g:7627:2: ( rule__ExternalSpace__Group_11__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==104) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalHouseBuilderV2.g:7627:3: rule__ExternalSpace__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__11__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__12"
    // InternalHouseBuilderV2.g:7635:1: rule__ExternalSpace__Group__12 : rule__ExternalSpace__Group__12__Impl rule__ExternalSpace__Group__13 ;
    public final void rule__ExternalSpace__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7639:1: ( rule__ExternalSpace__Group__12__Impl rule__ExternalSpace__Group__13 )
            // InternalHouseBuilderV2.g:7640:2: rule__ExternalSpace__Group__12__Impl rule__ExternalSpace__Group__13
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__12"


    // $ANTLR start "rule__ExternalSpace__Group__12__Impl"
    // InternalHouseBuilderV2.g:7647:1: rule__ExternalSpace__Group__12__Impl : ( ( rule__ExternalSpace__Group_12__0 )? ) ;
    public final void rule__ExternalSpace__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7651:1: ( ( ( rule__ExternalSpace__Group_12__0 )? ) )
            // InternalHouseBuilderV2.g:7652:1: ( ( rule__ExternalSpace__Group_12__0 )? )
            {
            // InternalHouseBuilderV2.g:7652:1: ( ( rule__ExternalSpace__Group_12__0 )? )
            // InternalHouseBuilderV2.g:7653:2: ( rule__ExternalSpace__Group_12__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_12()); 
            // InternalHouseBuilderV2.g:7654:2: ( rule__ExternalSpace__Group_12__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==62) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalHouseBuilderV2.g:7654:3: rule__ExternalSpace__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__12__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__13"
    // InternalHouseBuilderV2.g:7662:1: rule__ExternalSpace__Group__13 : rule__ExternalSpace__Group__13__Impl rule__ExternalSpace__Group__14 ;
    public final void rule__ExternalSpace__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7666:1: ( rule__ExternalSpace__Group__13__Impl rule__ExternalSpace__Group__14 )
            // InternalHouseBuilderV2.g:7667:2: rule__ExternalSpace__Group__13__Impl rule__ExternalSpace__Group__14
            {
            pushFollow(FOLLOW_49);
            rule__ExternalSpace__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__13"


    // $ANTLR start "rule__ExternalSpace__Group__13__Impl"
    // InternalHouseBuilderV2.g:7674:1: rule__ExternalSpace__Group__13__Impl : ( ( rule__ExternalSpace__Group_13__0 )? ) ;
    public final void rule__ExternalSpace__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7678:1: ( ( ( rule__ExternalSpace__Group_13__0 )? ) )
            // InternalHouseBuilderV2.g:7679:1: ( ( rule__ExternalSpace__Group_13__0 )? )
            {
            // InternalHouseBuilderV2.g:7679:1: ( ( rule__ExternalSpace__Group_13__0 )? )
            // InternalHouseBuilderV2.g:7680:2: ( rule__ExternalSpace__Group_13__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_13()); 
            // InternalHouseBuilderV2.g:7681:2: ( rule__ExternalSpace__Group_13__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==82) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalHouseBuilderV2.g:7681:3: rule__ExternalSpace__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__13__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__14"
    // InternalHouseBuilderV2.g:7689:1: rule__ExternalSpace__Group__14 : rule__ExternalSpace__Group__14__Impl ;
    public final void rule__ExternalSpace__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7693:1: ( rule__ExternalSpace__Group__14__Impl )
            // InternalHouseBuilderV2.g:7694:2: rule__ExternalSpace__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__14"


    // $ANTLR start "rule__ExternalSpace__Group__14__Impl"
    // InternalHouseBuilderV2.g:7700:1: rule__ExternalSpace__Group__14__Impl : ( '}' ) ;
    public final void rule__ExternalSpace__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7704:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:7705:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:7705:1: ( '}' )
            // InternalHouseBuilderV2.g:7706:2: '}'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_14()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__14__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_7__0"
    // InternalHouseBuilderV2.g:7716:1: rule__ExternalSpace__Group_7__0 : rule__ExternalSpace__Group_7__0__Impl rule__ExternalSpace__Group_7__1 ;
    public final void rule__ExternalSpace__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7720:1: ( rule__ExternalSpace__Group_7__0__Impl rule__ExternalSpace__Group_7__1 )
            // InternalHouseBuilderV2.g:7721:2: rule__ExternalSpace__Group_7__0__Impl rule__ExternalSpace__Group_7__1
            {
            pushFollow(FOLLOW_50);
            rule__ExternalSpace__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_7__0"


    // $ANTLR start "rule__ExternalSpace__Group_7__0__Impl"
    // InternalHouseBuilderV2.g:7728:1: rule__ExternalSpace__Group_7__0__Impl : ( 'type' ) ;
    public final void rule__ExternalSpace__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7732:1: ( ( 'type' ) )
            // InternalHouseBuilderV2.g:7733:1: ( 'type' )
            {
            // InternalHouseBuilderV2.g:7733:1: ( 'type' )
            // InternalHouseBuilderV2.g:7734:2: 'type'
            {
             before(grammarAccess.getExternalSpaceAccess().getTypeKeyword_7_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getTypeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_7__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_7__1"
    // InternalHouseBuilderV2.g:7743:1: rule__ExternalSpace__Group_7__1 : rule__ExternalSpace__Group_7__1__Impl ;
    public final void rule__ExternalSpace__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7747:1: ( rule__ExternalSpace__Group_7__1__Impl )
            // InternalHouseBuilderV2.g:7748:2: rule__ExternalSpace__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_7__1"


    // $ANTLR start "rule__ExternalSpace__Group_7__1__Impl"
    // InternalHouseBuilderV2.g:7754:1: rule__ExternalSpace__Group_7__1__Impl : ( ( rule__ExternalSpace__TypeAssignment_7_1 ) ) ;
    public final void rule__ExternalSpace__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7758:1: ( ( ( rule__ExternalSpace__TypeAssignment_7_1 ) ) )
            // InternalHouseBuilderV2.g:7759:1: ( ( rule__ExternalSpace__TypeAssignment_7_1 ) )
            {
            // InternalHouseBuilderV2.g:7759:1: ( ( rule__ExternalSpace__TypeAssignment_7_1 ) )
            // InternalHouseBuilderV2.g:7760:2: ( rule__ExternalSpace__TypeAssignment_7_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getTypeAssignment_7_1()); 
            // InternalHouseBuilderV2.g:7761:2: ( rule__ExternalSpace__TypeAssignment_7_1 )
            // InternalHouseBuilderV2.g:7761:3: rule__ExternalSpace__TypeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_7__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_8__0"
    // InternalHouseBuilderV2.g:7770:1: rule__ExternalSpace__Group_8__0 : rule__ExternalSpace__Group_8__0__Impl rule__ExternalSpace__Group_8__1 ;
    public final void rule__ExternalSpace__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7774:1: ( rule__ExternalSpace__Group_8__0__Impl rule__ExternalSpace__Group_8__1 )
            // InternalHouseBuilderV2.g:7775:2: rule__ExternalSpace__Group_8__0__Impl rule__ExternalSpace__Group_8__1
            {
            pushFollow(FOLLOW_51);
            rule__ExternalSpace__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_8__0"


    // $ANTLR start "rule__ExternalSpace__Group_8__0__Impl"
    // InternalHouseBuilderV2.g:7782:1: rule__ExternalSpace__Group_8__0__Impl : ( 'ground' ) ;
    public final void rule__ExternalSpace__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7786:1: ( ( 'ground' ) )
            // InternalHouseBuilderV2.g:7787:1: ( 'ground' )
            {
            // InternalHouseBuilderV2.g:7787:1: ( 'ground' )
            // InternalHouseBuilderV2.g:7788:2: 'ground'
            {
             before(grammarAccess.getExternalSpaceAccess().getGroundKeyword_8_0()); 
            match(input,107,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getGroundKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_8__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_8__1"
    // InternalHouseBuilderV2.g:7797:1: rule__ExternalSpace__Group_8__1 : rule__ExternalSpace__Group_8__1__Impl ;
    public final void rule__ExternalSpace__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7801:1: ( rule__ExternalSpace__Group_8__1__Impl )
            // InternalHouseBuilderV2.g:7802:2: rule__ExternalSpace__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_8__1"


    // $ANTLR start "rule__ExternalSpace__Group_8__1__Impl"
    // InternalHouseBuilderV2.g:7808:1: rule__ExternalSpace__Group_8__1__Impl : ( ( rule__ExternalSpace__GroundAssignment_8_1 ) ) ;
    public final void rule__ExternalSpace__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7812:1: ( ( ( rule__ExternalSpace__GroundAssignment_8_1 ) ) )
            // InternalHouseBuilderV2.g:7813:1: ( ( rule__ExternalSpace__GroundAssignment_8_1 ) )
            {
            // InternalHouseBuilderV2.g:7813:1: ( ( rule__ExternalSpace__GroundAssignment_8_1 ) )
            // InternalHouseBuilderV2.g:7814:2: ( rule__ExternalSpace__GroundAssignment_8_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getGroundAssignment_8_1()); 
            // InternalHouseBuilderV2.g:7815:2: ( rule__ExternalSpace__GroundAssignment_8_1 )
            // InternalHouseBuilderV2.g:7815:3: rule__ExternalSpace__GroundAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__GroundAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getGroundAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_8__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9__0"
    // InternalHouseBuilderV2.g:7824:1: rule__ExternalSpace__Group_9__0 : rule__ExternalSpace__Group_9__0__Impl rule__ExternalSpace__Group_9__1 ;
    public final void rule__ExternalSpace__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7828:1: ( rule__ExternalSpace__Group_9__0__Impl rule__ExternalSpace__Group_9__1 )
            // InternalHouseBuilderV2.g:7829:2: rule__ExternalSpace__Group_9__0__Impl rule__ExternalSpace__Group_9__1
            {
            pushFollow(FOLLOW_46);
            rule__ExternalSpace__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__0"


    // $ANTLR start "rule__ExternalSpace__Group_9__0__Impl"
    // InternalHouseBuilderV2.g:7836:1: rule__ExternalSpace__Group_9__0__Impl : ( 'sensors' ) ;
    public final void rule__ExternalSpace__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7840:1: ( ( 'sensors' ) )
            // InternalHouseBuilderV2.g:7841:1: ( 'sensors' )
            {
            // InternalHouseBuilderV2.g:7841:1: ( 'sensors' )
            // InternalHouseBuilderV2.g:7842:2: 'sensors'
            {
             before(grammarAccess.getExternalSpaceAccess().getSensorsKeyword_9_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getSensorsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9__1"
    // InternalHouseBuilderV2.g:7851:1: rule__ExternalSpace__Group_9__1 : rule__ExternalSpace__Group_9__1__Impl rule__ExternalSpace__Group_9__2 ;
    public final void rule__ExternalSpace__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7855:1: ( rule__ExternalSpace__Group_9__1__Impl rule__ExternalSpace__Group_9__2 )
            // InternalHouseBuilderV2.g:7856:2: rule__ExternalSpace__Group_9__1__Impl rule__ExternalSpace__Group_9__2
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__1"


    // $ANTLR start "rule__ExternalSpace__Group_9__1__Impl"
    // InternalHouseBuilderV2.g:7863:1: rule__ExternalSpace__Group_9__1__Impl : ( '(' ) ;
    public final void rule__ExternalSpace__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7867:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:7868:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:7868:1: ( '(' )
            // InternalHouseBuilderV2.g:7869:2: '('
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9__2"
    // InternalHouseBuilderV2.g:7878:1: rule__ExternalSpace__Group_9__2 : rule__ExternalSpace__Group_9__2__Impl rule__ExternalSpace__Group_9__3 ;
    public final void rule__ExternalSpace__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7882:1: ( rule__ExternalSpace__Group_9__2__Impl rule__ExternalSpace__Group_9__3 )
            // InternalHouseBuilderV2.g:7883:2: rule__ExternalSpace__Group_9__2__Impl rule__ExternalSpace__Group_9__3
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__2"


    // $ANTLR start "rule__ExternalSpace__Group_9__2__Impl"
    // InternalHouseBuilderV2.g:7890:1: rule__ExternalSpace__Group_9__2__Impl : ( ( rule__ExternalSpace__SensorsAssignment_9_2 ) ) ;
    public final void rule__ExternalSpace__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7894:1: ( ( ( rule__ExternalSpace__SensorsAssignment_9_2 ) ) )
            // InternalHouseBuilderV2.g:7895:1: ( ( rule__ExternalSpace__SensorsAssignment_9_2 ) )
            {
            // InternalHouseBuilderV2.g:7895:1: ( ( rule__ExternalSpace__SensorsAssignment_9_2 ) )
            // InternalHouseBuilderV2.g:7896:2: ( rule__ExternalSpace__SensorsAssignment_9_2 )
            {
             before(grammarAccess.getExternalSpaceAccess().getSensorsAssignment_9_2()); 
            // InternalHouseBuilderV2.g:7897:2: ( rule__ExternalSpace__SensorsAssignment_9_2 )
            // InternalHouseBuilderV2.g:7897:3: rule__ExternalSpace__SensorsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__SensorsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getSensorsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9__3"
    // InternalHouseBuilderV2.g:7905:1: rule__ExternalSpace__Group_9__3 : rule__ExternalSpace__Group_9__3__Impl rule__ExternalSpace__Group_9__4 ;
    public final void rule__ExternalSpace__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7909:1: ( rule__ExternalSpace__Group_9__3__Impl rule__ExternalSpace__Group_9__4 )
            // InternalHouseBuilderV2.g:7910:2: rule__ExternalSpace__Group_9__3__Impl rule__ExternalSpace__Group_9__4
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__3"


    // $ANTLR start "rule__ExternalSpace__Group_9__3__Impl"
    // InternalHouseBuilderV2.g:7917:1: rule__ExternalSpace__Group_9__3__Impl : ( ( rule__ExternalSpace__Group_9_3__0 )* ) ;
    public final void rule__ExternalSpace__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7921:1: ( ( ( rule__ExternalSpace__Group_9_3__0 )* ) )
            // InternalHouseBuilderV2.g:7922:1: ( ( rule__ExternalSpace__Group_9_3__0 )* )
            {
            // InternalHouseBuilderV2.g:7922:1: ( ( rule__ExternalSpace__Group_9_3__0 )* )
            // InternalHouseBuilderV2.g:7923:2: ( rule__ExternalSpace__Group_9_3__0 )*
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_9_3()); 
            // InternalHouseBuilderV2.g:7924:2: ( rule__ExternalSpace__Group_9_3__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==69) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:7924:3: rule__ExternalSpace__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExternalSpace__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getExternalSpaceAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9__4"
    // InternalHouseBuilderV2.g:7932:1: rule__ExternalSpace__Group_9__4 : rule__ExternalSpace__Group_9__4__Impl ;
    public final void rule__ExternalSpace__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7936:1: ( rule__ExternalSpace__Group_9__4__Impl )
            // InternalHouseBuilderV2.g:7937:2: rule__ExternalSpace__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__4"


    // $ANTLR start "rule__ExternalSpace__Group_9__4__Impl"
    // InternalHouseBuilderV2.g:7943:1: rule__ExternalSpace__Group_9__4__Impl : ( ')' ) ;
    public final void rule__ExternalSpace__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7947:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:7948:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:7948:1: ( ')' )
            // InternalHouseBuilderV2.g:7949:2: ')'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_9_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9_3__0"
    // InternalHouseBuilderV2.g:7959:1: rule__ExternalSpace__Group_9_3__0 : rule__ExternalSpace__Group_9_3__0__Impl rule__ExternalSpace__Group_9_3__1 ;
    public final void rule__ExternalSpace__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7963:1: ( rule__ExternalSpace__Group_9_3__0__Impl rule__ExternalSpace__Group_9_3__1 )
            // InternalHouseBuilderV2.g:7964:2: rule__ExternalSpace__Group_9_3__0__Impl rule__ExternalSpace__Group_9_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9_3__0"


    // $ANTLR start "rule__ExternalSpace__Group_9_3__0__Impl"
    // InternalHouseBuilderV2.g:7971:1: rule__ExternalSpace__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ExternalSpace__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7975:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:7976:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:7976:1: ( ',' )
            // InternalHouseBuilderV2.g:7977:2: ','
            {
             before(grammarAccess.getExternalSpaceAccess().getCommaKeyword_9_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9_3__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9_3__1"
    // InternalHouseBuilderV2.g:7986:1: rule__ExternalSpace__Group_9_3__1 : rule__ExternalSpace__Group_9_3__1__Impl ;
    public final void rule__ExternalSpace__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:7990:1: ( rule__ExternalSpace__Group_9_3__1__Impl )
            // InternalHouseBuilderV2.g:7991:2: rule__ExternalSpace__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9_3__1"


    // $ANTLR start "rule__ExternalSpace__Group_9_3__1__Impl"
    // InternalHouseBuilderV2.g:7997:1: rule__ExternalSpace__Group_9_3__1__Impl : ( ( rule__ExternalSpace__SensorsAssignment_9_3_1 ) ) ;
    public final void rule__ExternalSpace__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8001:1: ( ( ( rule__ExternalSpace__SensorsAssignment_9_3_1 ) ) )
            // InternalHouseBuilderV2.g:8002:1: ( ( rule__ExternalSpace__SensorsAssignment_9_3_1 ) )
            {
            // InternalHouseBuilderV2.g:8002:1: ( ( rule__ExternalSpace__SensorsAssignment_9_3_1 ) )
            // InternalHouseBuilderV2.g:8003:2: ( rule__ExternalSpace__SensorsAssignment_9_3_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getSensorsAssignment_9_3_1()); 
            // InternalHouseBuilderV2.g:8004:2: ( rule__ExternalSpace__SensorsAssignment_9_3_1 )
            // InternalHouseBuilderV2.g:8004:3: rule__ExternalSpace__SensorsAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__SensorsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getSensorsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9_3__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__0"
    // InternalHouseBuilderV2.g:8013:1: rule__ExternalSpace__Group_10__0 : rule__ExternalSpace__Group_10__0__Impl rule__ExternalSpace__Group_10__1 ;
    public final void rule__ExternalSpace__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8017:1: ( rule__ExternalSpace__Group_10__0__Impl rule__ExternalSpace__Group_10__1 )
            // InternalHouseBuilderV2.g:8018:2: rule__ExternalSpace__Group_10__0__Impl rule__ExternalSpace__Group_10__1
            {
            pushFollow(FOLLOW_46);
            rule__ExternalSpace__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__0"


    // $ANTLR start "rule__ExternalSpace__Group_10__0__Impl"
    // InternalHouseBuilderV2.g:8025:1: rule__ExternalSpace__Group_10__0__Impl : ( 'passagesA' ) ;
    public final void rule__ExternalSpace__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8029:1: ( ( 'passagesA' ) )
            // InternalHouseBuilderV2.g:8030:1: ( 'passagesA' )
            {
            // InternalHouseBuilderV2.g:8030:1: ( 'passagesA' )
            // InternalHouseBuilderV2.g:8031:2: 'passagesA'
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesAKeyword_10_0()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getPassagesAKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__1"
    // InternalHouseBuilderV2.g:8040:1: rule__ExternalSpace__Group_10__1 : rule__ExternalSpace__Group_10__1__Impl rule__ExternalSpace__Group_10__2 ;
    public final void rule__ExternalSpace__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8044:1: ( rule__ExternalSpace__Group_10__1__Impl rule__ExternalSpace__Group_10__2 )
            // InternalHouseBuilderV2.g:8045:2: rule__ExternalSpace__Group_10__1__Impl rule__ExternalSpace__Group_10__2
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__1"


    // $ANTLR start "rule__ExternalSpace__Group_10__1__Impl"
    // InternalHouseBuilderV2.g:8052:1: rule__ExternalSpace__Group_10__1__Impl : ( '(' ) ;
    public final void rule__ExternalSpace__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8056:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:8057:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:8057:1: ( '(' )
            // InternalHouseBuilderV2.g:8058:2: '('
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__2"
    // InternalHouseBuilderV2.g:8067:1: rule__ExternalSpace__Group_10__2 : rule__ExternalSpace__Group_10__2__Impl rule__ExternalSpace__Group_10__3 ;
    public final void rule__ExternalSpace__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8071:1: ( rule__ExternalSpace__Group_10__2__Impl rule__ExternalSpace__Group_10__3 )
            // InternalHouseBuilderV2.g:8072:2: rule__ExternalSpace__Group_10__2__Impl rule__ExternalSpace__Group_10__3
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__2"


    // $ANTLR start "rule__ExternalSpace__Group_10__2__Impl"
    // InternalHouseBuilderV2.g:8079:1: rule__ExternalSpace__Group_10__2__Impl : ( ( rule__ExternalSpace__PassagesAAssignment_10_2 ) ) ;
    public final void rule__ExternalSpace__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8083:1: ( ( ( rule__ExternalSpace__PassagesAAssignment_10_2 ) ) )
            // InternalHouseBuilderV2.g:8084:1: ( ( rule__ExternalSpace__PassagesAAssignment_10_2 ) )
            {
            // InternalHouseBuilderV2.g:8084:1: ( ( rule__ExternalSpace__PassagesAAssignment_10_2 ) )
            // InternalHouseBuilderV2.g:8085:2: ( rule__ExternalSpace__PassagesAAssignment_10_2 )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesAAssignment_10_2()); 
            // InternalHouseBuilderV2.g:8086:2: ( rule__ExternalSpace__PassagesAAssignment_10_2 )
            // InternalHouseBuilderV2.g:8086:3: rule__ExternalSpace__PassagesAAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__PassagesAAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesAAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__3"
    // InternalHouseBuilderV2.g:8094:1: rule__ExternalSpace__Group_10__3 : rule__ExternalSpace__Group_10__3__Impl rule__ExternalSpace__Group_10__4 ;
    public final void rule__ExternalSpace__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8098:1: ( rule__ExternalSpace__Group_10__3__Impl rule__ExternalSpace__Group_10__4 )
            // InternalHouseBuilderV2.g:8099:2: rule__ExternalSpace__Group_10__3__Impl rule__ExternalSpace__Group_10__4
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__3"


    // $ANTLR start "rule__ExternalSpace__Group_10__3__Impl"
    // InternalHouseBuilderV2.g:8106:1: rule__ExternalSpace__Group_10__3__Impl : ( ( rule__ExternalSpace__Group_10_3__0 )* ) ;
    public final void rule__ExternalSpace__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8110:1: ( ( ( rule__ExternalSpace__Group_10_3__0 )* ) )
            // InternalHouseBuilderV2.g:8111:1: ( ( rule__ExternalSpace__Group_10_3__0 )* )
            {
            // InternalHouseBuilderV2.g:8111:1: ( ( rule__ExternalSpace__Group_10_3__0 )* )
            // InternalHouseBuilderV2.g:8112:2: ( rule__ExternalSpace__Group_10_3__0 )*
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_10_3()); 
            // InternalHouseBuilderV2.g:8113:2: ( rule__ExternalSpace__Group_10_3__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==69) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:8113:3: rule__ExternalSpace__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExternalSpace__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getExternalSpaceAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__4"
    // InternalHouseBuilderV2.g:8121:1: rule__ExternalSpace__Group_10__4 : rule__ExternalSpace__Group_10__4__Impl ;
    public final void rule__ExternalSpace__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8125:1: ( rule__ExternalSpace__Group_10__4__Impl )
            // InternalHouseBuilderV2.g:8126:2: rule__ExternalSpace__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__4"


    // $ANTLR start "rule__ExternalSpace__Group_10__4__Impl"
    // InternalHouseBuilderV2.g:8132:1: rule__ExternalSpace__Group_10__4__Impl : ( ')' ) ;
    public final void rule__ExternalSpace__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8136:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:8137:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:8137:1: ( ')' )
            // InternalHouseBuilderV2.g:8138:2: ')'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_10_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__0"
    // InternalHouseBuilderV2.g:8148:1: rule__ExternalSpace__Group_10_3__0 : rule__ExternalSpace__Group_10_3__0__Impl rule__ExternalSpace__Group_10_3__1 ;
    public final void rule__ExternalSpace__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8152:1: ( rule__ExternalSpace__Group_10_3__0__Impl rule__ExternalSpace__Group_10_3__1 )
            // InternalHouseBuilderV2.g:8153:2: rule__ExternalSpace__Group_10_3__0__Impl rule__ExternalSpace__Group_10_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__0"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__0__Impl"
    // InternalHouseBuilderV2.g:8160:1: rule__ExternalSpace__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ExternalSpace__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8164:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:8165:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:8165:1: ( ',' )
            // InternalHouseBuilderV2.g:8166:2: ','
            {
             before(grammarAccess.getExternalSpaceAccess().getCommaKeyword_10_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__1"
    // InternalHouseBuilderV2.g:8175:1: rule__ExternalSpace__Group_10_3__1 : rule__ExternalSpace__Group_10_3__1__Impl ;
    public final void rule__ExternalSpace__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8179:1: ( rule__ExternalSpace__Group_10_3__1__Impl )
            // InternalHouseBuilderV2.g:8180:2: rule__ExternalSpace__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__1"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__1__Impl"
    // InternalHouseBuilderV2.g:8186:1: rule__ExternalSpace__Group_10_3__1__Impl : ( ( rule__ExternalSpace__PassagesAAssignment_10_3_1 ) ) ;
    public final void rule__ExternalSpace__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8190:1: ( ( ( rule__ExternalSpace__PassagesAAssignment_10_3_1 ) ) )
            // InternalHouseBuilderV2.g:8191:1: ( ( rule__ExternalSpace__PassagesAAssignment_10_3_1 ) )
            {
            // InternalHouseBuilderV2.g:8191:1: ( ( rule__ExternalSpace__PassagesAAssignment_10_3_1 ) )
            // InternalHouseBuilderV2.g:8192:2: ( rule__ExternalSpace__PassagesAAssignment_10_3_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesAAssignment_10_3_1()); 
            // InternalHouseBuilderV2.g:8193:2: ( rule__ExternalSpace__PassagesAAssignment_10_3_1 )
            // InternalHouseBuilderV2.g:8193:3: rule__ExternalSpace__PassagesAAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__PassagesAAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesAAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_11__0"
    // InternalHouseBuilderV2.g:8202:1: rule__ExternalSpace__Group_11__0 : rule__ExternalSpace__Group_11__0__Impl rule__ExternalSpace__Group_11__1 ;
    public final void rule__ExternalSpace__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8206:1: ( rule__ExternalSpace__Group_11__0__Impl rule__ExternalSpace__Group_11__1 )
            // InternalHouseBuilderV2.g:8207:2: rule__ExternalSpace__Group_11__0__Impl rule__ExternalSpace__Group_11__1
            {
            pushFollow(FOLLOW_46);
            rule__ExternalSpace__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__0"


    // $ANTLR start "rule__ExternalSpace__Group_11__0__Impl"
    // InternalHouseBuilderV2.g:8214:1: rule__ExternalSpace__Group_11__0__Impl : ( 'passagesB' ) ;
    public final void rule__ExternalSpace__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8218:1: ( ( 'passagesB' ) )
            // InternalHouseBuilderV2.g:8219:1: ( 'passagesB' )
            {
            // InternalHouseBuilderV2.g:8219:1: ( 'passagesB' )
            // InternalHouseBuilderV2.g:8220:2: 'passagesB'
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesBKeyword_11_0()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getPassagesBKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_11__1"
    // InternalHouseBuilderV2.g:8229:1: rule__ExternalSpace__Group_11__1 : rule__ExternalSpace__Group_11__1__Impl rule__ExternalSpace__Group_11__2 ;
    public final void rule__ExternalSpace__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8233:1: ( rule__ExternalSpace__Group_11__1__Impl rule__ExternalSpace__Group_11__2 )
            // InternalHouseBuilderV2.g:8234:2: rule__ExternalSpace__Group_11__1__Impl rule__ExternalSpace__Group_11__2
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__1"


    // $ANTLR start "rule__ExternalSpace__Group_11__1__Impl"
    // InternalHouseBuilderV2.g:8241:1: rule__ExternalSpace__Group_11__1__Impl : ( '(' ) ;
    public final void rule__ExternalSpace__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8245:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:8246:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:8246:1: ( '(' )
            // InternalHouseBuilderV2.g:8247:2: '('
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_11__2"
    // InternalHouseBuilderV2.g:8256:1: rule__ExternalSpace__Group_11__2 : rule__ExternalSpace__Group_11__2__Impl rule__ExternalSpace__Group_11__3 ;
    public final void rule__ExternalSpace__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8260:1: ( rule__ExternalSpace__Group_11__2__Impl rule__ExternalSpace__Group_11__3 )
            // InternalHouseBuilderV2.g:8261:2: rule__ExternalSpace__Group_11__2__Impl rule__ExternalSpace__Group_11__3
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__2"


    // $ANTLR start "rule__ExternalSpace__Group_11__2__Impl"
    // InternalHouseBuilderV2.g:8268:1: rule__ExternalSpace__Group_11__2__Impl : ( ( rule__ExternalSpace__PassagesBAssignment_11_2 ) ) ;
    public final void rule__ExternalSpace__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8272:1: ( ( ( rule__ExternalSpace__PassagesBAssignment_11_2 ) ) )
            // InternalHouseBuilderV2.g:8273:1: ( ( rule__ExternalSpace__PassagesBAssignment_11_2 ) )
            {
            // InternalHouseBuilderV2.g:8273:1: ( ( rule__ExternalSpace__PassagesBAssignment_11_2 ) )
            // InternalHouseBuilderV2.g:8274:2: ( rule__ExternalSpace__PassagesBAssignment_11_2 )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesBAssignment_11_2()); 
            // InternalHouseBuilderV2.g:8275:2: ( rule__ExternalSpace__PassagesBAssignment_11_2 )
            // InternalHouseBuilderV2.g:8275:3: rule__ExternalSpace__PassagesBAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__PassagesBAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesBAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_11__3"
    // InternalHouseBuilderV2.g:8283:1: rule__ExternalSpace__Group_11__3 : rule__ExternalSpace__Group_11__3__Impl rule__ExternalSpace__Group_11__4 ;
    public final void rule__ExternalSpace__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8287:1: ( rule__ExternalSpace__Group_11__3__Impl rule__ExternalSpace__Group_11__4 )
            // InternalHouseBuilderV2.g:8288:2: rule__ExternalSpace__Group_11__3__Impl rule__ExternalSpace__Group_11__4
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__3"


    // $ANTLR start "rule__ExternalSpace__Group_11__3__Impl"
    // InternalHouseBuilderV2.g:8295:1: rule__ExternalSpace__Group_11__3__Impl : ( ( rule__ExternalSpace__Group_11_3__0 )* ) ;
    public final void rule__ExternalSpace__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8299:1: ( ( ( rule__ExternalSpace__Group_11_3__0 )* ) )
            // InternalHouseBuilderV2.g:8300:1: ( ( rule__ExternalSpace__Group_11_3__0 )* )
            {
            // InternalHouseBuilderV2.g:8300:1: ( ( rule__ExternalSpace__Group_11_3__0 )* )
            // InternalHouseBuilderV2.g:8301:2: ( rule__ExternalSpace__Group_11_3__0 )*
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_11_3()); 
            // InternalHouseBuilderV2.g:8302:2: ( rule__ExternalSpace__Group_11_3__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==69) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:8302:3: rule__ExternalSpace__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExternalSpace__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getExternalSpaceAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_11__4"
    // InternalHouseBuilderV2.g:8310:1: rule__ExternalSpace__Group_11__4 : rule__ExternalSpace__Group_11__4__Impl ;
    public final void rule__ExternalSpace__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8314:1: ( rule__ExternalSpace__Group_11__4__Impl )
            // InternalHouseBuilderV2.g:8315:2: rule__ExternalSpace__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__4"


    // $ANTLR start "rule__ExternalSpace__Group_11__4__Impl"
    // InternalHouseBuilderV2.g:8321:1: rule__ExternalSpace__Group_11__4__Impl : ( ')' ) ;
    public final void rule__ExternalSpace__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8325:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:8326:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:8326:1: ( ')' )
            // InternalHouseBuilderV2.g:8327:2: ')'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_11_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_11_3__0"
    // InternalHouseBuilderV2.g:8337:1: rule__ExternalSpace__Group_11_3__0 : rule__ExternalSpace__Group_11_3__0__Impl rule__ExternalSpace__Group_11_3__1 ;
    public final void rule__ExternalSpace__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8341:1: ( rule__ExternalSpace__Group_11_3__0__Impl rule__ExternalSpace__Group_11_3__1 )
            // InternalHouseBuilderV2.g:8342:2: rule__ExternalSpace__Group_11_3__0__Impl rule__ExternalSpace__Group_11_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11_3__0"


    // $ANTLR start "rule__ExternalSpace__Group_11_3__0__Impl"
    // InternalHouseBuilderV2.g:8349:1: rule__ExternalSpace__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__ExternalSpace__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8353:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:8354:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:8354:1: ( ',' )
            // InternalHouseBuilderV2.g:8355:2: ','
            {
             before(grammarAccess.getExternalSpaceAccess().getCommaKeyword_11_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11_3__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_11_3__1"
    // InternalHouseBuilderV2.g:8364:1: rule__ExternalSpace__Group_11_3__1 : rule__ExternalSpace__Group_11_3__1__Impl ;
    public final void rule__ExternalSpace__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8368:1: ( rule__ExternalSpace__Group_11_3__1__Impl )
            // InternalHouseBuilderV2.g:8369:2: rule__ExternalSpace__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11_3__1"


    // $ANTLR start "rule__ExternalSpace__Group_11_3__1__Impl"
    // InternalHouseBuilderV2.g:8375:1: rule__ExternalSpace__Group_11_3__1__Impl : ( ( rule__ExternalSpace__PassagesBAssignment_11_3_1 ) ) ;
    public final void rule__ExternalSpace__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8379:1: ( ( ( rule__ExternalSpace__PassagesBAssignment_11_3_1 ) ) )
            // InternalHouseBuilderV2.g:8380:1: ( ( rule__ExternalSpace__PassagesBAssignment_11_3_1 ) )
            {
            // InternalHouseBuilderV2.g:8380:1: ( ( rule__ExternalSpace__PassagesBAssignment_11_3_1 ) )
            // InternalHouseBuilderV2.g:8381:2: ( rule__ExternalSpace__PassagesBAssignment_11_3_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesBAssignment_11_3_1()); 
            // InternalHouseBuilderV2.g:8382:2: ( rule__ExternalSpace__PassagesBAssignment_11_3_1 )
            // InternalHouseBuilderV2.g:8382:3: rule__ExternalSpace__PassagesBAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__PassagesBAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesBAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_11_3__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_12__0"
    // InternalHouseBuilderV2.g:8391:1: rule__ExternalSpace__Group_12__0 : rule__ExternalSpace__Group_12__0__Impl rule__ExternalSpace__Group_12__1 ;
    public final void rule__ExternalSpace__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8395:1: ( rule__ExternalSpace__Group_12__0__Impl rule__ExternalSpace__Group_12__1 )
            // InternalHouseBuilderV2.g:8396:2: rule__ExternalSpace__Group_12__0__Impl rule__ExternalSpace__Group_12__1
            {
            pushFollow(FOLLOW_46);
            rule__ExternalSpace__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__0"


    // $ANTLR start "rule__ExternalSpace__Group_12__0__Impl"
    // InternalHouseBuilderV2.g:8403:1: rule__ExternalSpace__Group_12__0__Impl : ( 'entrances' ) ;
    public final void rule__ExternalSpace__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8407:1: ( ( 'entrances' ) )
            // InternalHouseBuilderV2.g:8408:1: ( 'entrances' )
            {
            // InternalHouseBuilderV2.g:8408:1: ( 'entrances' )
            // InternalHouseBuilderV2.g:8409:2: 'entrances'
            {
             before(grammarAccess.getExternalSpaceAccess().getEntrancesKeyword_12_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getEntrancesKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_12__1"
    // InternalHouseBuilderV2.g:8418:1: rule__ExternalSpace__Group_12__1 : rule__ExternalSpace__Group_12__1__Impl rule__ExternalSpace__Group_12__2 ;
    public final void rule__ExternalSpace__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8422:1: ( rule__ExternalSpace__Group_12__1__Impl rule__ExternalSpace__Group_12__2 )
            // InternalHouseBuilderV2.g:8423:2: rule__ExternalSpace__Group_12__1__Impl rule__ExternalSpace__Group_12__2
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__1"


    // $ANTLR start "rule__ExternalSpace__Group_12__1__Impl"
    // InternalHouseBuilderV2.g:8430:1: rule__ExternalSpace__Group_12__1__Impl : ( '(' ) ;
    public final void rule__ExternalSpace__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8434:1: ( ( '(' ) )
            // InternalHouseBuilderV2.g:8435:1: ( '(' )
            {
            // InternalHouseBuilderV2.g:8435:1: ( '(' )
            // InternalHouseBuilderV2.g:8436:2: '('
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_12_1()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_12__2"
    // InternalHouseBuilderV2.g:8445:1: rule__ExternalSpace__Group_12__2 : rule__ExternalSpace__Group_12__2__Impl rule__ExternalSpace__Group_12__3 ;
    public final void rule__ExternalSpace__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8449:1: ( rule__ExternalSpace__Group_12__2__Impl rule__ExternalSpace__Group_12__3 )
            // InternalHouseBuilderV2.g:8450:2: rule__ExternalSpace__Group_12__2__Impl rule__ExternalSpace__Group_12__3
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__2"


    // $ANTLR start "rule__ExternalSpace__Group_12__2__Impl"
    // InternalHouseBuilderV2.g:8457:1: rule__ExternalSpace__Group_12__2__Impl : ( ( rule__ExternalSpace__EntrancesAssignment_12_2 ) ) ;
    public final void rule__ExternalSpace__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8461:1: ( ( ( rule__ExternalSpace__EntrancesAssignment_12_2 ) ) )
            // InternalHouseBuilderV2.g:8462:1: ( ( rule__ExternalSpace__EntrancesAssignment_12_2 ) )
            {
            // InternalHouseBuilderV2.g:8462:1: ( ( rule__ExternalSpace__EntrancesAssignment_12_2 ) )
            // InternalHouseBuilderV2.g:8463:2: ( rule__ExternalSpace__EntrancesAssignment_12_2 )
            {
             before(grammarAccess.getExternalSpaceAccess().getEntrancesAssignment_12_2()); 
            // InternalHouseBuilderV2.g:8464:2: ( rule__ExternalSpace__EntrancesAssignment_12_2 )
            // InternalHouseBuilderV2.g:8464:3: rule__ExternalSpace__EntrancesAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__EntrancesAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getEntrancesAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_12__3"
    // InternalHouseBuilderV2.g:8472:1: rule__ExternalSpace__Group_12__3 : rule__ExternalSpace__Group_12__3__Impl rule__ExternalSpace__Group_12__4 ;
    public final void rule__ExternalSpace__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8476:1: ( rule__ExternalSpace__Group_12__3__Impl rule__ExternalSpace__Group_12__4 )
            // InternalHouseBuilderV2.g:8477:2: rule__ExternalSpace__Group_12__3__Impl rule__ExternalSpace__Group_12__4
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__3"


    // $ANTLR start "rule__ExternalSpace__Group_12__3__Impl"
    // InternalHouseBuilderV2.g:8484:1: rule__ExternalSpace__Group_12__3__Impl : ( ( rule__ExternalSpace__Group_12_3__0 )* ) ;
    public final void rule__ExternalSpace__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8488:1: ( ( ( rule__ExternalSpace__Group_12_3__0 )* ) )
            // InternalHouseBuilderV2.g:8489:1: ( ( rule__ExternalSpace__Group_12_3__0 )* )
            {
            // InternalHouseBuilderV2.g:8489:1: ( ( rule__ExternalSpace__Group_12_3__0 )* )
            // InternalHouseBuilderV2.g:8490:2: ( rule__ExternalSpace__Group_12_3__0 )*
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_12_3()); 
            // InternalHouseBuilderV2.g:8491:2: ( rule__ExternalSpace__Group_12_3__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==69) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:8491:3: rule__ExternalSpace__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExternalSpace__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getExternalSpaceAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_12__4"
    // InternalHouseBuilderV2.g:8499:1: rule__ExternalSpace__Group_12__4 : rule__ExternalSpace__Group_12__4__Impl ;
    public final void rule__ExternalSpace__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8503:1: ( rule__ExternalSpace__Group_12__4__Impl )
            // InternalHouseBuilderV2.g:8504:2: rule__ExternalSpace__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__4"


    // $ANTLR start "rule__ExternalSpace__Group_12__4__Impl"
    // InternalHouseBuilderV2.g:8510:1: rule__ExternalSpace__Group_12__4__Impl : ( ')' ) ;
    public final void rule__ExternalSpace__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8514:1: ( ( ')' ) )
            // InternalHouseBuilderV2.g:8515:1: ( ')' )
            {
            // InternalHouseBuilderV2.g:8515:1: ( ')' )
            // InternalHouseBuilderV2.g:8516:2: ')'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_12_4()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_12_3__0"
    // InternalHouseBuilderV2.g:8526:1: rule__ExternalSpace__Group_12_3__0 : rule__ExternalSpace__Group_12_3__0__Impl rule__ExternalSpace__Group_12_3__1 ;
    public final void rule__ExternalSpace__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8530:1: ( rule__ExternalSpace__Group_12_3__0__Impl rule__ExternalSpace__Group_12_3__1 )
            // InternalHouseBuilderV2.g:8531:2: rule__ExternalSpace__Group_12_3__0__Impl rule__ExternalSpace__Group_12_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12_3__0"


    // $ANTLR start "rule__ExternalSpace__Group_12_3__0__Impl"
    // InternalHouseBuilderV2.g:8538:1: rule__ExternalSpace__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__ExternalSpace__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8542:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:8543:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:8543:1: ( ',' )
            // InternalHouseBuilderV2.g:8544:2: ','
            {
             before(grammarAccess.getExternalSpaceAccess().getCommaKeyword_12_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12_3__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_12_3__1"
    // InternalHouseBuilderV2.g:8553:1: rule__ExternalSpace__Group_12_3__1 : rule__ExternalSpace__Group_12_3__1__Impl ;
    public final void rule__ExternalSpace__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8557:1: ( rule__ExternalSpace__Group_12_3__1__Impl )
            // InternalHouseBuilderV2.g:8558:2: rule__ExternalSpace__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12_3__1"


    // $ANTLR start "rule__ExternalSpace__Group_12_3__1__Impl"
    // InternalHouseBuilderV2.g:8564:1: rule__ExternalSpace__Group_12_3__1__Impl : ( ( rule__ExternalSpace__EntrancesAssignment_12_3_1 ) ) ;
    public final void rule__ExternalSpace__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8568:1: ( ( ( rule__ExternalSpace__EntrancesAssignment_12_3_1 ) ) )
            // InternalHouseBuilderV2.g:8569:1: ( ( rule__ExternalSpace__EntrancesAssignment_12_3_1 ) )
            {
            // InternalHouseBuilderV2.g:8569:1: ( ( rule__ExternalSpace__EntrancesAssignment_12_3_1 ) )
            // InternalHouseBuilderV2.g:8570:2: ( rule__ExternalSpace__EntrancesAssignment_12_3_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getEntrancesAssignment_12_3_1()); 
            // InternalHouseBuilderV2.g:8571:2: ( rule__ExternalSpace__EntrancesAssignment_12_3_1 )
            // InternalHouseBuilderV2.g:8571:3: rule__ExternalSpace__EntrancesAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__EntrancesAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getEntrancesAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_12_3__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_13__0"
    // InternalHouseBuilderV2.g:8580:1: rule__ExternalSpace__Group_13__0 : rule__ExternalSpace__Group_13__0__Impl rule__ExternalSpace__Group_13__1 ;
    public final void rule__ExternalSpace__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8584:1: ( rule__ExternalSpace__Group_13__0__Impl rule__ExternalSpace__Group_13__1 )
            // InternalHouseBuilderV2.g:8585:2: rule__ExternalSpace__Group_13__0__Impl rule__ExternalSpace__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__ExternalSpace__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__0"


    // $ANTLR start "rule__ExternalSpace__Group_13__0__Impl"
    // InternalHouseBuilderV2.g:8592:1: rule__ExternalSpace__Group_13__0__Impl : ( 'devices' ) ;
    public final void rule__ExternalSpace__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8596:1: ( ( 'devices' ) )
            // InternalHouseBuilderV2.g:8597:1: ( 'devices' )
            {
            // InternalHouseBuilderV2.g:8597:1: ( 'devices' )
            // InternalHouseBuilderV2.g:8598:2: 'devices'
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesKeyword_13_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getDevicesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_13__1"
    // InternalHouseBuilderV2.g:8607:1: rule__ExternalSpace__Group_13__1 : rule__ExternalSpace__Group_13__1__Impl rule__ExternalSpace__Group_13__2 ;
    public final void rule__ExternalSpace__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8611:1: ( rule__ExternalSpace__Group_13__1__Impl rule__ExternalSpace__Group_13__2 )
            // InternalHouseBuilderV2.g:8612:2: rule__ExternalSpace__Group_13__1__Impl rule__ExternalSpace__Group_13__2
            {
            pushFollow(FOLLOW_28);
            rule__ExternalSpace__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__1"


    // $ANTLR start "rule__ExternalSpace__Group_13__1__Impl"
    // InternalHouseBuilderV2.g:8619:1: rule__ExternalSpace__Group_13__1__Impl : ( '{' ) ;
    public final void rule__ExternalSpace__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8623:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:8624:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:8624:1: ( '{' )
            // InternalHouseBuilderV2.g:8625:2: '{'
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_13__2"
    // InternalHouseBuilderV2.g:8634:1: rule__ExternalSpace__Group_13__2 : rule__ExternalSpace__Group_13__2__Impl rule__ExternalSpace__Group_13__3 ;
    public final void rule__ExternalSpace__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8638:1: ( rule__ExternalSpace__Group_13__2__Impl rule__ExternalSpace__Group_13__3 )
            // InternalHouseBuilderV2.g:8639:2: rule__ExternalSpace__Group_13__2__Impl rule__ExternalSpace__Group_13__3
            {
            pushFollow(FOLLOW_7);
            rule__ExternalSpace__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__2"


    // $ANTLR start "rule__ExternalSpace__Group_13__2__Impl"
    // InternalHouseBuilderV2.g:8646:1: rule__ExternalSpace__Group_13__2__Impl : ( ( rule__ExternalSpace__DevicesAssignment_13_2 ) ) ;
    public final void rule__ExternalSpace__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8650:1: ( ( ( rule__ExternalSpace__DevicesAssignment_13_2 ) ) )
            // InternalHouseBuilderV2.g:8651:1: ( ( rule__ExternalSpace__DevicesAssignment_13_2 ) )
            {
            // InternalHouseBuilderV2.g:8651:1: ( ( rule__ExternalSpace__DevicesAssignment_13_2 ) )
            // InternalHouseBuilderV2.g:8652:2: ( rule__ExternalSpace__DevicesAssignment_13_2 )
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_13_2()); 
            // InternalHouseBuilderV2.g:8653:2: ( rule__ExternalSpace__DevicesAssignment_13_2 )
            // InternalHouseBuilderV2.g:8653:3: rule__ExternalSpace__DevicesAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__DevicesAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_13__3"
    // InternalHouseBuilderV2.g:8661:1: rule__ExternalSpace__Group_13__3 : rule__ExternalSpace__Group_13__3__Impl rule__ExternalSpace__Group_13__4 ;
    public final void rule__ExternalSpace__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8665:1: ( rule__ExternalSpace__Group_13__3__Impl rule__ExternalSpace__Group_13__4 )
            // InternalHouseBuilderV2.g:8666:2: rule__ExternalSpace__Group_13__3__Impl rule__ExternalSpace__Group_13__4
            {
            pushFollow(FOLLOW_7);
            rule__ExternalSpace__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__3"


    // $ANTLR start "rule__ExternalSpace__Group_13__3__Impl"
    // InternalHouseBuilderV2.g:8673:1: rule__ExternalSpace__Group_13__3__Impl : ( ( rule__ExternalSpace__Group_13_3__0 )* ) ;
    public final void rule__ExternalSpace__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8677:1: ( ( ( rule__ExternalSpace__Group_13_3__0 )* ) )
            // InternalHouseBuilderV2.g:8678:1: ( ( rule__ExternalSpace__Group_13_3__0 )* )
            {
            // InternalHouseBuilderV2.g:8678:1: ( ( rule__ExternalSpace__Group_13_3__0 )* )
            // InternalHouseBuilderV2.g:8679:2: ( rule__ExternalSpace__Group_13_3__0 )*
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_13_3()); 
            // InternalHouseBuilderV2.g:8680:2: ( rule__ExternalSpace__Group_13_3__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==69) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:8680:3: rule__ExternalSpace__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExternalSpace__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getExternalSpaceAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_13__4"
    // InternalHouseBuilderV2.g:8688:1: rule__ExternalSpace__Group_13__4 : rule__ExternalSpace__Group_13__4__Impl ;
    public final void rule__ExternalSpace__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8692:1: ( rule__ExternalSpace__Group_13__4__Impl )
            // InternalHouseBuilderV2.g:8693:2: rule__ExternalSpace__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__4"


    // $ANTLR start "rule__ExternalSpace__Group_13__4__Impl"
    // InternalHouseBuilderV2.g:8699:1: rule__ExternalSpace__Group_13__4__Impl : ( '}' ) ;
    public final void rule__ExternalSpace__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8703:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:8704:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:8704:1: ( '}' )
            // InternalHouseBuilderV2.g:8705:2: '}'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_13_3__0"
    // InternalHouseBuilderV2.g:8715:1: rule__ExternalSpace__Group_13_3__0 : rule__ExternalSpace__Group_13_3__0__Impl rule__ExternalSpace__Group_13_3__1 ;
    public final void rule__ExternalSpace__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8719:1: ( rule__ExternalSpace__Group_13_3__0__Impl rule__ExternalSpace__Group_13_3__1 )
            // InternalHouseBuilderV2.g:8720:2: rule__ExternalSpace__Group_13_3__0__Impl rule__ExternalSpace__Group_13_3__1
            {
            pushFollow(FOLLOW_28);
            rule__ExternalSpace__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13_3__0"


    // $ANTLR start "rule__ExternalSpace__Group_13_3__0__Impl"
    // InternalHouseBuilderV2.g:8727:1: rule__ExternalSpace__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__ExternalSpace__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8731:1: ( ( ',' ) )
            // InternalHouseBuilderV2.g:8732:1: ( ',' )
            {
            // InternalHouseBuilderV2.g:8732:1: ( ',' )
            // InternalHouseBuilderV2.g:8733:2: ','
            {
             before(grammarAccess.getExternalSpaceAccess().getCommaKeyword_13_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getCommaKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13_3__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_13_3__1"
    // InternalHouseBuilderV2.g:8742:1: rule__ExternalSpace__Group_13_3__1 : rule__ExternalSpace__Group_13_3__1__Impl ;
    public final void rule__ExternalSpace__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8746:1: ( rule__ExternalSpace__Group_13_3__1__Impl )
            // InternalHouseBuilderV2.g:8747:2: rule__ExternalSpace__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13_3__1"


    // $ANTLR start "rule__ExternalSpace__Group_13_3__1__Impl"
    // InternalHouseBuilderV2.g:8753:1: rule__ExternalSpace__Group_13_3__1__Impl : ( ( rule__ExternalSpace__DevicesAssignment_13_3_1 ) ) ;
    public final void rule__ExternalSpace__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8757:1: ( ( ( rule__ExternalSpace__DevicesAssignment_13_3_1 ) ) )
            // InternalHouseBuilderV2.g:8758:1: ( ( rule__ExternalSpace__DevicesAssignment_13_3_1 ) )
            {
            // InternalHouseBuilderV2.g:8758:1: ( ( rule__ExternalSpace__DevicesAssignment_13_3_1 ) )
            // InternalHouseBuilderV2.g:8759:2: ( rule__ExternalSpace__DevicesAssignment_13_3_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_13_3_1()); 
            // InternalHouseBuilderV2.g:8760:2: ( rule__ExternalSpace__DevicesAssignment_13_3_1 )
            // InternalHouseBuilderV2.g:8760:3: rule__ExternalSpace__DevicesAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__DevicesAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_13_3__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalHouseBuilderV2.g:8769:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8773:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalHouseBuilderV2.g:8774:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalHouseBuilderV2.g:8781:1: rule__Actuator__Group__0__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8785:1: ( ( 'Actuator' ) )
            // InternalHouseBuilderV2.g:8786:1: ( 'Actuator' )
            {
            // InternalHouseBuilderV2.g:8786:1: ( 'Actuator' )
            // InternalHouseBuilderV2.g:8787:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 
            match(input,108,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalHouseBuilderV2.g:8796:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8800:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // InternalHouseBuilderV2.g:8801:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalHouseBuilderV2.g:8808:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__NameAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8812:1: ( ( ( rule__Actuator__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:8813:1: ( ( rule__Actuator__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:8813:1: ( ( rule__Actuator__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:8814:2: ( rule__Actuator__NameAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:8815:2: ( rule__Actuator__NameAssignment_1 )
            // InternalHouseBuilderV2.g:8815:3: rule__Actuator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__2"
    // InternalHouseBuilderV2.g:8823:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8827:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // InternalHouseBuilderV2.g:8828:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2"


    // $ANTLR start "rule__Actuator__Group__2__Impl"
    // InternalHouseBuilderV2.g:8835:1: rule__Actuator__Group__2__Impl : ( '{' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8839:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:8840:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:8840:1: ( '{' )
            // InternalHouseBuilderV2.g:8841:2: '{'
            {
             before(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2__Impl"


    // $ANTLR start "rule__Actuator__Group__3"
    // InternalHouseBuilderV2.g:8850:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl rule__Actuator__Group__4 ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8854:1: ( rule__Actuator__Group__3__Impl rule__Actuator__Group__4 )
            // InternalHouseBuilderV2.g:8855:2: rule__Actuator__Group__3__Impl rule__Actuator__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__Actuator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3"


    // $ANTLR start "rule__Actuator__Group__3__Impl"
    // InternalHouseBuilderV2.g:8862:1: rule__Actuator__Group__3__Impl : ( 'type' ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8866:1: ( ( 'type' ) )
            // InternalHouseBuilderV2.g:8867:1: ( 'type' )
            {
            // InternalHouseBuilderV2.g:8867:1: ( 'type' )
            // InternalHouseBuilderV2.g:8868:2: 'type'
            {
             before(grammarAccess.getActuatorAccess().getTypeKeyword_3()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__4"
    // InternalHouseBuilderV2.g:8877:1: rule__Actuator__Group__4 : rule__Actuator__Group__4__Impl rule__Actuator__Group__5 ;
    public final void rule__Actuator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8881:1: ( rule__Actuator__Group__4__Impl rule__Actuator__Group__5 )
            // InternalHouseBuilderV2.g:8882:2: rule__Actuator__Group__4__Impl rule__Actuator__Group__5
            {
            pushFollow(FOLLOW_53);
            rule__Actuator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__4"


    // $ANTLR start "rule__Actuator__Group__4__Impl"
    // InternalHouseBuilderV2.g:8889:1: rule__Actuator__Group__4__Impl : ( ( rule__Actuator__TypeAssignment_4 ) ) ;
    public final void rule__Actuator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8893:1: ( ( ( rule__Actuator__TypeAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:8894:1: ( ( rule__Actuator__TypeAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:8894:1: ( ( rule__Actuator__TypeAssignment_4 ) )
            // InternalHouseBuilderV2.g:8895:2: ( rule__Actuator__TypeAssignment_4 )
            {
             before(grammarAccess.getActuatorAccess().getTypeAssignment_4()); 
            // InternalHouseBuilderV2.g:8896:2: ( rule__Actuator__TypeAssignment_4 )
            // InternalHouseBuilderV2.g:8896:3: rule__Actuator__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__4__Impl"


    // $ANTLR start "rule__Actuator__Group__5"
    // InternalHouseBuilderV2.g:8904:1: rule__Actuator__Group__5 : rule__Actuator__Group__5__Impl rule__Actuator__Group__6 ;
    public final void rule__Actuator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8908:1: ( rule__Actuator__Group__5__Impl rule__Actuator__Group__6 )
            // InternalHouseBuilderV2.g:8909:2: rule__Actuator__Group__5__Impl rule__Actuator__Group__6
            {
            pushFollow(FOLLOW_53);
            rule__Actuator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__5"


    // $ANTLR start "rule__Actuator__Group__5__Impl"
    // InternalHouseBuilderV2.g:8916:1: rule__Actuator__Group__5__Impl : ( ( rule__Actuator__Group_5__0 )? ) ;
    public final void rule__Actuator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8920:1: ( ( ( rule__Actuator__Group_5__0 )? ) )
            // InternalHouseBuilderV2.g:8921:1: ( ( rule__Actuator__Group_5__0 )? )
            {
            // InternalHouseBuilderV2.g:8921:1: ( ( rule__Actuator__Group_5__0 )? )
            // InternalHouseBuilderV2.g:8922:2: ( rule__Actuator__Group_5__0 )?
            {
             before(grammarAccess.getActuatorAccess().getGroup_5()); 
            // InternalHouseBuilderV2.g:8923:2: ( rule__Actuator__Group_5__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==84) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalHouseBuilderV2.g:8923:3: rule__Actuator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actuator__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__5__Impl"


    // $ANTLR start "rule__Actuator__Group__6"
    // InternalHouseBuilderV2.g:8931:1: rule__Actuator__Group__6 : rule__Actuator__Group__6__Impl rule__Actuator__Group__7 ;
    public final void rule__Actuator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8935:1: ( rule__Actuator__Group__6__Impl rule__Actuator__Group__7 )
            // InternalHouseBuilderV2.g:8936:2: rule__Actuator__Group__6__Impl rule__Actuator__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Actuator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__6"


    // $ANTLR start "rule__Actuator__Group__6__Impl"
    // InternalHouseBuilderV2.g:8943:1: rule__Actuator__Group__6__Impl : ( 'device' ) ;
    public final void rule__Actuator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8947:1: ( ( 'device' ) )
            // InternalHouseBuilderV2.g:8948:1: ( 'device' )
            {
            // InternalHouseBuilderV2.g:8948:1: ( 'device' )
            // InternalHouseBuilderV2.g:8949:2: 'device'
            {
             before(grammarAccess.getActuatorAccess().getDeviceKeyword_6()); 
            match(input,109,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getDeviceKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__6__Impl"


    // $ANTLR start "rule__Actuator__Group__7"
    // InternalHouseBuilderV2.g:8958:1: rule__Actuator__Group__7 : rule__Actuator__Group__7__Impl rule__Actuator__Group__8 ;
    public final void rule__Actuator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8962:1: ( rule__Actuator__Group__7__Impl rule__Actuator__Group__8 )
            // InternalHouseBuilderV2.g:8963:2: rule__Actuator__Group__7__Impl rule__Actuator__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Actuator__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__7"


    // $ANTLR start "rule__Actuator__Group__7__Impl"
    // InternalHouseBuilderV2.g:8970:1: rule__Actuator__Group__7__Impl : ( ( rule__Actuator__DeviceAssignment_7 ) ) ;
    public final void rule__Actuator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8974:1: ( ( ( rule__Actuator__DeviceAssignment_7 ) ) )
            // InternalHouseBuilderV2.g:8975:1: ( ( rule__Actuator__DeviceAssignment_7 ) )
            {
            // InternalHouseBuilderV2.g:8975:1: ( ( rule__Actuator__DeviceAssignment_7 ) )
            // InternalHouseBuilderV2.g:8976:2: ( rule__Actuator__DeviceAssignment_7 )
            {
             before(grammarAccess.getActuatorAccess().getDeviceAssignment_7()); 
            // InternalHouseBuilderV2.g:8977:2: ( rule__Actuator__DeviceAssignment_7 )
            // InternalHouseBuilderV2.g:8977:3: rule__Actuator__DeviceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__DeviceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getDeviceAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__7__Impl"


    // $ANTLR start "rule__Actuator__Group__8"
    // InternalHouseBuilderV2.g:8985:1: rule__Actuator__Group__8 : rule__Actuator__Group__8__Impl ;
    public final void rule__Actuator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:8989:1: ( rule__Actuator__Group__8__Impl )
            // InternalHouseBuilderV2.g:8990:2: rule__Actuator__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__8"


    // $ANTLR start "rule__Actuator__Group__8__Impl"
    // InternalHouseBuilderV2.g:8996:1: rule__Actuator__Group__8__Impl : ( '}' ) ;
    public final void rule__Actuator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9000:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:9001:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:9001:1: ( '}' )
            // InternalHouseBuilderV2.g:9002:2: '}'
            {
             before(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__8__Impl"


    // $ANTLR start "rule__Actuator__Group_5__0"
    // InternalHouseBuilderV2.g:9012:1: rule__Actuator__Group_5__0 : rule__Actuator__Group_5__0__Impl rule__Actuator__Group_5__1 ;
    public final void rule__Actuator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9016:1: ( rule__Actuator__Group_5__0__Impl rule__Actuator__Group_5__1 )
            // InternalHouseBuilderV2.g:9017:2: rule__Actuator__Group_5__0__Impl rule__Actuator__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Actuator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_5__0"


    // $ANTLR start "rule__Actuator__Group_5__0__Impl"
    // InternalHouseBuilderV2.g:9024:1: rule__Actuator__Group_5__0__Impl : ( 'model' ) ;
    public final void rule__Actuator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9028:1: ( ( 'model' ) )
            // InternalHouseBuilderV2.g:9029:1: ( 'model' )
            {
            // InternalHouseBuilderV2.g:9029:1: ( 'model' )
            // InternalHouseBuilderV2.g:9030:2: 'model'
            {
             before(grammarAccess.getActuatorAccess().getModelKeyword_5_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getModelKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_5__0__Impl"


    // $ANTLR start "rule__Actuator__Group_5__1"
    // InternalHouseBuilderV2.g:9039:1: rule__Actuator__Group_5__1 : rule__Actuator__Group_5__1__Impl ;
    public final void rule__Actuator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9043:1: ( rule__Actuator__Group_5__1__Impl )
            // InternalHouseBuilderV2.g:9044:2: rule__Actuator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_5__1"


    // $ANTLR start "rule__Actuator__Group_5__1__Impl"
    // InternalHouseBuilderV2.g:9050:1: rule__Actuator__Group_5__1__Impl : ( ( rule__Actuator__ModelAssignment_5_1 ) ) ;
    public final void rule__Actuator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9054:1: ( ( ( rule__Actuator__ModelAssignment_5_1 ) ) )
            // InternalHouseBuilderV2.g:9055:1: ( ( rule__Actuator__ModelAssignment_5_1 ) )
            {
            // InternalHouseBuilderV2.g:9055:1: ( ( rule__Actuator__ModelAssignment_5_1 ) )
            // InternalHouseBuilderV2.g:9056:2: ( rule__Actuator__ModelAssignment_5_1 )
            {
             before(grammarAccess.getActuatorAccess().getModelAssignment_5_1()); 
            // InternalHouseBuilderV2.g:9057:2: ( rule__Actuator__ModelAssignment_5_1 )
            // InternalHouseBuilderV2.g:9057:3: rule__Actuator__ModelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__ModelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getModelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_5__1__Impl"


    // $ANTLR start "rule__Window__Group__0"
    // InternalHouseBuilderV2.g:9066:1: rule__Window__Group__0 : rule__Window__Group__0__Impl rule__Window__Group__1 ;
    public final void rule__Window__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9070:1: ( rule__Window__Group__0__Impl rule__Window__Group__1 )
            // InternalHouseBuilderV2.g:9071:2: rule__Window__Group__0__Impl rule__Window__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Window__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0"


    // $ANTLR start "rule__Window__Group__0__Impl"
    // InternalHouseBuilderV2.g:9078:1: rule__Window__Group__0__Impl : ( 'Window' ) ;
    public final void rule__Window__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9082:1: ( ( 'Window' ) )
            // InternalHouseBuilderV2.g:9083:1: ( 'Window' )
            {
            // InternalHouseBuilderV2.g:9083:1: ( 'Window' )
            // InternalHouseBuilderV2.g:9084:2: 'Window'
            {
             before(grammarAccess.getWindowAccess().getWindowKeyword_0()); 
            match(input,110,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getWindowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0__Impl"


    // $ANTLR start "rule__Window__Group__1"
    // InternalHouseBuilderV2.g:9093:1: rule__Window__Group__1 : rule__Window__Group__1__Impl rule__Window__Group__2 ;
    public final void rule__Window__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9097:1: ( rule__Window__Group__1__Impl rule__Window__Group__2 )
            // InternalHouseBuilderV2.g:9098:2: rule__Window__Group__1__Impl rule__Window__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Window__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1"


    // $ANTLR start "rule__Window__Group__1__Impl"
    // InternalHouseBuilderV2.g:9105:1: rule__Window__Group__1__Impl : ( ( rule__Window__NameAssignment_1 ) ) ;
    public final void rule__Window__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9109:1: ( ( ( rule__Window__NameAssignment_1 ) ) )
            // InternalHouseBuilderV2.g:9110:1: ( ( rule__Window__NameAssignment_1 ) )
            {
            // InternalHouseBuilderV2.g:9110:1: ( ( rule__Window__NameAssignment_1 ) )
            // InternalHouseBuilderV2.g:9111:2: ( rule__Window__NameAssignment_1 )
            {
             before(grammarAccess.getWindowAccess().getNameAssignment_1()); 
            // InternalHouseBuilderV2.g:9112:2: ( rule__Window__NameAssignment_1 )
            // InternalHouseBuilderV2.g:9112:3: rule__Window__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Window__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1__Impl"


    // $ANTLR start "rule__Window__Group__2"
    // InternalHouseBuilderV2.g:9120:1: rule__Window__Group__2 : rule__Window__Group__2__Impl rule__Window__Group__3 ;
    public final void rule__Window__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9124:1: ( rule__Window__Group__2__Impl rule__Window__Group__3 )
            // InternalHouseBuilderV2.g:9125:2: rule__Window__Group__2__Impl rule__Window__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Window__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2"


    // $ANTLR start "rule__Window__Group__2__Impl"
    // InternalHouseBuilderV2.g:9132:1: rule__Window__Group__2__Impl : ( '{' ) ;
    public final void rule__Window__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9136:1: ( ( '{' ) )
            // InternalHouseBuilderV2.g:9137:1: ( '{' )
            {
            // InternalHouseBuilderV2.g:9137:1: ( '{' )
            // InternalHouseBuilderV2.g:9138:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2__Impl"


    // $ANTLR start "rule__Window__Group__3"
    // InternalHouseBuilderV2.g:9147:1: rule__Window__Group__3 : rule__Window__Group__3__Impl rule__Window__Group__4 ;
    public final void rule__Window__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9151:1: ( rule__Window__Group__3__Impl rule__Window__Group__4 )
            // InternalHouseBuilderV2.g:9152:2: rule__Window__Group__3__Impl rule__Window__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Window__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3"


    // $ANTLR start "rule__Window__Group__3__Impl"
    // InternalHouseBuilderV2.g:9159:1: rule__Window__Group__3__Impl : ( 'doorsNumber' ) ;
    public final void rule__Window__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9163:1: ( ( 'doorsNumber' ) )
            // InternalHouseBuilderV2.g:9164:1: ( 'doorsNumber' )
            {
            // InternalHouseBuilderV2.g:9164:1: ( 'doorsNumber' )
            // InternalHouseBuilderV2.g:9165:2: 'doorsNumber'
            {
             before(grammarAccess.getWindowAccess().getDoorsNumberKeyword_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getDoorsNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3__Impl"


    // $ANTLR start "rule__Window__Group__4"
    // InternalHouseBuilderV2.g:9174:1: rule__Window__Group__4 : rule__Window__Group__4__Impl rule__Window__Group__5 ;
    public final void rule__Window__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9178:1: ( rule__Window__Group__4__Impl rule__Window__Group__5 )
            // InternalHouseBuilderV2.g:9179:2: rule__Window__Group__4__Impl rule__Window__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Window__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__4"


    // $ANTLR start "rule__Window__Group__4__Impl"
    // InternalHouseBuilderV2.g:9186:1: rule__Window__Group__4__Impl : ( ( rule__Window__DoorsNumberAssignment_4 ) ) ;
    public final void rule__Window__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9190:1: ( ( ( rule__Window__DoorsNumberAssignment_4 ) ) )
            // InternalHouseBuilderV2.g:9191:1: ( ( rule__Window__DoorsNumberAssignment_4 ) )
            {
            // InternalHouseBuilderV2.g:9191:1: ( ( rule__Window__DoorsNumberAssignment_4 ) )
            // InternalHouseBuilderV2.g:9192:2: ( rule__Window__DoorsNumberAssignment_4 )
            {
             before(grammarAccess.getWindowAccess().getDoorsNumberAssignment_4()); 
            // InternalHouseBuilderV2.g:9193:2: ( rule__Window__DoorsNumberAssignment_4 )
            // InternalHouseBuilderV2.g:9193:3: rule__Window__DoorsNumberAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Window__DoorsNumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getDoorsNumberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__4__Impl"


    // $ANTLR start "rule__Window__Group__5"
    // InternalHouseBuilderV2.g:9201:1: rule__Window__Group__5 : rule__Window__Group__5__Impl rule__Window__Group__6 ;
    public final void rule__Window__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9205:1: ( rule__Window__Group__5__Impl rule__Window__Group__6 )
            // InternalHouseBuilderV2.g:9206:2: rule__Window__Group__5__Impl rule__Window__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Window__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__5"


    // $ANTLR start "rule__Window__Group__5__Impl"
    // InternalHouseBuilderV2.g:9213:1: rule__Window__Group__5__Impl : ( 'width' ) ;
    public final void rule__Window__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9217:1: ( ( 'width' ) )
            // InternalHouseBuilderV2.g:9218:1: ( 'width' )
            {
            // InternalHouseBuilderV2.g:9218:1: ( 'width' )
            // InternalHouseBuilderV2.g:9219:2: 'width'
            {
             before(grammarAccess.getWindowAccess().getWidthKeyword_5()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getWidthKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__5__Impl"


    // $ANTLR start "rule__Window__Group__6"
    // InternalHouseBuilderV2.g:9228:1: rule__Window__Group__6 : rule__Window__Group__6__Impl rule__Window__Group__7 ;
    public final void rule__Window__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9232:1: ( rule__Window__Group__6__Impl rule__Window__Group__7 )
            // InternalHouseBuilderV2.g:9233:2: rule__Window__Group__6__Impl rule__Window__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Window__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__6"


    // $ANTLR start "rule__Window__Group__6__Impl"
    // InternalHouseBuilderV2.g:9240:1: rule__Window__Group__6__Impl : ( ( rule__Window__WidthAssignment_6 ) ) ;
    public final void rule__Window__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9244:1: ( ( ( rule__Window__WidthAssignment_6 ) ) )
            // InternalHouseBuilderV2.g:9245:1: ( ( rule__Window__WidthAssignment_6 ) )
            {
            // InternalHouseBuilderV2.g:9245:1: ( ( rule__Window__WidthAssignment_6 ) )
            // InternalHouseBuilderV2.g:9246:2: ( rule__Window__WidthAssignment_6 )
            {
             before(grammarAccess.getWindowAccess().getWidthAssignment_6()); 
            // InternalHouseBuilderV2.g:9247:2: ( rule__Window__WidthAssignment_6 )
            // InternalHouseBuilderV2.g:9247:3: rule__Window__WidthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Window__WidthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getWidthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__6__Impl"


    // $ANTLR start "rule__Window__Group__7"
    // InternalHouseBuilderV2.g:9255:1: rule__Window__Group__7 : rule__Window__Group__7__Impl rule__Window__Group__8 ;
    public final void rule__Window__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9259:1: ( rule__Window__Group__7__Impl rule__Window__Group__8 )
            // InternalHouseBuilderV2.g:9260:2: rule__Window__Group__7__Impl rule__Window__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Window__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__7"


    // $ANTLR start "rule__Window__Group__7__Impl"
    // InternalHouseBuilderV2.g:9267:1: rule__Window__Group__7__Impl : ( 'height' ) ;
    public final void rule__Window__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9271:1: ( ( 'height' ) )
            // InternalHouseBuilderV2.g:9272:1: ( 'height' )
            {
            // InternalHouseBuilderV2.g:9272:1: ( 'height' )
            // InternalHouseBuilderV2.g:9273:2: 'height'
            {
             before(grammarAccess.getWindowAccess().getHeightKeyword_7()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getHeightKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__7__Impl"


    // $ANTLR start "rule__Window__Group__8"
    // InternalHouseBuilderV2.g:9282:1: rule__Window__Group__8 : rule__Window__Group__8__Impl rule__Window__Group__9 ;
    public final void rule__Window__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9286:1: ( rule__Window__Group__8__Impl rule__Window__Group__9 )
            // InternalHouseBuilderV2.g:9287:2: rule__Window__Group__8__Impl rule__Window__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Window__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__8"


    // $ANTLR start "rule__Window__Group__8__Impl"
    // InternalHouseBuilderV2.g:9294:1: rule__Window__Group__8__Impl : ( ( rule__Window__HeightAssignment_8 ) ) ;
    public final void rule__Window__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9298:1: ( ( ( rule__Window__HeightAssignment_8 ) ) )
            // InternalHouseBuilderV2.g:9299:1: ( ( rule__Window__HeightAssignment_8 ) )
            {
            // InternalHouseBuilderV2.g:9299:1: ( ( rule__Window__HeightAssignment_8 ) )
            // InternalHouseBuilderV2.g:9300:2: ( rule__Window__HeightAssignment_8 )
            {
             before(grammarAccess.getWindowAccess().getHeightAssignment_8()); 
            // InternalHouseBuilderV2.g:9301:2: ( rule__Window__HeightAssignment_8 )
            // InternalHouseBuilderV2.g:9301:3: rule__Window__HeightAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Window__HeightAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getHeightAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__8__Impl"


    // $ANTLR start "rule__Window__Group__9"
    // InternalHouseBuilderV2.g:9309:1: rule__Window__Group__9 : rule__Window__Group__9__Impl ;
    public final void rule__Window__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9313:1: ( rule__Window__Group__9__Impl )
            // InternalHouseBuilderV2.g:9314:2: rule__Window__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__9"


    // $ANTLR start "rule__Window__Group__9__Impl"
    // InternalHouseBuilderV2.g:9320:1: rule__Window__Group__9__Impl : ( '}' ) ;
    public final void rule__Window__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9324:1: ( ( '}' ) )
            // InternalHouseBuilderV2.g:9325:1: ( '}' )
            {
            // InternalHouseBuilderV2.g:9325:1: ( '}' )
            // InternalHouseBuilderV2.g:9326:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_9()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__9__Impl"


    // $ANTLR start "rule__House__NameAssignment_1"
    // InternalHouseBuilderV2.g:9336:1: rule__House__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__House__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9340:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9341:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9341:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9342:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__NameAssignment_1"


    // $ANTLR start "rule__House__StateAssignment_3_1"
    // InternalHouseBuilderV2.g:9351:1: rule__House__StateAssignment_3_1 : ( ruleEString ) ;
    public final void rule__House__StateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9355:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9356:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9356:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9357:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getStateEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getStateEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__StateAssignment_3_1"


    // $ANTLR start "rule__House__ProvinceAssignment_4_1"
    // InternalHouseBuilderV2.g:9366:1: rule__House__ProvinceAssignment_4_1 : ( ruleEString ) ;
    public final void rule__House__ProvinceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9370:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9371:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9371:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9372:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getProvinceEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getProvinceEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__ProvinceAssignment_4_1"


    // $ANTLR start "rule__House__CityAssignment_5_1"
    // InternalHouseBuilderV2.g:9381:1: rule__House__CityAssignment_5_1 : ( ruleEString ) ;
    public final void rule__House__CityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9385:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9386:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9386:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9387:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getCityEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getCityEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__CityAssignment_5_1"


    // $ANTLR start "rule__House__PostalCodeAssignment_6_1"
    // InternalHouseBuilderV2.g:9396:1: rule__House__PostalCodeAssignment_6_1 : ( ruleEString ) ;
    public final void rule__House__PostalCodeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9400:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9401:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9401:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9402:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getPostalCodeEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getPostalCodeEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__PostalCodeAssignment_6_1"


    // $ANTLR start "rule__House__AddressAssignment_7_1"
    // InternalHouseBuilderV2.g:9411:1: rule__House__AddressAssignment_7_1 : ( ruleEString ) ;
    public final void rule__House__AddressAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9415:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9416:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9416:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9417:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getAddressEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getAddressEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__AddressAssignment_7_1"


    // $ANTLR start "rule__House__BuildingDateAssignment_8_1"
    // InternalHouseBuilderV2.g:9426:1: rule__House__BuildingDateAssignment_8_1 : ( ruleEDate ) ;
    public final void rule__House__BuildingDateAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9430:1: ( ( ruleEDate ) )
            // InternalHouseBuilderV2.g:9431:2: ( ruleEDate )
            {
            // InternalHouseBuilderV2.g:9431:2: ( ruleEDate )
            // InternalHouseBuilderV2.g:9432:3: ruleEDate
            {
             before(grammarAccess.getHouseAccess().getBuildingDateEDateParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getBuildingDateEDateParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__BuildingDateAssignment_8_1"


    // $ANTLR start "rule__House__FloorsAssignment_11"
    // InternalHouseBuilderV2.g:9441:1: rule__House__FloorsAssignment_11 : ( ruleFloor ) ;
    public final void rule__House__FloorsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9445:1: ( ( ruleFloor ) )
            // InternalHouseBuilderV2.g:9446:2: ( ruleFloor )
            {
            // InternalHouseBuilderV2.g:9446:2: ( ruleFloor )
            // InternalHouseBuilderV2.g:9447:3: ruleFloor
            {
             before(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__FloorsAssignment_11"


    // $ANTLR start "rule__House__FloorsAssignment_12_1"
    // InternalHouseBuilderV2.g:9456:1: rule__House__FloorsAssignment_12_1 : ( ruleFloor ) ;
    public final void rule__House__FloorsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9460:1: ( ( ruleFloor ) )
            // InternalHouseBuilderV2.g:9461:2: ( ruleFloor )
            {
            // InternalHouseBuilderV2.g:9461:2: ( ruleFloor )
            // InternalHouseBuilderV2.g:9462:3: ruleFloor
            {
             before(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__FloorsAssignment_12_1"


    // $ANTLR start "rule__House__PassagesAssignment_14_2"
    // InternalHouseBuilderV2.g:9471:1: rule__House__PassagesAssignment_14_2 : ( rulePassage ) ;
    public final void rule__House__PassagesAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9475:1: ( ( rulePassage ) )
            // InternalHouseBuilderV2.g:9476:2: ( rulePassage )
            {
            // InternalHouseBuilderV2.g:9476:2: ( rulePassage )
            // InternalHouseBuilderV2.g:9477:3: rulePassage
            {
             before(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            rulePassage();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__PassagesAssignment_14_2"


    // $ANTLR start "rule__House__PassagesAssignment_14_3_1"
    // InternalHouseBuilderV2.g:9486:1: rule__House__PassagesAssignment_14_3_1 : ( rulePassage ) ;
    public final void rule__House__PassagesAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9490:1: ( ( rulePassage ) )
            // InternalHouseBuilderV2.g:9491:2: ( rulePassage )
            {
            // InternalHouseBuilderV2.g:9491:2: ( rulePassage )
            // InternalHouseBuilderV2.g:9492:3: rulePassage
            {
             before(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePassage();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__PassagesAssignment_14_3_1"


    // $ANTLR start "rule__House__ControllersAssignment_15_2"
    // InternalHouseBuilderV2.g:9501:1: rule__House__ControllersAssignment_15_2 : ( ruleController ) ;
    public final void rule__House__ControllersAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9505:1: ( ( ruleController ) )
            // InternalHouseBuilderV2.g:9506:2: ( ruleController )
            {
            // InternalHouseBuilderV2.g:9506:2: ( ruleController )
            // InternalHouseBuilderV2.g:9507:3: ruleController
            {
             before(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleController();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__ControllersAssignment_15_2"


    // $ANTLR start "rule__House__ControllersAssignment_15_3_1"
    // InternalHouseBuilderV2.g:9516:1: rule__House__ControllersAssignment_15_3_1 : ( ruleController ) ;
    public final void rule__House__ControllersAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9520:1: ( ( ruleController ) )
            // InternalHouseBuilderV2.g:9521:2: ( ruleController )
            {
            // InternalHouseBuilderV2.g:9521:2: ( ruleController )
            // InternalHouseBuilderV2.g:9522:3: ruleController
            {
             before(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_15_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleController();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__ControllersAssignment_15_3_1"


    // $ANTLR start "rule__House__EntrancesAssignment_18"
    // InternalHouseBuilderV2.g:9531:1: rule__House__EntrancesAssignment_18 : ( ruleEntrance ) ;
    public final void rule__House__EntrancesAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9535:1: ( ( ruleEntrance ) )
            // InternalHouseBuilderV2.g:9536:2: ( ruleEntrance )
            {
            // InternalHouseBuilderV2.g:9536:2: ( ruleEntrance )
            // InternalHouseBuilderV2.g:9537:3: ruleEntrance
            {
             before(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleEntrance();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__EntrancesAssignment_18"


    // $ANTLR start "rule__House__EntrancesAssignment_19_1"
    // InternalHouseBuilderV2.g:9546:1: rule__House__EntrancesAssignment_19_1 : ( ruleEntrance ) ;
    public final void rule__House__EntrancesAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9550:1: ( ( ruleEntrance ) )
            // InternalHouseBuilderV2.g:9551:2: ( ruleEntrance )
            {
            // InternalHouseBuilderV2.g:9551:2: ( ruleEntrance )
            // InternalHouseBuilderV2.g:9552:3: ruleEntrance
            {
             before(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_19_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntrance();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_19_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__EntrancesAssignment_19_1"


    // $ANTLR start "rule__Floor__NameAssignment_1"
    // InternalHouseBuilderV2.g:9561:1: rule__Floor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Floor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9565:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9566:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9566:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9567:3: ruleEString
            {
             before(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__NameAssignment_1"


    // $ANTLR start "rule__Floor__LevelAssignment_4"
    // InternalHouseBuilderV2.g:9576:1: rule__Floor__LevelAssignment_4 : ( ruleEInt ) ;
    public final void rule__Floor__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9580:1: ( ( ruleEInt ) )
            // InternalHouseBuilderV2.g:9581:2: ( ruleEInt )
            {
            // InternalHouseBuilderV2.g:9581:2: ( ruleEInt )
            // InternalHouseBuilderV2.g:9582:3: ruleEInt
            {
             before(grammarAccess.getFloorAccess().getLevelEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getLevelEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__LevelAssignment_4"


    // $ANTLR start "rule__Floor__SpacesAssignment_7"
    // InternalHouseBuilderV2.g:9591:1: rule__Floor__SpacesAssignment_7 : ( ruleSpace ) ;
    public final void rule__Floor__SpacesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9595:1: ( ( ruleSpace ) )
            // InternalHouseBuilderV2.g:9596:2: ( ruleSpace )
            {
            // InternalHouseBuilderV2.g:9596:2: ( ruleSpace )
            // InternalHouseBuilderV2.g:9597:3: ruleSpace
            {
             before(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__SpacesAssignment_7"


    // $ANTLR start "rule__Floor__SpacesAssignment_8_1"
    // InternalHouseBuilderV2.g:9606:1: rule__Floor__SpacesAssignment_8_1 : ( ruleSpace ) ;
    public final void rule__Floor__SpacesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9610:1: ( ( ruleSpace ) )
            // InternalHouseBuilderV2.g:9611:2: ( ruleSpace )
            {
            // InternalHouseBuilderV2.g:9611:2: ( ruleSpace )
            // InternalHouseBuilderV2.g:9612:3: ruleSpace
            {
             before(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__SpacesAssignment_8_1"


    // $ANTLR start "rule__Passage__NameAssignment_1"
    // InternalHouseBuilderV2.g:9621:1: rule__Passage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Passage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9625:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9626:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9626:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9627:3: ruleEString
            {
             before(grammarAccess.getPassageAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__NameAssignment_1"


    // $ANTLR start "rule__Passage__DoorTypeAssignment_4"
    // InternalHouseBuilderV2.g:9636:1: rule__Passage__DoorTypeAssignment_4 : ( ruleDoorType ) ;
    public final void rule__Passage__DoorTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9640:1: ( ( ruleDoorType ) )
            // InternalHouseBuilderV2.g:9641:2: ( ruleDoorType )
            {
            // InternalHouseBuilderV2.g:9641:2: ( ruleDoorType )
            // InternalHouseBuilderV2.g:9642:3: ruleDoorType
            {
             before(grammarAccess.getPassageAccess().getDoorTypeDoorTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDoorType();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDoorTypeDoorTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DoorTypeAssignment_4"


    // $ANTLR start "rule__Passage__DoorsNumberAssignment_6"
    // InternalHouseBuilderV2.g:9651:1: rule__Passage__DoorsNumberAssignment_6 : ( ruleEInt ) ;
    public final void rule__Passage__DoorsNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9655:1: ( ( ruleEInt ) )
            // InternalHouseBuilderV2.g:9656:2: ( ruleEInt )
            {
            // InternalHouseBuilderV2.g:9656:2: ( ruleEInt )
            // InternalHouseBuilderV2.g:9657:3: ruleEInt
            {
             before(grammarAccess.getPassageAccess().getDoorsNumberEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDoorsNumberEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DoorsNumberAssignment_6"


    // $ANTLR start "rule__Passage__WidthAssignment_8"
    // InternalHouseBuilderV2.g:9666:1: rule__Passage__WidthAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Passage__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9670:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:9671:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:9671:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:9672:3: ruleEFloat
            {
             before(grammarAccess.getPassageAccess().getWidthEFloatParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getWidthEFloatParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__WidthAssignment_8"


    // $ANTLR start "rule__Passage__HeightAssignment_10"
    // InternalHouseBuilderV2.g:9681:1: rule__Passage__HeightAssignment_10 : ( ruleEFloat ) ;
    public final void rule__Passage__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9685:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:9686:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:9686:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:9687:3: ruleEFloat
            {
             before(grammarAccess.getPassageAccess().getHeightEFloatParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getHeightEFloatParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__HeightAssignment_10"


    // $ANTLR start "rule__Passage__SpaceAAssignment_12"
    // InternalHouseBuilderV2.g:9696:1: rule__Passage__SpaceAAssignment_12 : ( ( ruleEString ) ) ;
    public final void rule__Passage__SpaceAAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9700:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:9701:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:9701:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9702:3: ( ruleEString )
            {
             before(grammarAccess.getPassageAccess().getSpaceASpaceCrossReference_12_0()); 
            // InternalHouseBuilderV2.g:9703:3: ( ruleEString )
            // InternalHouseBuilderV2.g:9704:4: ruleEString
            {
             before(grammarAccess.getPassageAccess().getSpaceASpaceEStringParserRuleCall_12_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getSpaceASpaceEStringParserRuleCall_12_0_1()); 

            }

             after(grammarAccess.getPassageAccess().getSpaceASpaceCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__SpaceAAssignment_12"


    // $ANTLR start "rule__Passage__SpaceBAssignment_14"
    // InternalHouseBuilderV2.g:9715:1: rule__Passage__SpaceBAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__Passage__SpaceBAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9719:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:9720:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:9720:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9721:3: ( ruleEString )
            {
             before(grammarAccess.getPassageAccess().getSpaceBSpaceCrossReference_14_0()); 
            // InternalHouseBuilderV2.g:9722:3: ( ruleEString )
            // InternalHouseBuilderV2.g:9723:4: ruleEString
            {
             before(grammarAccess.getPassageAccess().getSpaceBSpaceEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getSpaceBSpaceEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getPassageAccess().getSpaceBSpaceCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__SpaceBAssignment_14"


    // $ANTLR start "rule__Passage__DevicesAssignment_15_2"
    // InternalHouseBuilderV2.g:9734:1: rule__Passage__DevicesAssignment_15_2 : ( ruleDevice ) ;
    public final void rule__Passage__DevicesAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9738:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:9739:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:9739:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:9740:3: ruleDevice
            {
             before(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DevicesAssignment_15_2"


    // $ANTLR start "rule__Passage__DevicesAssignment_15_3_1"
    // InternalHouseBuilderV2.g:9749:1: rule__Passage__DevicesAssignment_15_3_1 : ( ruleDevice ) ;
    public final void rule__Passage__DevicesAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9753:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:9754:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:9754:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:9755:3: ruleDevice
            {
             before(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_15_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DevicesAssignment_15_3_1"


    // $ANTLR start "rule__Controller__NameAssignment_1"
    // InternalHouseBuilderV2.g:9764:1: rule__Controller__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Controller__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9768:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9769:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9769:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9770:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__NameAssignment_1"


    // $ANTLR start "rule__Controller__ModelAssignment_4"
    // InternalHouseBuilderV2.g:9779:1: rule__Controller__ModelAssignment_4 : ( ruleEString ) ;
    public final void rule__Controller__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9783:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9784:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9784:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9785:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getModelEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getModelEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__ModelAssignment_4"


    // $ANTLR start "rule__Controller__OsAssignment_5_1"
    // InternalHouseBuilderV2.g:9794:1: rule__Controller__OsAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Controller__OsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9798:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9799:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9799:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9800:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getOsEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getOsEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__OsAssignment_5_1"


    // $ANTLR start "rule__Controller__OsVersionAssignment_6_1"
    // InternalHouseBuilderV2.g:9809:1: rule__Controller__OsVersionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Controller__OsVersionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9813:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9814:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9814:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9815:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getOsVersionEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getOsVersionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__OsVersionAssignment_6_1"


    // $ANTLR start "rule__Controller__ActuatorsAssignment_9"
    // InternalHouseBuilderV2.g:9824:1: rule__Controller__ActuatorsAssignment_9 : ( ruleActuator ) ;
    public final void rule__Controller__ActuatorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9828:1: ( ( ruleActuator ) )
            // InternalHouseBuilderV2.g:9829:2: ( ruleActuator )
            {
            // InternalHouseBuilderV2.g:9829:2: ( ruleActuator )
            // InternalHouseBuilderV2.g:9830:3: ruleActuator
            {
             before(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__ActuatorsAssignment_9"


    // $ANTLR start "rule__Controller__ActuatorsAssignment_10_1"
    // InternalHouseBuilderV2.g:9839:1: rule__Controller__ActuatorsAssignment_10_1 : ( ruleActuator ) ;
    public final void rule__Controller__ActuatorsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9843:1: ( ( ruleActuator ) )
            // InternalHouseBuilderV2.g:9844:2: ( ruleActuator )
            {
            // InternalHouseBuilderV2.g:9844:2: ( ruleActuator )
            // InternalHouseBuilderV2.g:9845:3: ruleActuator
            {
             before(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__ActuatorsAssignment_10_1"


    // $ANTLR start "rule__Controller__SensorsAssignment_14"
    // InternalHouseBuilderV2.g:9854:1: rule__Controller__SensorsAssignment_14 : ( ruleSensor ) ;
    public final void rule__Controller__SensorsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9858:1: ( ( ruleSensor ) )
            // InternalHouseBuilderV2.g:9859:2: ( ruleSensor )
            {
            // InternalHouseBuilderV2.g:9859:2: ( ruleSensor )
            // InternalHouseBuilderV2.g:9860:3: ruleSensor
            {
             before(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__SensorsAssignment_14"


    // $ANTLR start "rule__Controller__SensorsAssignment_15_1"
    // InternalHouseBuilderV2.g:9869:1: rule__Controller__SensorsAssignment_15_1 : ( ruleSensor ) ;
    public final void rule__Controller__SensorsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9873:1: ( ( ruleSensor ) )
            // InternalHouseBuilderV2.g:9874:2: ( ruleSensor )
            {
            // InternalHouseBuilderV2.g:9874:2: ( ruleSensor )
            // InternalHouseBuilderV2.g:9875:3: ruleSensor
            {
             before(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__SensorsAssignment_15_1"


    // $ANTLR start "rule__Entrance__NameAssignment_1"
    // InternalHouseBuilderV2.g:9884:1: rule__Entrance__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entrance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9888:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9889:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:9889:2: ( ruleEString )
            // InternalHouseBuilderV2.g:9890:3: ruleEString
            {
             before(grammarAccess.getEntranceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__NameAssignment_1"


    // $ANTLR start "rule__Entrance__DoorTypeAssignment_4"
    // InternalHouseBuilderV2.g:9899:1: rule__Entrance__DoorTypeAssignment_4 : ( ruleDoorType ) ;
    public final void rule__Entrance__DoorTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9903:1: ( ( ruleDoorType ) )
            // InternalHouseBuilderV2.g:9904:2: ( ruleDoorType )
            {
            // InternalHouseBuilderV2.g:9904:2: ( ruleDoorType )
            // InternalHouseBuilderV2.g:9905:3: ruleDoorType
            {
             before(grammarAccess.getEntranceAccess().getDoorTypeDoorTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDoorType();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDoorTypeDoorTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DoorTypeAssignment_4"


    // $ANTLR start "rule__Entrance__DoorsNumberAssignment_6"
    // InternalHouseBuilderV2.g:9914:1: rule__Entrance__DoorsNumberAssignment_6 : ( ruleEInt ) ;
    public final void rule__Entrance__DoorsNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9918:1: ( ( ruleEInt ) )
            // InternalHouseBuilderV2.g:9919:2: ( ruleEInt )
            {
            // InternalHouseBuilderV2.g:9919:2: ( ruleEInt )
            // InternalHouseBuilderV2.g:9920:3: ruleEInt
            {
             before(grammarAccess.getEntranceAccess().getDoorsNumberEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDoorsNumberEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DoorsNumberAssignment_6"


    // $ANTLR start "rule__Entrance__WidthAssignment_8"
    // InternalHouseBuilderV2.g:9929:1: rule__Entrance__WidthAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Entrance__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9933:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:9934:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:9934:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:9935:3: ruleEFloat
            {
             before(grammarAccess.getEntranceAccess().getWidthEFloatParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getWidthEFloatParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__WidthAssignment_8"


    // $ANTLR start "rule__Entrance__HeightAssignment_10"
    // InternalHouseBuilderV2.g:9944:1: rule__Entrance__HeightAssignment_10 : ( ruleEFloat ) ;
    public final void rule__Entrance__HeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9948:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:9949:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:9949:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:9950:3: ruleEFloat
            {
             before(grammarAccess.getEntranceAccess().getHeightEFloatParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getHeightEFloatParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__HeightAssignment_10"


    // $ANTLR start "rule__Entrance__SpaceAssignment_12"
    // InternalHouseBuilderV2.g:9959:1: rule__Entrance__SpaceAssignment_12 : ( ( ruleEString ) ) ;
    public final void rule__Entrance__SpaceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9963:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:9964:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:9964:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:9965:3: ( ruleEString )
            {
             before(grammarAccess.getEntranceAccess().getSpaceSpaceCrossReference_12_0()); 
            // InternalHouseBuilderV2.g:9966:3: ( ruleEString )
            // InternalHouseBuilderV2.g:9967:4: ruleEString
            {
             before(grammarAccess.getEntranceAccess().getSpaceSpaceEStringParserRuleCall_12_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getSpaceSpaceEStringParserRuleCall_12_0_1()); 

            }

             after(grammarAccess.getEntranceAccess().getSpaceSpaceCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__SpaceAssignment_12"


    // $ANTLR start "rule__Entrance__DevicesAssignment_13_2"
    // InternalHouseBuilderV2.g:9978:1: rule__Entrance__DevicesAssignment_13_2 : ( ruleDevice ) ;
    public final void rule__Entrance__DevicesAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9982:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:9983:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:9983:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:9984:3: ruleDevice
            {
             before(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DevicesAssignment_13_2"


    // $ANTLR start "rule__Entrance__DevicesAssignment_13_3_1"
    // InternalHouseBuilderV2.g:9993:1: rule__Entrance__DevicesAssignment_13_3_1 : ( ruleDevice ) ;
    public final void rule__Entrance__DevicesAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:9997:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:9998:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:9998:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:9999:3: ruleDevice
            {
             before(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DevicesAssignment_13_3_1"


    // $ANTLR start "rule__Device__NameAssignment_2"
    // InternalHouseBuilderV2.g:10008:1: rule__Device__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Device__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10012:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10013:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10013:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10014:3: ruleEString
            {
             before(grammarAccess.getDeviceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_2"


    // $ANTLR start "rule__Device__TypeAssignment_4_1"
    // InternalHouseBuilderV2.g:10023:1: rule__Device__TypeAssignment_4_1 : ( ruleDeviceType ) ;
    public final void rule__Device__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10027:1: ( ( ruleDeviceType ) )
            // InternalHouseBuilderV2.g:10028:2: ( ruleDeviceType )
            {
            // InternalHouseBuilderV2.g:10028:2: ( ruleDeviceType )
            // InternalHouseBuilderV2.g:10029:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__TypeAssignment_4_1"


    // $ANTLR start "rule__Device__ModelAssignment_5_1"
    // InternalHouseBuilderV2.g:10038:1: rule__Device__ModelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Device__ModelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10042:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10043:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10043:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10044:3: ruleEString
            {
             before(grammarAccess.getDeviceAccess().getModelEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getModelEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__ModelAssignment_5_1"


    // $ANTLR start "rule__Device__ActuatorAssignment_6_1"
    // InternalHouseBuilderV2.g:10053:1: rule__Device__ActuatorAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Device__ActuatorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10057:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10058:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10058:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10059:3: ( ruleEString )
            {
             before(grammarAccess.getDeviceAccess().getActuatorActuatorCrossReference_6_1_0()); 
            // InternalHouseBuilderV2.g:10060:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10061:4: ruleEString
            {
             before(grammarAccess.getDeviceAccess().getActuatorActuatorEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getActuatorActuatorEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getDeviceAccess().getActuatorActuatorCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__ActuatorAssignment_6_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalHouseBuilderV2.g:10072:1: rule__Sensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10076:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10077:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10077:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10078:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__TypeAssignment_4"
    // InternalHouseBuilderV2.g:10087:1: rule__Sensor__TypeAssignment_4 : ( ruleSensorType ) ;
    public final void rule__Sensor__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10091:1: ( ( ruleSensorType ) )
            // InternalHouseBuilderV2.g:10092:2: ( ruleSensorType )
            {
            // InternalHouseBuilderV2.g:10092:2: ( ruleSensorType )
            // InternalHouseBuilderV2.g:10093:3: ruleSensorType
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__TypeAssignment_4"


    // $ANTLR start "rule__Sensor__ValueAssignment_6"
    // InternalHouseBuilderV2.g:10102:1: rule__Sensor__ValueAssignment_6 : ( ruleEFloat ) ;
    public final void rule__Sensor__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10106:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10107:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10107:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10108:3: ruleEFloat
            {
             before(grammarAccess.getSensorAccess().getValueEFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getValueEFloatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ValueAssignment_6"


    // $ANTLR start "rule__Sensor__ModelAssignment_7_1"
    // InternalHouseBuilderV2.g:10117:1: rule__Sensor__ModelAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Sensor__ModelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10121:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10122:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10122:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10123:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getModelEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getModelEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ModelAssignment_7_1"


    // $ANTLR start "rule__Sensor__SpaceAssignment_9"
    // InternalHouseBuilderV2.g:10132:1: rule__Sensor__SpaceAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Sensor__SpaceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10136:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10137:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10137:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10138:3: ( ruleEString )
            {
             before(grammarAccess.getSensorAccess().getSpaceSpaceCrossReference_9_0()); 
            // InternalHouseBuilderV2.g:10139:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10140:4: ruleEString
            {
             before(grammarAccess.getSensorAccess().getSpaceSpaceEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSpaceSpaceEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getSensorAccess().getSpaceSpaceCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SpaceAssignment_9"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalHouseBuilderV2.g:10151:1: rule__Room__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10155:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10156:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10156:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10157:3: ruleEString
            {
             before(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Room__LengthAssignment_4"
    // InternalHouseBuilderV2.g:10166:1: rule__Room__LengthAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Room__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10170:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10171:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10171:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10172:3: ruleEFloat
            {
             before(grammarAccess.getRoomAccess().getLengthEFloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getLengthEFloatParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__LengthAssignment_4"


    // $ANTLR start "rule__Room__WidthAssignment_6"
    // InternalHouseBuilderV2.g:10181:1: rule__Room__WidthAssignment_6 : ( ruleEFloat ) ;
    public final void rule__Room__WidthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10185:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10186:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10186:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10187:3: ruleEFloat
            {
             before(grammarAccess.getRoomAccess().getWidthEFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getWidthEFloatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__WidthAssignment_6"


    // $ANTLR start "rule__Room__HeightAssignment_8"
    // InternalHouseBuilderV2.g:10196:1: rule__Room__HeightAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Room__HeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10200:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10201:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10201:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10202:3: ruleEFloat
            {
             before(grammarAccess.getRoomAccess().getHeightEFloatParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getHeightEFloatParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__HeightAssignment_8"


    // $ANTLR start "rule__Room__RoomTypeAssignment_9_1"
    // InternalHouseBuilderV2.g:10211:1: rule__Room__RoomTypeAssignment_9_1 : ( ruleRoomType ) ;
    public final void rule__Room__RoomTypeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10215:1: ( ( ruleRoomType ) )
            // InternalHouseBuilderV2.g:10216:2: ( ruleRoomType )
            {
            // InternalHouseBuilderV2.g:10216:2: ( ruleRoomType )
            // InternalHouseBuilderV2.g:10217:3: ruleRoomType
            {
             before(grammarAccess.getRoomAccess().getRoomTypeRoomTypeEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoomType();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getRoomTypeRoomTypeEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__RoomTypeAssignment_9_1"


    // $ANTLR start "rule__Room__SensorsAssignment_10_2"
    // InternalHouseBuilderV2.g:10226:1: rule__Room__SensorsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__Room__SensorsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10230:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10231:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10231:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10232:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorCrossReference_10_2_0()); 
            // InternalHouseBuilderV2.g:10233:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10234:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getSensorsSensorCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__SensorsAssignment_10_2"


    // $ANTLR start "rule__Room__SensorsAssignment_10_3_1"
    // InternalHouseBuilderV2.g:10245:1: rule__Room__SensorsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Room__SensorsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10249:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10250:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10250:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10251:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorCrossReference_10_3_1_0()); 
            // InternalHouseBuilderV2.g:10252:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10253:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getSensorsSensorEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getSensorsSensorEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getSensorsSensorCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__SensorsAssignment_10_3_1"


    // $ANTLR start "rule__Room__PassagesAAssignment_11_2"
    // InternalHouseBuilderV2.g:10264:1: rule__Room__PassagesAAssignment_11_2 : ( ( ruleEString ) ) ;
    public final void rule__Room__PassagesAAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10268:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10269:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10269:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10270:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getPassagesAPassageCrossReference_11_2_0()); 
            // InternalHouseBuilderV2.g:10271:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10272:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getPassagesAPassageEStringParserRuleCall_11_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getPassagesAPassageEStringParserRuleCall_11_2_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getPassagesAPassageCrossReference_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__PassagesAAssignment_11_2"


    // $ANTLR start "rule__Room__PassagesAAssignment_11_3_1"
    // InternalHouseBuilderV2.g:10283:1: rule__Room__PassagesAAssignment_11_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Room__PassagesAAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10287:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10288:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10288:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10289:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getPassagesAPassageCrossReference_11_3_1_0()); 
            // InternalHouseBuilderV2.g:10290:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10291:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getPassagesAPassageEStringParserRuleCall_11_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getPassagesAPassageEStringParserRuleCall_11_3_1_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getPassagesAPassageCrossReference_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__PassagesAAssignment_11_3_1"


    // $ANTLR start "rule__Room__PassagesBAssignment_12_2"
    // InternalHouseBuilderV2.g:10302:1: rule__Room__PassagesBAssignment_12_2 : ( ( ruleEString ) ) ;
    public final void rule__Room__PassagesBAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10306:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10307:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10307:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10308:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getPassagesBPassageCrossReference_12_2_0()); 
            // InternalHouseBuilderV2.g:10309:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10310:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getPassagesBPassageEStringParserRuleCall_12_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getPassagesBPassageEStringParserRuleCall_12_2_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getPassagesBPassageCrossReference_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__PassagesBAssignment_12_2"


    // $ANTLR start "rule__Room__PassagesBAssignment_12_3_1"
    // InternalHouseBuilderV2.g:10321:1: rule__Room__PassagesBAssignment_12_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Room__PassagesBAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10325:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10326:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10326:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10327:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getPassagesBPassageCrossReference_12_3_1_0()); 
            // InternalHouseBuilderV2.g:10328:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10329:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getPassagesBPassageEStringParserRuleCall_12_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getPassagesBPassageEStringParserRuleCall_12_3_1_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getPassagesBPassageCrossReference_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__PassagesBAssignment_12_3_1"


    // $ANTLR start "rule__Room__EntrancesAssignment_13_2"
    // InternalHouseBuilderV2.g:10340:1: rule__Room__EntrancesAssignment_13_2 : ( ( ruleEString ) ) ;
    public final void rule__Room__EntrancesAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10344:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10345:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10345:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10346:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getEntrancesEntranceCrossReference_13_2_0()); 
            // InternalHouseBuilderV2.g:10347:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10348:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getEntrancesEntranceEStringParserRuleCall_13_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getEntrancesEntranceEStringParserRuleCall_13_2_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getEntrancesEntranceCrossReference_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__EntrancesAssignment_13_2"


    // $ANTLR start "rule__Room__EntrancesAssignment_13_3_1"
    // InternalHouseBuilderV2.g:10359:1: rule__Room__EntrancesAssignment_13_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Room__EntrancesAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10363:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10364:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10364:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10365:3: ( ruleEString )
            {
             before(grammarAccess.getRoomAccess().getEntrancesEntranceCrossReference_13_3_1_0()); 
            // InternalHouseBuilderV2.g:10366:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10367:4: ruleEString
            {
             before(grammarAccess.getRoomAccess().getEntrancesEntranceEStringParserRuleCall_13_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getEntrancesEntranceEStringParserRuleCall_13_3_1_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getEntrancesEntranceCrossReference_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__EntrancesAssignment_13_3_1"


    // $ANTLR start "rule__Room__DevicesAssignment_14_2"
    // InternalHouseBuilderV2.g:10378:1: rule__Room__DevicesAssignment_14_2 : ( ruleDevice ) ;
    public final void rule__Room__DevicesAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10382:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:10383:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:10383:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:10384:3: ruleDevice
            {
             before(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__DevicesAssignment_14_2"


    // $ANTLR start "rule__Room__DevicesAssignment_14_3_1"
    // InternalHouseBuilderV2.g:10393:1: rule__Room__DevicesAssignment_14_3_1 : ( ruleDevice ) ;
    public final void rule__Room__DevicesAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10397:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:10398:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:10398:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:10399:3: ruleDevice
            {
             before(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__DevicesAssignment_14_3_1"


    // $ANTLR start "rule__Room__WindowsAssignment_15_2"
    // InternalHouseBuilderV2.g:10408:1: rule__Room__WindowsAssignment_15_2 : ( ruleWindow ) ;
    public final void rule__Room__WindowsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10412:1: ( ( ruleWindow ) )
            // InternalHouseBuilderV2.g:10413:2: ( ruleWindow )
            {
            // InternalHouseBuilderV2.g:10413:2: ( ruleWindow )
            // InternalHouseBuilderV2.g:10414:3: ruleWindow
            {
             before(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__WindowsAssignment_15_2"


    // $ANTLR start "rule__Room__WindowsAssignment_15_3_1"
    // InternalHouseBuilderV2.g:10423:1: rule__Room__WindowsAssignment_15_3_1 : ( ruleWindow ) ;
    public final void rule__Room__WindowsAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10427:1: ( ( ruleWindow ) )
            // InternalHouseBuilderV2.g:10428:2: ( ruleWindow )
            {
            // InternalHouseBuilderV2.g:10428:2: ( ruleWindow )
            // InternalHouseBuilderV2.g:10429:3: ruleWindow
            {
             before(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_15_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__WindowsAssignment_15_3_1"


    // $ANTLR start "rule__ExternalSpace__NameAssignment_1"
    // InternalHouseBuilderV2.g:10438:1: rule__ExternalSpace__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExternalSpace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10442:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10443:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10443:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10444:3: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__NameAssignment_1"


    // $ANTLR start "rule__ExternalSpace__LengthAssignment_4"
    // InternalHouseBuilderV2.g:10453:1: rule__ExternalSpace__LengthAssignment_4 : ( ruleEFloat ) ;
    public final void rule__ExternalSpace__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10457:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10458:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10458:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10459:3: ruleEFloat
            {
             before(grammarAccess.getExternalSpaceAccess().getLengthEFloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getLengthEFloatParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__LengthAssignment_4"


    // $ANTLR start "rule__ExternalSpace__WidthAssignment_6"
    // InternalHouseBuilderV2.g:10468:1: rule__ExternalSpace__WidthAssignment_6 : ( ruleEFloat ) ;
    public final void rule__ExternalSpace__WidthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10472:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10473:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10473:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10474:3: ruleEFloat
            {
             before(grammarAccess.getExternalSpaceAccess().getWidthEFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getWidthEFloatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__WidthAssignment_6"


    // $ANTLR start "rule__ExternalSpace__TypeAssignment_7_1"
    // InternalHouseBuilderV2.g:10483:1: rule__ExternalSpace__TypeAssignment_7_1 : ( ruleOuterSpaceType ) ;
    public final void rule__ExternalSpace__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10487:1: ( ( ruleOuterSpaceType ) )
            // InternalHouseBuilderV2.g:10488:2: ( ruleOuterSpaceType )
            {
            // InternalHouseBuilderV2.g:10488:2: ( ruleOuterSpaceType )
            // InternalHouseBuilderV2.g:10489:3: ruleOuterSpaceType
            {
             before(grammarAccess.getExternalSpaceAccess().getTypeOuterSpaceTypeEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOuterSpaceType();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getTypeOuterSpaceTypeEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__TypeAssignment_7_1"


    // $ANTLR start "rule__ExternalSpace__GroundAssignment_8_1"
    // InternalHouseBuilderV2.g:10498:1: rule__ExternalSpace__GroundAssignment_8_1 : ( ruleGroundType ) ;
    public final void rule__ExternalSpace__GroundAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10502:1: ( ( ruleGroundType ) )
            // InternalHouseBuilderV2.g:10503:2: ( ruleGroundType )
            {
            // InternalHouseBuilderV2.g:10503:2: ( ruleGroundType )
            // InternalHouseBuilderV2.g:10504:3: ruleGroundType
            {
             before(grammarAccess.getExternalSpaceAccess().getGroundGroundTypeEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroundType();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getGroundGroundTypeEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__GroundAssignment_8_1"


    // $ANTLR start "rule__ExternalSpace__SensorsAssignment_9_2"
    // InternalHouseBuilderV2.g:10513:1: rule__ExternalSpace__SensorsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__SensorsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10517:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10518:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10518:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10519:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getSensorsSensorCrossReference_9_2_0()); 
            // InternalHouseBuilderV2.g:10520:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10521:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getSensorsSensorEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getSensorsSensorEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getSensorsSensorCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__SensorsAssignment_9_2"


    // $ANTLR start "rule__ExternalSpace__SensorsAssignment_9_3_1"
    // InternalHouseBuilderV2.g:10532:1: rule__ExternalSpace__SensorsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__SensorsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10536:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10537:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10537:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10538:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getSensorsSensorCrossReference_9_3_1_0()); 
            // InternalHouseBuilderV2.g:10539:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10540:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getSensorsSensorEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getSensorsSensorEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getSensorsSensorCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__SensorsAssignment_9_3_1"


    // $ANTLR start "rule__ExternalSpace__PassagesAAssignment_10_2"
    // InternalHouseBuilderV2.g:10551:1: rule__ExternalSpace__PassagesAAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__PassagesAAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10555:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10556:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10556:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10557:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesAPassageCrossReference_10_2_0()); 
            // InternalHouseBuilderV2.g:10558:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10559:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesAPassageEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getPassagesAPassageEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesAPassageCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__PassagesAAssignment_10_2"


    // $ANTLR start "rule__ExternalSpace__PassagesAAssignment_10_3_1"
    // InternalHouseBuilderV2.g:10570:1: rule__ExternalSpace__PassagesAAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__PassagesAAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10574:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10575:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10575:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10576:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesAPassageCrossReference_10_3_1_0()); 
            // InternalHouseBuilderV2.g:10577:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10578:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesAPassageEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getPassagesAPassageEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesAPassageCrossReference_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__PassagesAAssignment_10_3_1"


    // $ANTLR start "rule__ExternalSpace__PassagesBAssignment_11_2"
    // InternalHouseBuilderV2.g:10589:1: rule__ExternalSpace__PassagesBAssignment_11_2 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__PassagesBAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10593:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10594:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10594:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10595:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesBPassageCrossReference_11_2_0()); 
            // InternalHouseBuilderV2.g:10596:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10597:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesBPassageEStringParserRuleCall_11_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getPassagesBPassageEStringParserRuleCall_11_2_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesBPassageCrossReference_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__PassagesBAssignment_11_2"


    // $ANTLR start "rule__ExternalSpace__PassagesBAssignment_11_3_1"
    // InternalHouseBuilderV2.g:10608:1: rule__ExternalSpace__PassagesBAssignment_11_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__PassagesBAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10612:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10613:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10613:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10614:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesBPassageCrossReference_11_3_1_0()); 
            // InternalHouseBuilderV2.g:10615:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10616:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getPassagesBPassageEStringParserRuleCall_11_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getPassagesBPassageEStringParserRuleCall_11_3_1_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getPassagesBPassageCrossReference_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__PassagesBAssignment_11_3_1"


    // $ANTLR start "rule__ExternalSpace__EntrancesAssignment_12_2"
    // InternalHouseBuilderV2.g:10627:1: rule__ExternalSpace__EntrancesAssignment_12_2 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__EntrancesAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10631:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10632:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10632:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10633:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceCrossReference_12_2_0()); 
            // InternalHouseBuilderV2.g:10634:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10635:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceEStringParserRuleCall_12_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceEStringParserRuleCall_12_2_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceCrossReference_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__EntrancesAssignment_12_2"


    // $ANTLR start "rule__ExternalSpace__EntrancesAssignment_12_3_1"
    // InternalHouseBuilderV2.g:10646:1: rule__ExternalSpace__EntrancesAssignment_12_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ExternalSpace__EntrancesAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10650:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10651:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10651:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10652:3: ( ruleEString )
            {
             before(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceCrossReference_12_3_1_0()); 
            // InternalHouseBuilderV2.g:10653:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10654:4: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceEStringParserRuleCall_12_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceEStringParserRuleCall_12_3_1_0_1()); 

            }

             after(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceCrossReference_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__EntrancesAssignment_12_3_1"


    // $ANTLR start "rule__ExternalSpace__DevicesAssignment_13_2"
    // InternalHouseBuilderV2.g:10665:1: rule__ExternalSpace__DevicesAssignment_13_2 : ( ruleDevice ) ;
    public final void rule__ExternalSpace__DevicesAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10669:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:10670:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:10670:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:10671:3: ruleDevice
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__DevicesAssignment_13_2"


    // $ANTLR start "rule__ExternalSpace__DevicesAssignment_13_3_1"
    // InternalHouseBuilderV2.g:10680:1: rule__ExternalSpace__DevicesAssignment_13_3_1 : ( ruleDevice ) ;
    public final void rule__ExternalSpace__DevicesAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10684:1: ( ( ruleDevice ) )
            // InternalHouseBuilderV2.g:10685:2: ( ruleDevice )
            {
            // InternalHouseBuilderV2.g:10685:2: ( ruleDevice )
            // InternalHouseBuilderV2.g:10686:3: ruleDevice
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__DevicesAssignment_13_3_1"


    // $ANTLR start "rule__Actuator__NameAssignment_1"
    // InternalHouseBuilderV2.g:10695:1: rule__Actuator__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Actuator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10699:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10700:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10700:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10701:3: ruleEString
            {
             before(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__NameAssignment_1"


    // $ANTLR start "rule__Actuator__TypeAssignment_4"
    // InternalHouseBuilderV2.g:10710:1: rule__Actuator__TypeAssignment_4 : ( ruleActuatorType ) ;
    public final void rule__Actuator__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10714:1: ( ( ruleActuatorType ) )
            // InternalHouseBuilderV2.g:10715:2: ( ruleActuatorType )
            {
            // InternalHouseBuilderV2.g:10715:2: ( ruleActuatorType )
            // InternalHouseBuilderV2.g:10716:3: ruleActuatorType
            {
             before(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActuatorType();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__TypeAssignment_4"


    // $ANTLR start "rule__Actuator__ModelAssignment_5_1"
    // InternalHouseBuilderV2.g:10725:1: rule__Actuator__ModelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Actuator__ModelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10729:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10730:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10730:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10731:3: ruleEString
            {
             before(grammarAccess.getActuatorAccess().getModelEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getModelEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__ModelAssignment_5_1"


    // $ANTLR start "rule__Actuator__DeviceAssignment_7"
    // InternalHouseBuilderV2.g:10740:1: rule__Actuator__DeviceAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Actuator__DeviceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10744:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilderV2.g:10745:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilderV2.g:10745:2: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10746:3: ( ruleEString )
            {
             before(grammarAccess.getActuatorAccess().getDeviceDeviceCrossReference_7_0()); 
            // InternalHouseBuilderV2.g:10747:3: ( ruleEString )
            // InternalHouseBuilderV2.g:10748:4: ruleEString
            {
             before(grammarAccess.getActuatorAccess().getDeviceDeviceEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getDeviceDeviceEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getActuatorAccess().getDeviceDeviceCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__DeviceAssignment_7"


    // $ANTLR start "rule__Window__NameAssignment_1"
    // InternalHouseBuilderV2.g:10759:1: rule__Window__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Window__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10763:1: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:10764:2: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:10764:2: ( ruleEString )
            // InternalHouseBuilderV2.g:10765:3: ruleEString
            {
             before(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__NameAssignment_1"


    // $ANTLR start "rule__Window__DoorsNumberAssignment_4"
    // InternalHouseBuilderV2.g:10774:1: rule__Window__DoorsNumberAssignment_4 : ( ruleEInt ) ;
    public final void rule__Window__DoorsNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10778:1: ( ( ruleEInt ) )
            // InternalHouseBuilderV2.g:10779:2: ( ruleEInt )
            {
            // InternalHouseBuilderV2.g:10779:2: ( ruleEInt )
            // InternalHouseBuilderV2.g:10780:3: ruleEInt
            {
             before(grammarAccess.getWindowAccess().getDoorsNumberEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getDoorsNumberEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__DoorsNumberAssignment_4"


    // $ANTLR start "rule__Window__WidthAssignment_6"
    // InternalHouseBuilderV2.g:10789:1: rule__Window__WidthAssignment_6 : ( ruleEFloat ) ;
    public final void rule__Window__WidthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10793:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10794:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10794:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10795:3: ruleEFloat
            {
             before(grammarAccess.getWindowAccess().getWidthEFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getWidthEFloatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__WidthAssignment_6"


    // $ANTLR start "rule__Window__HeightAssignment_8"
    // InternalHouseBuilderV2.g:10804:1: rule__Window__HeightAssignment_8 : ( ruleEFloat ) ;
    public final void rule__Window__HeightAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilderV2.g:10808:1: ( ( ruleEFloat ) )
            // InternalHouseBuilderV2.g:10809:2: ( ruleEFloat )
            {
            // InternalHouseBuilderV2.g:10809:2: ( ruleEFloat )
            // InternalHouseBuilderV2.g:10810:3: ruleEFloat
            {
             before(grammarAccess.getWindowAccess().getHeightEFloatParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getHeightEFloatParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__HeightAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x9000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x4000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L,0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000040400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x03E0000080040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L,0x0000000018000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000001A00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2000000000000000L,0x00000000C0100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000004100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x6000000000000000L,0x0000039000440000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00007FFF80000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x6000000000000000L,0x0000098040440000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000200000100000L});

}