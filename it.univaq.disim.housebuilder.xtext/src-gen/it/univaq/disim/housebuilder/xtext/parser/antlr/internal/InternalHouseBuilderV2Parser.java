package it.univaq.disim.housebuilder.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.univaq.disim.housebuilder.xtext.services.HouseBuilderV2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHouseBuilderV2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'House'", "'{'", "'state'", "'province'", "'city'", "'postalCode'", "'address'", "'buildingDate'", "'floors'", "','", "'}'", "'passages'", "'controllers'", "'entrances'", "'EDate'", "'Floor'", "'level'", "'spaces'", "'Passage'", "'doorType'", "'doorsNumber'", "'width'", "'height'", "'spaceA'", "'spaceB'", "'devices'", "'Controller'", "'model'", "'os'", "'osVersion'", "'actuators'", "'sensors'", "'Entrance'", "'space'", "'-'", "'.'", "'E'", "'e'", "'Device'", "'type'", "'actuator'", "'Sensor'", "'value'", "'Room'", "'length'", "'roomType'", "'('", "')'", "'windows'", "'ExternalSpace'", "'ground'", "'Actuator'", "'device'", "'Window'", "'THERMOSTAT'", "'APPLIANCE'", "'SOCKET'", "'ROLLER_SHUTTERS'", "'GATE'", "'IDRAULIC'", "'PNEUMATIC'", "'ELECTRICAL'", "'THERMAL'", "'MECHANICAL'", "'TEMPERATURE'", "'PRESSURE'", "'PROXIMITY'", "'ACCELEROMETER'", "'GAS'", "'SMOKE'", "'VIDEO_SURVAILLANCE_CAMERA'", "'SIMPLE'", "'BATHROOM'", "'LIVING_ROOM'", "'BEDROOM'", "'HALLWAY'", "'STUDY'", "'ENTRANCE'", "'STORAGE_ROOM'", "'GARAGE'", "'LAUNDRY_ROOM'", "'HOBBY_ROOM'", "'CELLAR'", "'LUNCHROOM'", "'RUMPUS_ROOM'", "'STAIRS'", "'KITCHEN'", "'BALCONY'", "'GARDEN'", "'TERRACE'", "'ASPALTH'", "'TERRAIN'", "'PAVING'", "'DOOR_WINDOW'", "'PANIC_DOOR'", "'ENTRANCE_DOOR'", "'SLIDING_DOOR'", "'EMPTY'"
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
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
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

        public InternalHouseBuilderV2Parser(TokenStream input, HouseBuilderV2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "House";
       	}

       	@Override
       	protected HouseBuilderV2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHouse"
    // InternalHouseBuilderV2.g:65:1: entryRuleHouse returns [EObject current=null] : iv_ruleHouse= ruleHouse EOF ;
    public final EObject entryRuleHouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHouse = null;


        try {
            // InternalHouseBuilderV2.g:65:46: (iv_ruleHouse= ruleHouse EOF )
            // InternalHouseBuilderV2.g:66:2: iv_ruleHouse= ruleHouse EOF
            {
             newCompositeNode(grammarAccess.getHouseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHouse=ruleHouse();

            state._fsp--;

             current =iv_ruleHouse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHouse"


    // $ANTLR start "ruleHouse"
    // InternalHouseBuilderV2.g:72:1: ruleHouse returns [EObject current=null] : (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' (otherlv_21= 'passages' otherlv_22= '{' ( (lv_passages_23_0= rulePassage ) ) (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )* otherlv_26= '}' )? (otherlv_27= 'controllers' otherlv_28= '{' ( (lv_controllers_29_0= ruleController ) ) (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )* otherlv_32= '}' )? otherlv_33= 'entrances' otherlv_34= '{' ( (lv_entrances_35_0= ruleEntrance ) ) (otherlv_36= ',' ( (lv_entrances_37_0= ruleEntrance ) ) )* otherlv_38= '}' otherlv_39= '}' ) ;
    public final EObject ruleHouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_state_4_0 = null;

        AntlrDatatypeRuleToken lv_province_6_0 = null;

        AntlrDatatypeRuleToken lv_city_8_0 = null;

        AntlrDatatypeRuleToken lv_postalCode_10_0 = null;

        AntlrDatatypeRuleToken lv_address_12_0 = null;

        AntlrDatatypeRuleToken lv_buildingDate_14_0 = null;

        EObject lv_floors_17_0 = null;

        EObject lv_floors_19_0 = null;

        EObject lv_passages_23_0 = null;

        EObject lv_passages_25_0 = null;

        EObject lv_controllers_29_0 = null;

        EObject lv_controllers_31_0 = null;

        EObject lv_entrances_35_0 = null;

        EObject lv_entrances_37_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:78:2: ( (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' (otherlv_21= 'passages' otherlv_22= '{' ( (lv_passages_23_0= rulePassage ) ) (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )* otherlv_26= '}' )? (otherlv_27= 'controllers' otherlv_28= '{' ( (lv_controllers_29_0= ruleController ) ) (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )* otherlv_32= '}' )? otherlv_33= 'entrances' otherlv_34= '{' ( (lv_entrances_35_0= ruleEntrance ) ) (otherlv_36= ',' ( (lv_entrances_37_0= ruleEntrance ) ) )* otherlv_38= '}' otherlv_39= '}' ) )
            // InternalHouseBuilderV2.g:79:2: (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' (otherlv_21= 'passages' otherlv_22= '{' ( (lv_passages_23_0= rulePassage ) ) (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )* otherlv_26= '}' )? (otherlv_27= 'controllers' otherlv_28= '{' ( (lv_controllers_29_0= ruleController ) ) (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )* otherlv_32= '}' )? otherlv_33= 'entrances' otherlv_34= '{' ( (lv_entrances_35_0= ruleEntrance ) ) (otherlv_36= ',' ( (lv_entrances_37_0= ruleEntrance ) ) )* otherlv_38= '}' otherlv_39= '}' )
            {
            // InternalHouseBuilderV2.g:79:2: (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' (otherlv_21= 'passages' otherlv_22= '{' ( (lv_passages_23_0= rulePassage ) ) (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )* otherlv_26= '}' )? (otherlv_27= 'controllers' otherlv_28= '{' ( (lv_controllers_29_0= ruleController ) ) (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )* otherlv_32= '}' )? otherlv_33= 'entrances' otherlv_34= '{' ( (lv_entrances_35_0= ruleEntrance ) ) (otherlv_36= ',' ( (lv_entrances_37_0= ruleEntrance ) ) )* otherlv_38= '}' otherlv_39= '}' )
            // InternalHouseBuilderV2.g:80:3: otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' (otherlv_21= 'passages' otherlv_22= '{' ( (lv_passages_23_0= rulePassage ) ) (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )* otherlv_26= '}' )? (otherlv_27= 'controllers' otherlv_28= '{' ( (lv_controllers_29_0= ruleController ) ) (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )* otherlv_32= '}' )? otherlv_33= 'entrances' otherlv_34= '{' ( (lv_entrances_35_0= ruleEntrance ) ) (otherlv_36= ',' ( (lv_entrances_37_0= ruleEntrance ) ) )* otherlv_38= '}' otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHouseAccess().getHouseKeyword_0());
            		
            // InternalHouseBuilderV2.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:85:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHouseAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHouseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHouseBuilderV2.g:107:3: (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalHouseBuilderV2.g:108:4: otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHouseAccess().getStateKeyword_3_0());
                    			
                    // InternalHouseBuilderV2.g:112:4: ( (lv_state_4_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:113:5: (lv_state_4_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:113:5: (lv_state_4_0= ruleEString )
                    // InternalHouseBuilderV2.g:114:6: lv_state_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getStateEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_state_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_4_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:132:3: (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalHouseBuilderV2.g:133:4: otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getHouseAccess().getProvinceKeyword_4_0());
                    			
                    // InternalHouseBuilderV2.g:137:4: ( (lv_province_6_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:138:5: (lv_province_6_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:138:5: (lv_province_6_0= ruleEString )
                    // InternalHouseBuilderV2.g:139:6: lv_province_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getProvinceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_province_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"province",
                    							lv_province_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:157:3: (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHouseBuilderV2.g:158:4: otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getHouseAccess().getCityKeyword_5_0());
                    			
                    // InternalHouseBuilderV2.g:162:4: ( (lv_city_8_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:163:5: (lv_city_8_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:163:5: (lv_city_8_0= ruleEString )
                    // InternalHouseBuilderV2.g:164:6: lv_city_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getCityEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_city_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"city",
                    							lv_city_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:182:3: (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHouseBuilderV2.g:183:4: otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getHouseAccess().getPostalCodeKeyword_6_0());
                    			
                    // InternalHouseBuilderV2.g:187:4: ( (lv_postalCode_10_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:188:5: (lv_postalCode_10_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:188:5: (lv_postalCode_10_0= ruleEString )
                    // InternalHouseBuilderV2.g:189:6: lv_postalCode_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getPostalCodeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_postalCode_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"postalCode",
                    							lv_postalCode_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:207:3: (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHouseBuilderV2.g:208:4: otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getHouseAccess().getAddressKeyword_7_0());
                    			
                    // InternalHouseBuilderV2.g:212:4: ( (lv_address_12_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:213:5: (lv_address_12_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:213:5: (lv_address_12_0= ruleEString )
                    // InternalHouseBuilderV2.g:214:6: lv_address_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getAddressEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_address_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_12_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:232:3: (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHouseBuilderV2.g:233:4: otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getHouseAccess().getBuildingDateKeyword_8_0());
                    			
                    // InternalHouseBuilderV2.g:237:4: ( (lv_buildingDate_14_0= ruleEDate ) )
                    // InternalHouseBuilderV2.g:238:5: (lv_buildingDate_14_0= ruleEDate )
                    {
                    // InternalHouseBuilderV2.g:238:5: (lv_buildingDate_14_0= ruleEDate )
                    // InternalHouseBuilderV2.g:239:6: lv_buildingDate_14_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getBuildingDateEDateParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_buildingDate_14_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"buildingDate",
                    							lv_buildingDate_14_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getHouseAccess().getFloorsKeyword_9());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalHouseBuilderV2.g:265:3: ( (lv_floors_17_0= ruleFloor ) )
            // InternalHouseBuilderV2.g:266:4: (lv_floors_17_0= ruleFloor )
            {
            // InternalHouseBuilderV2.g:266:4: (lv_floors_17_0= ruleFloor )
            // InternalHouseBuilderV2.g:267:5: lv_floors_17_0= ruleFloor
            {

            					newCompositeNode(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_14);
            lv_floors_17_0=ruleFloor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHouseRule());
            					}
            					add(
            						current,
            						"floors",
            						lv_floors_17_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Floor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:284:3: (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:285:4: otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) )
            	    {
            	    otherlv_18=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_18, grammarAccess.getHouseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalHouseBuilderV2.g:289:4: ( (lv_floors_19_0= ruleFloor ) )
            	    // InternalHouseBuilderV2.g:290:5: (lv_floors_19_0= ruleFloor )
            	    {
            	    // InternalHouseBuilderV2.g:290:5: (lv_floors_19_0= ruleFloor )
            	    // InternalHouseBuilderV2.g:291:6: lv_floors_19_0= ruleFloor
            	    {

            	    						newCompositeNode(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_floors_19_0=ruleFloor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHouseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"floors",
            	    							lv_floors_19_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Floor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_20=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_20, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_13());
            		
            // InternalHouseBuilderV2.g:313:3: (otherlv_21= 'passages' otherlv_22= '{' ( (lv_passages_23_0= rulePassage ) ) (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )* otherlv_26= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHouseBuilderV2.g:314:4: otherlv_21= 'passages' otherlv_22= '{' ( (lv_passages_23_0= rulePassage ) ) (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getHouseAccess().getPassagesKeyword_14_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_22, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalHouseBuilderV2.g:322:4: ( (lv_passages_23_0= rulePassage ) )
                    // InternalHouseBuilderV2.g:323:5: (lv_passages_23_0= rulePassage )
                    {
                    // InternalHouseBuilderV2.g:323:5: (lv_passages_23_0= rulePassage )
                    // InternalHouseBuilderV2.g:324:6: lv_passages_23_0= rulePassage
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_passages_23_0=rulePassage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						add(
                    							current,
                    							"passages",
                    							lv_passages_23_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Passage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:341:4: (otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:342:5: otherlv_24= ',' ( (lv_passages_25_0= rulePassage ) )
                    	    {
                    	    otherlv_24=(Token)match(input,20,FOLLOW_16); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getHouseAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:346:5: ( (lv_passages_25_0= rulePassage ) )
                    	    // InternalHouseBuilderV2.g:347:6: (lv_passages_25_0= rulePassage )
                    	    {
                    	    // InternalHouseBuilderV2.g:347:6: (lv_passages_25_0= rulePassage )
                    	    // InternalHouseBuilderV2.g:348:7: lv_passages_25_0= rulePassage
                    	    {

                    	    							newCompositeNode(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_passages_25_0=rulePassage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHouseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"passages",
                    	    								lv_passages_25_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Passage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_26, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilderV2.g:371:3: (otherlv_27= 'controllers' otherlv_28= '{' ( (lv_controllers_29_0= ruleController ) ) (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )* otherlv_32= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHouseBuilderV2.g:372:4: otherlv_27= 'controllers' otherlv_28= '{' ( (lv_controllers_29_0= ruleController ) ) (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_27, grammarAccess.getHouseAccess().getControllersKeyword_15_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_28, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalHouseBuilderV2.g:380:4: ( (lv_controllers_29_0= ruleController ) )
                    // InternalHouseBuilderV2.g:381:5: (lv_controllers_29_0= ruleController )
                    {
                    // InternalHouseBuilderV2.g:381:5: (lv_controllers_29_0= ruleController )
                    // InternalHouseBuilderV2.g:382:6: lv_controllers_29_0= ruleController
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_controllers_29_0=ruleController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						add(
                    							current,
                    							"controllers",
                    							lv_controllers_29_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Controller");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:399:4: (otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:400:5: otherlv_30= ',' ( (lv_controllers_31_0= ruleController ) )
                    	    {
                    	    otherlv_30=(Token)match(input,20,FOLLOW_18); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getHouseAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:404:5: ( (lv_controllers_31_0= ruleController ) )
                    	    // InternalHouseBuilderV2.g:405:6: (lv_controllers_31_0= ruleController )
                    	    {
                    	    // InternalHouseBuilderV2.g:405:6: (lv_controllers_31_0= ruleController )
                    	    // InternalHouseBuilderV2.g:406:7: lv_controllers_31_0= ruleController
                    	    {

                    	    							newCompositeNode(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_controllers_31_0=ruleController();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHouseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controllers",
                    	    								lv_controllers_31_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Controller");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_32, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_33=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_33, grammarAccess.getHouseAccess().getEntrancesKeyword_16());
            		
            otherlv_34=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_34, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_17());
            		
            // InternalHouseBuilderV2.g:437:3: ( (lv_entrances_35_0= ruleEntrance ) )
            // InternalHouseBuilderV2.g:438:4: (lv_entrances_35_0= ruleEntrance )
            {
            // InternalHouseBuilderV2.g:438:4: (lv_entrances_35_0= ruleEntrance )
            // InternalHouseBuilderV2.g:439:5: lv_entrances_35_0= ruleEntrance
            {

            					newCompositeNode(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_14);
            lv_entrances_35_0=ruleEntrance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHouseRule());
            					}
            					add(
            						current,
            						"entrances",
            						lv_entrances_35_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Entrance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:456:3: (otherlv_36= ',' ( (lv_entrances_37_0= ruleEntrance ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:457:4: otherlv_36= ',' ( (lv_entrances_37_0= ruleEntrance ) )
            	    {
            	    otherlv_36=(Token)match(input,20,FOLLOW_20); 

            	    				newLeafNode(otherlv_36, grammarAccess.getHouseAccess().getCommaKeyword_19_0());
            	    			
            	    // InternalHouseBuilderV2.g:461:4: ( (lv_entrances_37_0= ruleEntrance ) )
            	    // InternalHouseBuilderV2.g:462:5: (lv_entrances_37_0= ruleEntrance )
            	    {
            	    // InternalHouseBuilderV2.g:462:5: (lv_entrances_37_0= ruleEntrance )
            	    // InternalHouseBuilderV2.g:463:6: lv_entrances_37_0= ruleEntrance
            	    {

            	    						newCompositeNode(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_19_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_entrances_37_0=ruleEntrance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHouseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entrances",
            	    							lv_entrances_37_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Entrance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_38=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_38, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_20());
            		
            otherlv_39=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHouse"


    // $ANTLR start "entryRuleSpace"
    // InternalHouseBuilderV2.g:493:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalHouseBuilderV2.g:493:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalHouseBuilderV2.g:494:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalHouseBuilderV2.g:500:1: ruleSpace returns [EObject current=null] : (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;

        EObject this_ExternalSpace_1 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:506:2: ( (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace ) )
            // InternalHouseBuilderV2.g:507:2: (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace )
            {
            // InternalHouseBuilderV2.g:507:2: (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==54) ) {
                alt13=1;
            }
            else if ( (LA13_0==60) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHouseBuilderV2.g:508:3: this_Room_0= ruleRoom
                    {

                    			newCompositeNode(grammarAccess.getSpaceAccess().getRoomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Room_0=ruleRoom();

                    state._fsp--;


                    			current = this_Room_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:517:3: this_ExternalSpace_1= ruleExternalSpace
                    {

                    			newCompositeNode(grammarAccess.getSpaceAccess().getExternalSpaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalSpace_1=ruleExternalSpace();

                    state._fsp--;


                    			current = this_ExternalSpace_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleEString"
    // InternalHouseBuilderV2.g:529:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalHouseBuilderV2.g:529:47: (iv_ruleEString= ruleEString EOF )
            // InternalHouseBuilderV2.g:530:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalHouseBuilderV2.g:536:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:542:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalHouseBuilderV2.g:543:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalHouseBuilderV2.g:543:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHouseBuilderV2.g:544:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:552:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalHouseBuilderV2.g:563:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalHouseBuilderV2.g:563:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalHouseBuilderV2.g:564:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalHouseBuilderV2.g:570:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:576:2: (kw= 'EDate' )
            // InternalHouseBuilderV2.g:577:2: kw= 'EDate'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleFloor"
    // InternalHouseBuilderV2.g:585:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // InternalHouseBuilderV2.g:585:46: (iv_ruleFloor= ruleFloor EOF )
            // InternalHouseBuilderV2.g:586:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalHouseBuilderV2.g:592:1: ruleFloor returns [EObject current=null] : (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_level_4_0 = null;

        EObject lv_spaces_7_0 = null;

        EObject lv_spaces_9_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:598:2: ( (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalHouseBuilderV2.g:599:2: (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalHouseBuilderV2.g:599:2: (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalHouseBuilderV2.g:600:3: otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFloorAccess().getFloorKeyword_0());
            		
            // InternalHouseBuilderV2.g:604:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:605:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:605:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:606:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLevelKeyword_3());
            		
            // InternalHouseBuilderV2.g:631:3: ( (lv_level_4_0= ruleEInt ) )
            // InternalHouseBuilderV2.g:632:4: (lv_level_4_0= ruleEInt )
            {
            // InternalHouseBuilderV2.g:632:4: (lv_level_4_0= ruleEInt )
            // InternalHouseBuilderV2.g:633:5: lv_level_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFloorAccess().getLevelEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_level_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloorRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFloorAccess().getSpacesKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalHouseBuilderV2.g:658:3: ( (lv_spaces_7_0= ruleSpace ) )
            // InternalHouseBuilderV2.g:659:4: (lv_spaces_7_0= ruleSpace )
            {
            // InternalHouseBuilderV2.g:659:4: (lv_spaces_7_0= ruleSpace )
            // InternalHouseBuilderV2.g:660:5: lv_spaces_7_0= ruleSpace
            {

            					newCompositeNode(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_spaces_7_0=ruleSpace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloorRule());
            					}
            					add(
            						current,
            						"spaces",
            						lv_spaces_7_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Space");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:677:3: (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:678:4: otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_25); 

            	    				newLeafNode(otherlv_8, grammarAccess.getFloorAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalHouseBuilderV2.g:682:4: ( (lv_spaces_9_0= ruleSpace ) )
            	    // InternalHouseBuilderV2.g:683:5: (lv_spaces_9_0= ruleSpace )
            	    {
            	    // InternalHouseBuilderV2.g:683:5: (lv_spaces_9_0= ruleSpace )
            	    // InternalHouseBuilderV2.g:684:6: lv_spaces_9_0= ruleSpace
            	    {

            	    						newCompositeNode(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_spaces_9_0=ruleSpace();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"spaces",
            	    							lv_spaces_9_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Space");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRulePassage"
    // InternalHouseBuilderV2.g:714:1: entryRulePassage returns [EObject current=null] : iv_rulePassage= rulePassage EOF ;
    public final EObject entryRulePassage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassage = null;


        try {
            // InternalHouseBuilderV2.g:714:48: (iv_rulePassage= rulePassage EOF )
            // InternalHouseBuilderV2.g:715:2: iv_rulePassage= rulePassage EOF
            {
             newCompositeNode(grammarAccess.getPassageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassage=rulePassage();

            state._fsp--;

             current =iv_rulePassage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassage"


    // $ANTLR start "rulePassage"
    // InternalHouseBuilderV2.g:721:1: rulePassage returns [EObject current=null] : (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject rulePassage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_doorType_4_0 = null;

        AntlrDatatypeRuleToken lv_doorsNumber_6_0 = null;

        AntlrDatatypeRuleToken lv_width_8_0 = null;

        AntlrDatatypeRuleToken lv_height_10_0 = null;

        EObject lv_devices_17_0 = null;

        EObject lv_devices_19_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:727:2: ( (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalHouseBuilderV2.g:728:2: (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalHouseBuilderV2.g:728:2: (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalHouseBuilderV2.g:729:3: otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPassageAccess().getPassageKeyword_0());
            		
            // InternalHouseBuilderV2.g:733:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:734:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:734:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:735:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPassageAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getPassageAccess().getDoorTypeKeyword_3());
            		
            // InternalHouseBuilderV2.g:760:3: ( (lv_doorType_4_0= ruleDoorType ) )
            // InternalHouseBuilderV2.g:761:4: (lv_doorType_4_0= ruleDoorType )
            {
            // InternalHouseBuilderV2.g:761:4: (lv_doorType_4_0= ruleDoorType )
            // InternalHouseBuilderV2.g:762:5: lv_doorType_4_0= ruleDoorType
            {

            					newCompositeNode(grammarAccess.getPassageAccess().getDoorTypeDoorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_doorType_4_0=ruleDoorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassageRule());
            					}
            					set(
            						current,
            						"doorType",
            						lv_doorType_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.DoorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getPassageAccess().getDoorsNumberKeyword_5());
            		
            // InternalHouseBuilderV2.g:783:3: ( (lv_doorsNumber_6_0= ruleEInt ) )
            // InternalHouseBuilderV2.g:784:4: (lv_doorsNumber_6_0= ruleEInt )
            {
            // InternalHouseBuilderV2.g:784:4: (lv_doorsNumber_6_0= ruleEInt )
            // InternalHouseBuilderV2.g:785:5: lv_doorsNumber_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPassageAccess().getDoorsNumberEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_doorsNumber_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassageRule());
            					}
            					set(
            						current,
            						"doorsNumber",
            						lv_doorsNumber_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_7, grammarAccess.getPassageAccess().getWidthKeyword_7());
            		
            // InternalHouseBuilderV2.g:806:3: ( (lv_width_8_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:807:4: (lv_width_8_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:807:4: (lv_width_8_0= ruleEFloat )
            // InternalHouseBuilderV2.g:808:5: lv_width_8_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getPassageAccess().getWidthEFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_31);
            lv_width_8_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassageRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_8_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_9, grammarAccess.getPassageAccess().getHeightKeyword_9());
            		
            // InternalHouseBuilderV2.g:829:3: ( (lv_height_10_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:830:4: (lv_height_10_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:830:4: (lv_height_10_0= ruleEFloat )
            // InternalHouseBuilderV2.g:831:5: lv_height_10_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getPassageAccess().getHeightEFloatParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_32);
            lv_height_10_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassageRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_10_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getPassageAccess().getSpaceAKeyword_11());
            		
            // InternalHouseBuilderV2.g:852:3: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:853:4: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:853:4: ( ruleEString )
            // InternalHouseBuilderV2.g:854:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPassageAccess().getSpaceASpaceCrossReference_12_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getPassageAccess().getSpaceBKeyword_13());
            		
            // InternalHouseBuilderV2.g:872:3: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:873:4: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:873:4: ( ruleEString )
            // InternalHouseBuilderV2.g:874:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPassageAccess().getSpaceBSpaceCrossReference_14_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:888:3: (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHouseBuilderV2.g:889:4: otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getPassageAccess().getDevicesKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_16, grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalHouseBuilderV2.g:897:4: ( (lv_devices_17_0= ruleDevice ) )
                    // InternalHouseBuilderV2.g:898:5: (lv_devices_17_0= ruleDevice )
                    {
                    // InternalHouseBuilderV2.g:898:5: (lv_devices_17_0= ruleDevice )
                    // InternalHouseBuilderV2.g:899:6: lv_devices_17_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_17_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPassageRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_17_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:916:4: (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==20) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:917:5: otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getPassageAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:921:5: ( (lv_devices_19_0= ruleDevice ) )
                    	    // InternalHouseBuilderV2.g:922:6: (lv_devices_19_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilderV2.g:922:6: (lv_devices_19_0= ruleDevice )
                    	    // InternalHouseBuilderV2.g:923:7: lv_devices_19_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_19_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPassageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_19_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassage"


    // $ANTLR start "entryRuleController"
    // InternalHouseBuilderV2.g:954:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalHouseBuilderV2.g:954:51: (iv_ruleController= ruleController EOF )
            // InternalHouseBuilderV2.g:955:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalHouseBuilderV2.g:961:1: ruleController returns [EObject current=null] : (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_model_4_0 = null;

        AntlrDatatypeRuleToken lv_os_6_0 = null;

        AntlrDatatypeRuleToken lv_osVersion_8_0 = null;

        EObject lv_actuators_11_0 = null;

        EObject lv_actuators_13_0 = null;

        EObject lv_sensors_17_0 = null;

        EObject lv_sensors_19_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:967:2: ( (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' ) )
            // InternalHouseBuilderV2.g:968:2: (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' )
            {
            // InternalHouseBuilderV2.g:968:2: (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' )
            // InternalHouseBuilderV2.g:969:3: otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalHouseBuilderV2.g:973:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:974:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:974:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:975:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getModelKeyword_3());
            		
            // InternalHouseBuilderV2.g:1000:3: ( (lv_model_4_0= ruleEString ) )
            // InternalHouseBuilderV2.g:1001:4: (lv_model_4_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:1001:4: (lv_model_4_0= ruleEString )
            // InternalHouseBuilderV2.g:1002:5: lv_model_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getModelEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_model_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:1019:3: (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHouseBuilderV2.g:1020:4: otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getOsKeyword_5_0());
                    			
                    // InternalHouseBuilderV2.g:1024:4: ( (lv_os_6_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:1025:5: (lv_os_6_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:1025:5: (lv_os_6_0= ruleEString )
                    // InternalHouseBuilderV2.g:1026:6: lv_os_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getOsEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_os_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"os",
                    							lv_os_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:1044:3: (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHouseBuilderV2.g:1045:4: otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getOsVersionKeyword_6_0());
                    			
                    // InternalHouseBuilderV2.g:1049:4: ( (lv_osVersion_8_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:1050:5: (lv_osVersion_8_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:1050:5: (lv_osVersion_8_0= ruleEString )
                    // InternalHouseBuilderV2.g:1051:6: lv_osVersion_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getOsVersionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_osVersion_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"osVersion",
                    							lv_osVersion_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getActuatorsKeyword_7());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalHouseBuilderV2.g:1077:3: ( (lv_actuators_11_0= ruleActuator ) )
            // InternalHouseBuilderV2.g:1078:4: (lv_actuators_11_0= ruleActuator )
            {
            // InternalHouseBuilderV2.g:1078:4: (lv_actuators_11_0= ruleActuator )
            // InternalHouseBuilderV2.g:1079:5: lv_actuators_11_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_actuators_11_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_11_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:1096:3: (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:1097:4: otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FOLLOW_40); 

            	    				newLeafNode(otherlv_12, grammarAccess.getControllerAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalHouseBuilderV2.g:1101:4: ( (lv_actuators_13_0= ruleActuator ) )
            	    // InternalHouseBuilderV2.g:1102:5: (lv_actuators_13_0= ruleActuator )
            	    {
            	    // InternalHouseBuilderV2.g:1102:5: (lv_actuators_13_0= ruleActuator )
            	    // InternalHouseBuilderV2.g:1103:6: lv_actuators_13_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_actuators_13_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_13_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_14=(Token)match(input,21,FOLLOW_41); 

            			newLeafNode(otherlv_14, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_15=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getControllerAccess().getSensorsKeyword_12());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_16, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalHouseBuilderV2.g:1133:3: ( (lv_sensors_17_0= ruleSensor ) )
            // InternalHouseBuilderV2.g:1134:4: (lv_sensors_17_0= ruleSensor )
            {
            // InternalHouseBuilderV2.g:1134:4: (lv_sensors_17_0= ruleSensor )
            // InternalHouseBuilderV2.g:1135:5: lv_sensors_17_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_14);
            lv_sensors_17_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					add(
            						current,
            						"sensors",
            						lv_sensors_17_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:1152:3: (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHouseBuilderV2.g:1153:4: otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) )
            	    {
            	    otherlv_18=(Token)match(input,20,FOLLOW_42); 

            	    				newLeafNode(otherlv_18, grammarAccess.getControllerAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalHouseBuilderV2.g:1157:4: ( (lv_sensors_19_0= ruleSensor ) )
            	    // InternalHouseBuilderV2.g:1158:5: (lv_sensors_19_0= ruleSensor )
            	    {
            	    // InternalHouseBuilderV2.g:1158:5: (lv_sensors_19_0= ruleSensor )
            	    // InternalHouseBuilderV2.g:1159:6: lv_sensors_19_0= ruleSensor
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_sensors_19_0=ruleSensor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensors",
            	    							lv_sensors_19_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Sensor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_20=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_20, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_21=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleEntrance"
    // InternalHouseBuilderV2.g:1189:1: entryRuleEntrance returns [EObject current=null] : iv_ruleEntrance= ruleEntrance EOF ;
    public final EObject entryRuleEntrance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrance = null;


        try {
            // InternalHouseBuilderV2.g:1189:49: (iv_ruleEntrance= ruleEntrance EOF )
            // InternalHouseBuilderV2.g:1190:2: iv_ruleEntrance= ruleEntrance EOF
            {
             newCompositeNode(grammarAccess.getEntranceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntrance=ruleEntrance();

            state._fsp--;

             current =iv_ruleEntrance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntrance"


    // $ANTLR start "ruleEntrance"
    // InternalHouseBuilderV2.g:1196:1: ruleEntrance returns [EObject current=null] : (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleEntrance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_doorType_4_0 = null;

        AntlrDatatypeRuleToken lv_doorsNumber_6_0 = null;

        AntlrDatatypeRuleToken lv_width_8_0 = null;

        AntlrDatatypeRuleToken lv_height_10_0 = null;

        EObject lv_devices_15_0 = null;

        EObject lv_devices_17_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:1202:2: ( (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalHouseBuilderV2.g:1203:2: (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalHouseBuilderV2.g:1203:2: (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalHouseBuilderV2.g:1204:3: otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) otherlv_7= 'width' ( (lv_width_8_0= ruleEFloat ) ) otherlv_9= 'height' ( (lv_height_10_0= ruleEFloat ) ) otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntranceAccess().getEntranceKeyword_0());
            		
            // InternalHouseBuilderV2.g:1208:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:1209:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:1209:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:1210:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntranceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntranceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getEntranceAccess().getDoorTypeKeyword_3());
            		
            // InternalHouseBuilderV2.g:1235:3: ( (lv_doorType_4_0= ruleDoorType ) )
            // InternalHouseBuilderV2.g:1236:4: (lv_doorType_4_0= ruleDoorType )
            {
            // InternalHouseBuilderV2.g:1236:4: (lv_doorType_4_0= ruleDoorType )
            // InternalHouseBuilderV2.g:1237:5: lv_doorType_4_0= ruleDoorType
            {

            					newCompositeNode(grammarAccess.getEntranceAccess().getDoorTypeDoorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_doorType_4_0=ruleDoorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntranceRule());
            					}
            					set(
            						current,
            						"doorType",
            						lv_doorType_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.DoorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getEntranceAccess().getDoorsNumberKeyword_5());
            		
            // InternalHouseBuilderV2.g:1258:3: ( (lv_doorsNumber_6_0= ruleEInt ) )
            // InternalHouseBuilderV2.g:1259:4: (lv_doorsNumber_6_0= ruleEInt )
            {
            // InternalHouseBuilderV2.g:1259:4: (lv_doorsNumber_6_0= ruleEInt )
            // InternalHouseBuilderV2.g:1260:5: lv_doorsNumber_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEntranceAccess().getDoorsNumberEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_doorsNumber_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntranceRule());
            					}
            					set(
            						current,
            						"doorsNumber",
            						lv_doorsNumber_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_7, grammarAccess.getEntranceAccess().getWidthKeyword_7());
            		
            // InternalHouseBuilderV2.g:1281:3: ( (lv_width_8_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:1282:4: (lv_width_8_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:1282:4: (lv_width_8_0= ruleEFloat )
            // InternalHouseBuilderV2.g:1283:5: lv_width_8_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getEntranceAccess().getWidthEFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_31);
            lv_width_8_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntranceRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_8_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_9, grammarAccess.getEntranceAccess().getHeightKeyword_9());
            		
            // InternalHouseBuilderV2.g:1304:3: ( (lv_height_10_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:1305:4: (lv_height_10_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:1305:4: (lv_height_10_0= ruleEFloat )
            // InternalHouseBuilderV2.g:1306:5: lv_height_10_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getEntranceAccess().getHeightEFloatParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_43);
            lv_height_10_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntranceRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_10_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getEntranceAccess().getSpaceKeyword_11());
            		
            // InternalHouseBuilderV2.g:1327:3: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:1328:4: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:1328:4: ( ruleEString )
            // InternalHouseBuilderV2.g:1329:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntranceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntranceAccess().getSpaceSpaceCrossReference_12_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:1343:3: (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalHouseBuilderV2.g:1344:4: otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntranceAccess().getDevicesKeyword_13_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalHouseBuilderV2.g:1352:4: ( (lv_devices_15_0= ruleDevice ) )
                    // InternalHouseBuilderV2.g:1353:5: (lv_devices_15_0= ruleDevice )
                    {
                    // InternalHouseBuilderV2.g:1353:5: (lv_devices_15_0= ruleDevice )
                    // InternalHouseBuilderV2.g:1354:6: lv_devices_15_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_15_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntranceRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_15_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:1371:4: (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==20) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:1372:5: otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) )
                    	    {
                    	    otherlv_16=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getEntranceAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:1376:5: ( (lv_devices_17_0= ruleDevice ) )
                    	    // InternalHouseBuilderV2.g:1377:6: (lv_devices_17_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilderV2.g:1377:6: (lv_devices_17_0= ruleDevice )
                    	    // InternalHouseBuilderV2.g:1378:7: lv_devices_17_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_17_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntranceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_17_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_18, grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntrance"


    // $ANTLR start "entryRuleEInt"
    // InternalHouseBuilderV2.g:1409:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalHouseBuilderV2.g:1409:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalHouseBuilderV2.g:1410:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalHouseBuilderV2.g:1416:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:1422:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalHouseBuilderV2.g:1423:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalHouseBuilderV2.g:1423:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalHouseBuilderV2.g:1424:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalHouseBuilderV2.g:1424:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHouseBuilderV2.g:1425:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_44); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalHouseBuilderV2.g:1442:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalHouseBuilderV2.g:1442:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalHouseBuilderV2.g:1443:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalHouseBuilderV2.g:1449:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:1455:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalHouseBuilderV2.g:1456:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalHouseBuilderV2.g:1456:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalHouseBuilderV2.g:1457:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalHouseBuilderV2.g:1457:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalHouseBuilderV2.g:1458:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalHouseBuilderV2.g:1464:3: (this_INT_1= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHouseBuilderV2.g:1465:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_46); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,46,FOLLOW_44); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_47); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalHouseBuilderV2.g:1485:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=47 && LA29_0<=48)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalHouseBuilderV2.g:1486:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalHouseBuilderV2.g:1486:4: (kw= 'E' | kw= 'e' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==47) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==48) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalHouseBuilderV2.g:1487:5: kw= 'E'
                            {
                            kw=(Token)match(input,47,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalHouseBuilderV2.g:1493:5: kw= 'e'
                            {
                            kw=(Token)match(input,48,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalHouseBuilderV2.g:1499:4: (kw= '-' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==45) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalHouseBuilderV2.g:1500:5: kw= '-'
                            {
                            kw=(Token)match(input,45,FOLLOW_44); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleDevice"
    // InternalHouseBuilderV2.g:1518:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalHouseBuilderV2.g:1518:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalHouseBuilderV2.g:1519:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalHouseBuilderV2.g:1525:1: ruleDevice returns [EObject current=null] : ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? (otherlv_8= 'actuator' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_model_7_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:1531:2: ( ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? (otherlv_8= 'actuator' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalHouseBuilderV2.g:1532:2: ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? (otherlv_8= 'actuator' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalHouseBuilderV2.g:1532:2: ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? (otherlv_8= 'actuator' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // InternalHouseBuilderV2.g:1533:3: () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? (otherlv_8= 'actuator' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalHouseBuilderV2.g:1533:3: ()
            // InternalHouseBuilderV2.g:1534:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceAccess().getDeviceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getDeviceKeyword_1());
            		
            // InternalHouseBuilderV2.g:1544:3: ( (lv_name_2_0= ruleEString ) )
            // InternalHouseBuilderV2.g:1545:4: (lv_name_2_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:1545:4: (lv_name_2_0= ruleEString )
            // InternalHouseBuilderV2.g:1546:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalHouseBuilderV2.g:1567:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHouseBuilderV2.g:1568:4: otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_49); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getTypeKeyword_4_0());
                    			
                    // InternalHouseBuilderV2.g:1572:4: ( (lv_type_5_0= ruleDeviceType ) )
                    // InternalHouseBuilderV2.g:1573:5: (lv_type_5_0= ruleDeviceType )
                    {
                    // InternalHouseBuilderV2.g:1573:5: (lv_type_5_0= ruleDeviceType )
                    // InternalHouseBuilderV2.g:1574:6: lv_type_5_0= ruleDeviceType
                    {

                    						newCompositeNode(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_type_5_0=ruleDeviceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.DeviceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:1592:3: (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalHouseBuilderV2.g:1593:4: otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getModelKeyword_5_0());
                    			
                    // InternalHouseBuilderV2.g:1597:4: ( (lv_model_7_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:1598:5: (lv_model_7_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:1598:5: (lv_model_7_0= ruleEString )
                    // InternalHouseBuilderV2.g:1599:6: lv_model_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeviceAccess().getModelEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_model_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_7_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:1617:3: (otherlv_8= 'actuator' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalHouseBuilderV2.g:1618:4: otherlv_8= 'actuator' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getActuatorKeyword_6_0());
                    			
                    // InternalHouseBuilderV2.g:1622:4: ( ( ruleEString ) )
                    // InternalHouseBuilderV2.g:1623:5: ( ruleEString )
                    {
                    // InternalHouseBuilderV2.g:1623:5: ( ruleEString )
                    // InternalHouseBuilderV2.g:1624:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeviceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDeviceAccess().getActuatorActuatorCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleSensor"
    // InternalHouseBuilderV2.g:1647:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalHouseBuilderV2.g:1647:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalHouseBuilderV2.g:1648:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalHouseBuilderV2.g:1654:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_model_8_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:1660:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalHouseBuilderV2.g:1661:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalHouseBuilderV2.g:1661:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalHouseBuilderV2.g:1662:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalHouseBuilderV2.g:1666:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:1667:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:1667:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:1668:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3());
            		
            // InternalHouseBuilderV2.g:1693:3: ( (lv_type_4_0= ruleSensorType ) )
            // InternalHouseBuilderV2.g:1694:4: (lv_type_4_0= ruleSensorType )
            {
            // InternalHouseBuilderV2.g:1694:4: (lv_type_4_0= ruleSensorType )
            // InternalHouseBuilderV2.g:1695:5: lv_type_4_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_54);
            lv_type_4_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,53,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getValueKeyword_5());
            		
            // InternalHouseBuilderV2.g:1716:3: ( (lv_value_6_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:1717:4: (lv_value_6_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:1717:4: (lv_value_6_0= ruleEFloat )
            // InternalHouseBuilderV2.g:1718:5: lv_value_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getValueEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_55);
            lv_value_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:1735:3: (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalHouseBuilderV2.g:1736:4: otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getModelKeyword_7_0());
                    			
                    // InternalHouseBuilderV2.g:1740:4: ( (lv_model_8_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:1741:5: (lv_model_8_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:1741:5: (lv_model_8_0= ruleEString )
                    // InternalHouseBuilderV2.g:1742:6: lv_model_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getModelEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_model_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getSpaceKeyword_8());
            		
            // InternalHouseBuilderV2.g:1764:3: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:1765:4: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:1765:4: ( ruleEString )
            // InternalHouseBuilderV2.g:1766:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensorAccess().getSpaceSpaceCrossReference_9_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleRoom"
    // InternalHouseBuilderV2.g:1788:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalHouseBuilderV2.g:1788:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalHouseBuilderV2.g:1789:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalHouseBuilderV2.g:1795:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? (otherlv_29= 'windows' otherlv_30= '{' ( (lv_windows_31_0= ruleWindow ) ) (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        AntlrDatatypeRuleToken lv_height_8_0 = null;

        Enumerator lv_roomType_10_0 = null;

        EObject lv_devices_25_0 = null;

        EObject lv_devices_27_0 = null;

        EObject lv_windows_31_0 = null;

        EObject lv_windows_33_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:1801:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? (otherlv_29= 'windows' otherlv_30= '{' ( (lv_windows_31_0= ruleWindow ) ) (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) )
            // InternalHouseBuilderV2.g:1802:2: (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? (otherlv_29= 'windows' otherlv_30= '{' ( (lv_windows_31_0= ruleWindow ) ) (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            {
            // InternalHouseBuilderV2.g:1802:2: (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? (otherlv_29= 'windows' otherlv_30= '{' ( (lv_windows_31_0= ruleWindow ) ) (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            // InternalHouseBuilderV2.g:1803:3: otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? (otherlv_29= 'windows' otherlv_30= '{' ( (lv_windows_31_0= ruleWindow ) ) (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )* otherlv_34= '}' )? otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalHouseBuilderV2.g:1807:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:1808:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:1808:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:1809:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLengthKeyword_3());
            		
            // InternalHouseBuilderV2.g:1834:3: ( (lv_length_4_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:1835:4: (lv_length_4_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:1835:4: (lv_length_4_0= ruleEFloat )
            // InternalHouseBuilderV2.g:1836:5: lv_length_4_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getLengthEFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_length_4_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getWidthKeyword_5());
            		
            // InternalHouseBuilderV2.g:1857:3: ( (lv_width_6_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:1858:4: (lv_width_6_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:1858:4: (lv_width_6_0= ruleEFloat )
            // InternalHouseBuilderV2.g:1859:5: lv_width_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getWidthEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
            lv_width_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getHeightKeyword_7());
            		
            // InternalHouseBuilderV2.g:1880:3: ( (lv_height_8_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:1881:4: (lv_height_8_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:1881:4: (lv_height_8_0= ruleEFloat )
            // InternalHouseBuilderV2.g:1882:5: lv_height_8_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getHeightEFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_57);
            lv_height_8_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_8_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:1899:3: (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==56) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalHouseBuilderV2.g:1900:4: otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) )
                    {
                    otherlv_9=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoomAccess().getRoomTypeKeyword_9_0());
                    			
                    // InternalHouseBuilderV2.g:1904:4: ( (lv_roomType_10_0= ruleRoomType ) )
                    // InternalHouseBuilderV2.g:1905:5: (lv_roomType_10_0= ruleRoomType )
                    {
                    // InternalHouseBuilderV2.g:1905:5: (lv_roomType_10_0= ruleRoomType )
                    // InternalHouseBuilderV2.g:1906:6: lv_roomType_10_0= ruleRoomType
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getRoomTypeRoomTypeEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_roomType_10_0=ruleRoomType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						set(
                    							current,
                    							"roomType",
                    							lv_roomType_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.RoomType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:1924:3: (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalHouseBuilderV2.g:1925:4: otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getRoomAccess().getSensorsKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRoomAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalHouseBuilderV2.g:1933:4: ( ( ruleEString ) )
                    // InternalHouseBuilderV2.g:1934:5: ( ruleEString )
                    {
                    // InternalHouseBuilderV2.g:1934:5: ( ruleEString )
                    // InternalHouseBuilderV2.g:1935:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoomRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:1949:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==20) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:1950:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRoomAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:1954:5: ( ( ruleEString ) )
                    	    // InternalHouseBuilderV2.g:1955:6: ( ruleEString )
                    	    {
                    	    // InternalHouseBuilderV2.g:1955:6: ( ruleEString )
                    	    // InternalHouseBuilderV2.g:1956:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoomRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,58,FOLLOW_62); 

                    				newLeafNode(otherlv_16, grammarAccess.getRoomAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilderV2.g:1976:3: (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalHouseBuilderV2.g:1977:4: otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_60); 

                    				newLeafNode(otherlv_17, grammarAccess.getRoomAccess().getEntrancesKeyword_11_0());
                    			
                    otherlv_18=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getRoomAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalHouseBuilderV2.g:1985:4: ( ( ruleEString ) )
                    // InternalHouseBuilderV2.g:1986:5: ( ruleEString )
                    {
                    // InternalHouseBuilderV2.g:1986:5: ( ruleEString )
                    // InternalHouseBuilderV2.g:1987:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoomRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRoomAccess().getEntrancesEntranceCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:2001:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==20) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:2002:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getRoomAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:2006:5: ( ( ruleEString ) )
                    	    // InternalHouseBuilderV2.g:2007:6: ( ruleEString )
                    	    {
                    	    // InternalHouseBuilderV2.g:2007:6: ( ruleEString )
                    	    // InternalHouseBuilderV2.g:2008:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRoomRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getEntrancesEntranceCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,58,FOLLOW_63); 

                    				newLeafNode(otherlv_22, grammarAccess.getRoomAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilderV2.g:2028:3: (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHouseBuilderV2.g:2029:4: otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getRoomAccess().getDevicesKeyword_12_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_24, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalHouseBuilderV2.g:2037:4: ( (lv_devices_25_0= ruleDevice ) )
                    // InternalHouseBuilderV2.g:2038:5: (lv_devices_25_0= ruleDevice )
                    {
                    // InternalHouseBuilderV2.g:2038:5: (lv_devices_25_0= ruleDevice )
                    // InternalHouseBuilderV2.g:2039:6: lv_devices_25_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_25_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_25_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:2056:4: (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:2057:5: otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) )
                    	    {
                    	    otherlv_26=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getRoomAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:2061:5: ( (lv_devices_27_0= ruleDevice ) )
                    	    // InternalHouseBuilderV2.g:2062:6: (lv_devices_27_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilderV2.g:2062:6: (lv_devices_27_0= ruleDevice )
                    	    // InternalHouseBuilderV2.g:2063:7: lv_devices_27_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_27_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_27_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FOLLOW_64); 

                    				newLeafNode(otherlv_28, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilderV2.g:2086:3: (otherlv_29= 'windows' otherlv_30= '{' ( (lv_windows_31_0= ruleWindow ) ) (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )* otherlv_34= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalHouseBuilderV2.g:2087:4: otherlv_29= 'windows' otherlv_30= '{' ( (lv_windows_31_0= ruleWindow ) ) (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_29, grammarAccess.getRoomAccess().getWindowsKeyword_13_0());
                    			
                    otherlv_30=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_30, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalHouseBuilderV2.g:2095:4: ( (lv_windows_31_0= ruleWindow ) )
                    // InternalHouseBuilderV2.g:2096:5: (lv_windows_31_0= ruleWindow )
                    {
                    // InternalHouseBuilderV2.g:2096:5: (lv_windows_31_0= ruleWindow )
                    // InternalHouseBuilderV2.g:2097:6: lv_windows_31_0= ruleWindow
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_windows_31_0=ruleWindow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"windows",
                    							lv_windows_31_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Window");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:2114:4: (otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:2115:5: otherlv_32= ',' ( (lv_windows_33_0= ruleWindow ) )
                    	    {
                    	    otherlv_32=(Token)match(input,20,FOLLOW_65); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getRoomAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:2119:5: ( (lv_windows_33_0= ruleWindow ) )
                    	    // InternalHouseBuilderV2.g:2120:6: (lv_windows_33_0= ruleWindow )
                    	    {
                    	    // InternalHouseBuilderV2.g:2120:6: (lv_windows_33_0= ruleWindow )
                    	    // InternalHouseBuilderV2.g:2121:7: lv_windows_33_0= ruleWindow
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_windows_33_0=ruleWindow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"windows",
                    	    								lv_windows_33_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Window");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_34, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_35=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleExternalSpace"
    // InternalHouseBuilderV2.g:2152:1: entryRuleExternalSpace returns [EObject current=null] : iv_ruleExternalSpace= ruleExternalSpace EOF ;
    public final EObject entryRuleExternalSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSpace = null;


        try {
            // InternalHouseBuilderV2.g:2152:54: (iv_ruleExternalSpace= ruleExternalSpace EOF )
            // InternalHouseBuilderV2.g:2153:2: iv_ruleExternalSpace= ruleExternalSpace EOF
            {
             newCompositeNode(grammarAccess.getExternalSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalSpace=ruleExternalSpace();

            state._fsp--;

             current =iv_ruleExternalSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalSpace"


    // $ANTLR start "ruleExternalSpace"
    // InternalHouseBuilderV2.g:2159:1: ruleExternalSpace returns [EObject current=null] : (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleOuterSpaceType ) ) )? (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleExternalSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        Enumerator lv_type_8_0 = null;

        Enumerator lv_ground_10_0 = null;

        EObject lv_devices_25_0 = null;

        EObject lv_devices_27_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:2165:2: ( (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleOuterSpaceType ) ) )? (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalHouseBuilderV2.g:2166:2: (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleOuterSpaceType ) ) )? (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalHouseBuilderV2.g:2166:2: (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleOuterSpaceType ) ) )? (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalHouseBuilderV2.g:2167:3: otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'type' ( (lv_type_8_0= ruleOuterSpaceType ) ) )? (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalSpaceAccess().getExternalSpaceKeyword_0());
            		
            // InternalHouseBuilderV2.g:2171:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:2172:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:2172:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:2173:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalSpaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalSpaceAccess().getLengthKeyword_3());
            		
            // InternalHouseBuilderV2.g:2198:3: ( (lv_length_4_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:2199:4: (lv_length_4_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:2199:4: (lv_length_4_0= ruleEFloat )
            // InternalHouseBuilderV2.g:2200:5: lv_length_4_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getExternalSpaceAccess().getLengthEFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_length_4_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalSpaceAccess().getWidthKeyword_5());
            		
            // InternalHouseBuilderV2.g:2221:3: ( (lv_width_6_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:2222:4: (lv_width_6_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:2222:4: (lv_width_6_0= ruleEFloat )
            // InternalHouseBuilderV2.g:2223:5: lv_width_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getExternalSpaceAccess().getWidthEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_66);
            lv_width_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:2240:3: (otherlv_7= 'type' ( (lv_type_8_0= ruleOuterSpaceType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalHouseBuilderV2.g:2241:4: otherlv_7= 'type' ( (lv_type_8_0= ruleOuterSpaceType ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_67); 

                    				newLeafNode(otherlv_7, grammarAccess.getExternalSpaceAccess().getTypeKeyword_7_0());
                    			
                    // InternalHouseBuilderV2.g:2245:4: ( (lv_type_8_0= ruleOuterSpaceType ) )
                    // InternalHouseBuilderV2.g:2246:5: (lv_type_8_0= ruleOuterSpaceType )
                    {
                    // InternalHouseBuilderV2.g:2246:5: (lv_type_8_0= ruleOuterSpaceType )
                    // InternalHouseBuilderV2.g:2247:6: lv_type_8_0= ruleOuterSpaceType
                    {

                    						newCompositeNode(grammarAccess.getExternalSpaceAccess().getTypeOuterSpaceTypeEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_type_8_0=ruleOuterSpaceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.OuterSpaceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:2265:3: (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalHouseBuilderV2.g:2266:4: otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) )
                    {
                    otherlv_9=(Token)match(input,61,FOLLOW_69); 

                    				newLeafNode(otherlv_9, grammarAccess.getExternalSpaceAccess().getGroundKeyword_8_0());
                    			
                    // InternalHouseBuilderV2.g:2270:4: ( (lv_ground_10_0= ruleGroundType ) )
                    // InternalHouseBuilderV2.g:2271:5: (lv_ground_10_0= ruleGroundType )
                    {
                    // InternalHouseBuilderV2.g:2271:5: (lv_ground_10_0= ruleGroundType )
                    // InternalHouseBuilderV2.g:2272:6: lv_ground_10_0= ruleGroundType
                    {

                    						newCompositeNode(grammarAccess.getExternalSpaceAccess().getGroundGroundTypeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_ground_10_0=ruleGroundType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
                    						}
                    						set(
                    							current,
                    							"ground",
                    							lv_ground_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.GroundType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilderV2.g:2290:3: (otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalHouseBuilderV2.g:2291:4: otherlv_11= 'sensors' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getExternalSpaceAccess().getSensorsKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalHouseBuilderV2.g:2299:4: ( ( ruleEString ) )
                    // InternalHouseBuilderV2.g:2300:5: ( ruleEString )
                    {
                    // InternalHouseBuilderV2.g:2300:5: ( ruleEString )
                    // InternalHouseBuilderV2.g:2301:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalSpaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalSpaceAccess().getSensorsSensorCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:2315:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==20) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:2316:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getExternalSpaceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:2320:5: ( ( ruleEString ) )
                    	    // InternalHouseBuilderV2.g:2321:6: ( ruleEString )
                    	    {
                    	    // InternalHouseBuilderV2.g:2321:6: ( ruleEString )
                    	    // InternalHouseBuilderV2.g:2322:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExternalSpaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExternalSpaceAccess().getSensorsSensorCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,58,FOLLOW_71); 

                    				newLeafNode(otherlv_16, grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilderV2.g:2342:3: (otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalHouseBuilderV2.g:2343:4: otherlv_17= 'entrances' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_60); 

                    				newLeafNode(otherlv_17, grammarAccess.getExternalSpaceAccess().getEntrancesKeyword_10_0());
                    			
                    otherlv_18=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getExternalSpaceAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalHouseBuilderV2.g:2351:4: ( ( ruleEString ) )
                    // InternalHouseBuilderV2.g:2352:5: ( ruleEString )
                    {
                    // InternalHouseBuilderV2.g:2352:5: ( ruleEString )
                    // InternalHouseBuilderV2.g:2353:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalSpaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:2367:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==20) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:2368:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getExternalSpaceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:2372:5: ( ( ruleEString ) )
                    	    // InternalHouseBuilderV2.g:2373:6: ( ruleEString )
                    	    {
                    	    // InternalHouseBuilderV2.g:2373:6: ( ruleEString )
                    	    // InternalHouseBuilderV2.g:2374:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExternalSpaceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getExternalSpaceAccess().getEntrancesEntranceCrossReference_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,58,FOLLOW_34); 

                    				newLeafNode(otherlv_22, grammarAccess.getExternalSpaceAccess().getRightParenthesisKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilderV2.g:2394:3: (otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalHouseBuilderV2.g:2395:4: otherlv_23= 'devices' otherlv_24= '{' ( (lv_devices_25_0= ruleDevice ) ) (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getExternalSpaceAccess().getDevicesKeyword_11_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_24, grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalHouseBuilderV2.g:2403:4: ( (lv_devices_25_0= ruleDevice ) )
                    // InternalHouseBuilderV2.g:2404:5: (lv_devices_25_0= ruleDevice )
                    {
                    // InternalHouseBuilderV2.g:2404:5: (lv_devices_25_0= ruleDevice )
                    // InternalHouseBuilderV2.g:2405:6: lv_devices_25_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_25_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_25_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilderV2.g:2422:4: (otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==20) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalHouseBuilderV2.g:2423:5: otherlv_26= ',' ( (lv_devices_27_0= ruleDevice ) )
                    	    {
                    	    otherlv_26=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getExternalSpaceAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalHouseBuilderV2.g:2427:5: ( (lv_devices_27_0= ruleDevice ) )
                    	    // InternalHouseBuilderV2.g:2428:6: (lv_devices_27_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilderV2.g:2428:6: (lv_devices_27_0= ruleDevice )
                    	    // InternalHouseBuilderV2.g:2429:7: lv_devices_27_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_27_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_27_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_28, grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalSpace"


    // $ANTLR start "entryRuleActuator"
    // InternalHouseBuilderV2.g:2460:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalHouseBuilderV2.g:2460:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalHouseBuilderV2.g:2461:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalHouseBuilderV2.g:2467:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_model_6_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:2473:2: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalHouseBuilderV2.g:2474:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalHouseBuilderV2.g:2474:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalHouseBuilderV2.g:2475:3: otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalHouseBuilderV2.g:2479:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:2480:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:2480:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:2481:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getTypeKeyword_3());
            		
            // InternalHouseBuilderV2.g:2506:3: ( (lv_type_4_0= ruleActuatorType ) )
            // InternalHouseBuilderV2.g:2507:4: (lv_type_4_0= ruleActuatorType )
            {
            // InternalHouseBuilderV2.g:2507:4: (lv_type_4_0= ruleActuatorType )
            // InternalHouseBuilderV2.g:2508:5: lv_type_4_0= ruleActuatorType
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_73);
            lv_type_4_0=ruleActuatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.ActuatorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilderV2.g:2525:3: (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalHouseBuilderV2.g:2526:4: otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getModelKeyword_5_0());
                    			
                    // InternalHouseBuilderV2.g:2530:4: ( (lv_model_6_0= ruleEString ) )
                    // InternalHouseBuilderV2.g:2531:5: (lv_model_6_0= ruleEString )
                    {
                    // InternalHouseBuilderV2.g:2531:5: (lv_model_6_0= ruleEString )
                    // InternalHouseBuilderV2.g:2532:6: lv_model_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getModelEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_model_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getActuatorAccess().getDeviceKeyword_6());
            		
            // InternalHouseBuilderV2.g:2554:3: ( ( ruleEString ) )
            // InternalHouseBuilderV2.g:2555:4: ( ruleEString )
            {
            // InternalHouseBuilderV2.g:2555:4: ( ruleEString )
            // InternalHouseBuilderV2.g:2556:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActuatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActuatorAccess().getDeviceDeviceCrossReference_7_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleWindow"
    // InternalHouseBuilderV2.g:2578:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // InternalHouseBuilderV2.g:2578:47: (iv_ruleWindow= ruleWindow EOF )
            // InternalHouseBuilderV2.g:2579:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalHouseBuilderV2.g:2585:1: ruleWindow returns [EObject current=null] : (otherlv_0= 'Window' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorsNumber' ( (lv_doorsNumber_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= '}' ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_doorsNumber_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        AntlrDatatypeRuleToken lv_height_8_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilderV2.g:2591:2: ( (otherlv_0= 'Window' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorsNumber' ( (lv_doorsNumber_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= '}' ) )
            // InternalHouseBuilderV2.g:2592:2: (otherlv_0= 'Window' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorsNumber' ( (lv_doorsNumber_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= '}' )
            {
            // InternalHouseBuilderV2.g:2592:2: (otherlv_0= 'Window' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorsNumber' ( (lv_doorsNumber_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= '}' )
            // InternalHouseBuilderV2.g:2593:3: otherlv_0= 'Window' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'doorsNumber' ( (lv_doorsNumber_4_0= ruleEInt ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'height' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getWindowKeyword_0());
            		
            // InternalHouseBuilderV2.g:2597:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilderV2.g:2598:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilderV2.g:2598:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilderV2.g:2599:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getWindowAccess().getDoorsNumberKeyword_3());
            		
            // InternalHouseBuilderV2.g:2624:3: ( (lv_doorsNumber_4_0= ruleEInt ) )
            // InternalHouseBuilderV2.g:2625:4: (lv_doorsNumber_4_0= ruleEInt )
            {
            // InternalHouseBuilderV2.g:2625:4: (lv_doorsNumber_4_0= ruleEInt )
            // InternalHouseBuilderV2.g:2626:5: lv_doorsNumber_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getDoorsNumberEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_doorsNumber_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"doorsNumber",
            						lv_doorsNumber_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getWindowAccess().getWidthKeyword_5());
            		
            // InternalHouseBuilderV2.g:2647:3: ( (lv_width_6_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:2648:4: (lv_width_6_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:2648:4: (lv_width_6_0= ruleEFloat )
            // InternalHouseBuilderV2.g:2649:5: lv_width_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getWidthEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
            lv_width_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_7, grammarAccess.getWindowAccess().getHeightKeyword_7());
            		
            // InternalHouseBuilderV2.g:2670:3: ( (lv_height_8_0= ruleEFloat ) )
            // InternalHouseBuilderV2.g:2671:4: (lv_height_8_0= ruleEFloat )
            {
            // InternalHouseBuilderV2.g:2671:4: (lv_height_8_0= ruleEFloat )
            // InternalHouseBuilderV2.g:2672:5: lv_height_8_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getHeightEFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
            lv_height_8_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_8_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilderV2.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "ruleDeviceType"
    // InternalHouseBuilderV2.g:2697:1: ruleDeviceType returns [Enumerator current=null] : ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) ) ;
    public final Enumerator ruleDeviceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:2703:2: ( ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) ) )
            // InternalHouseBuilderV2.g:2704:2: ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) )
            {
            // InternalHouseBuilderV2.g:2704:2: ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt52=1;
                }
                break;
            case 66:
                {
                alt52=2;
                }
                break;
            case 67:
                {
                alt52=3;
                }
                break;
            case 68:
                {
                alt52=4;
                }
                break;
            case 69:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalHouseBuilderV2.g:2705:3: (enumLiteral_0= 'THERMOSTAT' )
                    {
                    // InternalHouseBuilderV2.g:2705:3: (enumLiteral_0= 'THERMOSTAT' )
                    // InternalHouseBuilderV2.g:2706:4: enumLiteral_0= 'THERMOSTAT'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:2713:3: (enumLiteral_1= 'APPLIANCE' )
                    {
                    // InternalHouseBuilderV2.g:2713:3: (enumLiteral_1= 'APPLIANCE' )
                    // InternalHouseBuilderV2.g:2714:4: enumLiteral_1= 'APPLIANCE'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:2721:3: (enumLiteral_2= 'SOCKET' )
                    {
                    // InternalHouseBuilderV2.g:2721:3: (enumLiteral_2= 'SOCKET' )
                    // InternalHouseBuilderV2.g:2722:4: enumLiteral_2= 'SOCKET'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:2729:3: (enumLiteral_3= 'ROLLER_SHUTTERS' )
                    {
                    // InternalHouseBuilderV2.g:2729:3: (enumLiteral_3= 'ROLLER_SHUTTERS' )
                    // InternalHouseBuilderV2.g:2730:4: enumLiteral_3= 'ROLLER_SHUTTERS'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:2737:3: (enumLiteral_4= 'GATE' )
                    {
                    // InternalHouseBuilderV2.g:2737:3: (enumLiteral_4= 'GATE' )
                    // InternalHouseBuilderV2.g:2738:4: enumLiteral_4= 'GATE'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "ruleActuatorType"
    // InternalHouseBuilderV2.g:2748:1: ruleActuatorType returns [Enumerator current=null] : ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) ) ;
    public final Enumerator ruleActuatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:2754:2: ( ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) ) )
            // InternalHouseBuilderV2.g:2755:2: ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) )
            {
            // InternalHouseBuilderV2.g:2755:2: ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt53=1;
                }
                break;
            case 71:
                {
                alt53=2;
                }
                break;
            case 72:
                {
                alt53=3;
                }
                break;
            case 73:
                {
                alt53=4;
                }
                break;
            case 74:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalHouseBuilderV2.g:2756:3: (enumLiteral_0= 'IDRAULIC' )
                    {
                    // InternalHouseBuilderV2.g:2756:3: (enumLiteral_0= 'IDRAULIC' )
                    // InternalHouseBuilderV2.g:2757:4: enumLiteral_0= 'IDRAULIC'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:2764:3: (enumLiteral_1= 'PNEUMATIC' )
                    {
                    // InternalHouseBuilderV2.g:2764:3: (enumLiteral_1= 'PNEUMATIC' )
                    // InternalHouseBuilderV2.g:2765:4: enumLiteral_1= 'PNEUMATIC'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:2772:3: (enumLiteral_2= 'ELECTRICAL' )
                    {
                    // InternalHouseBuilderV2.g:2772:3: (enumLiteral_2= 'ELECTRICAL' )
                    // InternalHouseBuilderV2.g:2773:4: enumLiteral_2= 'ELECTRICAL'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:2780:3: (enumLiteral_3= 'THERMAL' )
                    {
                    // InternalHouseBuilderV2.g:2780:3: (enumLiteral_3= 'THERMAL' )
                    // InternalHouseBuilderV2.g:2781:4: enumLiteral_3= 'THERMAL'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:2788:3: (enumLiteral_4= 'MECHANICAL' )
                    {
                    // InternalHouseBuilderV2.g:2788:3: (enumLiteral_4= 'MECHANICAL' )
                    // InternalHouseBuilderV2.g:2789:4: enumLiteral_4= 'MECHANICAL'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuatorType"


    // $ANTLR start "ruleSensorType"
    // InternalHouseBuilderV2.g:2799:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) ) ;
    public final Enumerator ruleSensorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:2805:2: ( ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) ) )
            // InternalHouseBuilderV2.g:2806:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) )
            {
            // InternalHouseBuilderV2.g:2806:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) )
            int alt54=7;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt54=1;
                }
                break;
            case 76:
                {
                alt54=2;
                }
                break;
            case 77:
                {
                alt54=3;
                }
                break;
            case 78:
                {
                alt54=4;
                }
                break;
            case 79:
                {
                alt54=5;
                }
                break;
            case 80:
                {
                alt54=6;
                }
                break;
            case 81:
                {
                alt54=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalHouseBuilderV2.g:2807:3: (enumLiteral_0= 'TEMPERATURE' )
                    {
                    // InternalHouseBuilderV2.g:2807:3: (enumLiteral_0= 'TEMPERATURE' )
                    // InternalHouseBuilderV2.g:2808:4: enumLiteral_0= 'TEMPERATURE'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:2815:3: (enumLiteral_1= 'PRESSURE' )
                    {
                    // InternalHouseBuilderV2.g:2815:3: (enumLiteral_1= 'PRESSURE' )
                    // InternalHouseBuilderV2.g:2816:4: enumLiteral_1= 'PRESSURE'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:2823:3: (enumLiteral_2= 'PROXIMITY' )
                    {
                    // InternalHouseBuilderV2.g:2823:3: (enumLiteral_2= 'PROXIMITY' )
                    // InternalHouseBuilderV2.g:2824:4: enumLiteral_2= 'PROXIMITY'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:2831:3: (enumLiteral_3= 'ACCELEROMETER' )
                    {
                    // InternalHouseBuilderV2.g:2831:3: (enumLiteral_3= 'ACCELEROMETER' )
                    // InternalHouseBuilderV2.g:2832:4: enumLiteral_3= 'ACCELEROMETER'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:2839:3: (enumLiteral_4= 'GAS' )
                    {
                    // InternalHouseBuilderV2.g:2839:3: (enumLiteral_4= 'GAS' )
                    // InternalHouseBuilderV2.g:2840:4: enumLiteral_4= 'GAS'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilderV2.g:2847:3: (enumLiteral_5= 'SMOKE' )
                    {
                    // InternalHouseBuilderV2.g:2847:3: (enumLiteral_5= 'SMOKE' )
                    // InternalHouseBuilderV2.g:2848:4: enumLiteral_5= 'SMOKE'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilderV2.g:2855:3: (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' )
                    {
                    // InternalHouseBuilderV2.g:2855:3: (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' )
                    // InternalHouseBuilderV2.g:2856:4: enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleRoomType"
    // InternalHouseBuilderV2.g:2866:1: ruleRoomType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) ) ;
    public final Enumerator ruleRoomType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:2872:2: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) ) )
            // InternalHouseBuilderV2.g:2873:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) )
            {
            // InternalHouseBuilderV2.g:2873:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) )
            int alt55=16;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt55=1;
                }
                break;
            case 83:
                {
                alt55=2;
                }
                break;
            case 84:
                {
                alt55=3;
                }
                break;
            case 85:
                {
                alt55=4;
                }
                break;
            case 86:
                {
                alt55=5;
                }
                break;
            case 87:
                {
                alt55=6;
                }
                break;
            case 88:
                {
                alt55=7;
                }
                break;
            case 89:
                {
                alt55=8;
                }
                break;
            case 90:
                {
                alt55=9;
                }
                break;
            case 91:
                {
                alt55=10;
                }
                break;
            case 92:
                {
                alt55=11;
                }
                break;
            case 93:
                {
                alt55=12;
                }
                break;
            case 94:
                {
                alt55=13;
                }
                break;
            case 95:
                {
                alt55=14;
                }
                break;
            case 96:
                {
                alt55=15;
                }
                break;
            case 97:
                {
                alt55=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalHouseBuilderV2.g:2874:3: (enumLiteral_0= 'SIMPLE' )
                    {
                    // InternalHouseBuilderV2.g:2874:3: (enumLiteral_0= 'SIMPLE' )
                    // InternalHouseBuilderV2.g:2875:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:2882:3: (enumLiteral_1= 'BATHROOM' )
                    {
                    // InternalHouseBuilderV2.g:2882:3: (enumLiteral_1= 'BATHROOM' )
                    // InternalHouseBuilderV2.g:2883:4: enumLiteral_1= 'BATHROOM'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:2890:3: (enumLiteral_2= 'LIVING_ROOM' )
                    {
                    // InternalHouseBuilderV2.g:2890:3: (enumLiteral_2= 'LIVING_ROOM' )
                    // InternalHouseBuilderV2.g:2891:4: enumLiteral_2= 'LIVING_ROOM'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:2898:3: (enumLiteral_3= 'BEDROOM' )
                    {
                    // InternalHouseBuilderV2.g:2898:3: (enumLiteral_3= 'BEDROOM' )
                    // InternalHouseBuilderV2.g:2899:4: enumLiteral_3= 'BEDROOM'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:2906:3: (enumLiteral_4= 'HALLWAY' )
                    {
                    // InternalHouseBuilderV2.g:2906:3: (enumLiteral_4= 'HALLWAY' )
                    // InternalHouseBuilderV2.g:2907:4: enumLiteral_4= 'HALLWAY'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilderV2.g:2914:3: (enumLiteral_5= 'STUDY' )
                    {
                    // InternalHouseBuilderV2.g:2914:3: (enumLiteral_5= 'STUDY' )
                    // InternalHouseBuilderV2.g:2915:4: enumLiteral_5= 'STUDY'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilderV2.g:2922:3: (enumLiteral_6= 'ENTRANCE' )
                    {
                    // InternalHouseBuilderV2.g:2922:3: (enumLiteral_6= 'ENTRANCE' )
                    // InternalHouseBuilderV2.g:2923:4: enumLiteral_6= 'ENTRANCE'
                    {
                    enumLiteral_6=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalHouseBuilderV2.g:2930:3: (enumLiteral_7= 'STORAGE_ROOM' )
                    {
                    // InternalHouseBuilderV2.g:2930:3: (enumLiteral_7= 'STORAGE_ROOM' )
                    // InternalHouseBuilderV2.g:2931:4: enumLiteral_7= 'STORAGE_ROOM'
                    {
                    enumLiteral_7=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalHouseBuilderV2.g:2938:3: (enumLiteral_8= 'GARAGE' )
                    {
                    // InternalHouseBuilderV2.g:2938:3: (enumLiteral_8= 'GARAGE' )
                    // InternalHouseBuilderV2.g:2939:4: enumLiteral_8= 'GARAGE'
                    {
                    enumLiteral_8=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalHouseBuilderV2.g:2946:3: (enumLiteral_9= 'LAUNDRY_ROOM' )
                    {
                    // InternalHouseBuilderV2.g:2946:3: (enumLiteral_9= 'LAUNDRY_ROOM' )
                    // InternalHouseBuilderV2.g:2947:4: enumLiteral_9= 'LAUNDRY_ROOM'
                    {
                    enumLiteral_9=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalHouseBuilderV2.g:2954:3: (enumLiteral_10= 'HOBBY_ROOM' )
                    {
                    // InternalHouseBuilderV2.g:2954:3: (enumLiteral_10= 'HOBBY_ROOM' )
                    // InternalHouseBuilderV2.g:2955:4: enumLiteral_10= 'HOBBY_ROOM'
                    {
                    enumLiteral_10=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalHouseBuilderV2.g:2962:3: (enumLiteral_11= 'CELLAR' )
                    {
                    // InternalHouseBuilderV2.g:2962:3: (enumLiteral_11= 'CELLAR' )
                    // InternalHouseBuilderV2.g:2963:4: enumLiteral_11= 'CELLAR'
                    {
                    enumLiteral_11=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalHouseBuilderV2.g:2970:3: (enumLiteral_12= 'LUNCHROOM' )
                    {
                    // InternalHouseBuilderV2.g:2970:3: (enumLiteral_12= 'LUNCHROOM' )
                    // InternalHouseBuilderV2.g:2971:4: enumLiteral_12= 'LUNCHROOM'
                    {
                    enumLiteral_12=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalHouseBuilderV2.g:2978:3: (enumLiteral_13= 'RUMPUS_ROOM' )
                    {
                    // InternalHouseBuilderV2.g:2978:3: (enumLiteral_13= 'RUMPUS_ROOM' )
                    // InternalHouseBuilderV2.g:2979:4: enumLiteral_13= 'RUMPUS_ROOM'
                    {
                    enumLiteral_13=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalHouseBuilderV2.g:2986:3: (enumLiteral_14= 'STAIRS' )
                    {
                    // InternalHouseBuilderV2.g:2986:3: (enumLiteral_14= 'STAIRS' )
                    // InternalHouseBuilderV2.g:2987:4: enumLiteral_14= 'STAIRS'
                    {
                    enumLiteral_14=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalHouseBuilderV2.g:2994:3: (enumLiteral_15= 'KITCHEN' )
                    {
                    // InternalHouseBuilderV2.g:2994:3: (enumLiteral_15= 'KITCHEN' )
                    // InternalHouseBuilderV2.g:2995:4: enumLiteral_15= 'KITCHEN'
                    {
                    enumLiteral_15=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoomType"


    // $ANTLR start "ruleOuterSpaceType"
    // InternalHouseBuilderV2.g:3005:1: ruleOuterSpaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) ) ;
    public final Enumerator ruleOuterSpaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:3011:2: ( ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) ) )
            // InternalHouseBuilderV2.g:3012:2: ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) )
            {
            // InternalHouseBuilderV2.g:3012:2: ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt56=1;
                }
                break;
            case 99:
                {
                alt56=2;
                }
                break;
            case 100:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalHouseBuilderV2.g:3013:3: (enumLiteral_0= 'BALCONY' )
                    {
                    // InternalHouseBuilderV2.g:3013:3: (enumLiteral_0= 'BALCONY' )
                    // InternalHouseBuilderV2.g:3014:4: enumLiteral_0= 'BALCONY'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getOuterSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOuterSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:3021:3: (enumLiteral_1= 'GARDEN' )
                    {
                    // InternalHouseBuilderV2.g:3021:3: (enumLiteral_1= 'GARDEN' )
                    // InternalHouseBuilderV2.g:3022:4: enumLiteral_1= 'GARDEN'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getOuterSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOuterSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:3029:3: (enumLiteral_2= 'TERRACE' )
                    {
                    // InternalHouseBuilderV2.g:3029:3: (enumLiteral_2= 'TERRACE' )
                    // InternalHouseBuilderV2.g:3030:4: enumLiteral_2= 'TERRACE'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getOuterSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOuterSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOuterSpaceType"


    // $ANTLR start "ruleGroundType"
    // InternalHouseBuilderV2.g:3040:1: ruleGroundType returns [Enumerator current=null] : ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) ) ;
    public final Enumerator ruleGroundType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:3046:2: ( ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) ) )
            // InternalHouseBuilderV2.g:3047:2: ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) )
            {
            // InternalHouseBuilderV2.g:3047:2: ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt57=1;
                }
                break;
            case 102:
                {
                alt57=2;
                }
                break;
            case 103:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalHouseBuilderV2.g:3048:3: (enumLiteral_0= 'ASPALTH' )
                    {
                    // InternalHouseBuilderV2.g:3048:3: (enumLiteral_0= 'ASPALTH' )
                    // InternalHouseBuilderV2.g:3049:4: enumLiteral_0= 'ASPALTH'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:3056:3: (enumLiteral_1= 'TERRAIN' )
                    {
                    // InternalHouseBuilderV2.g:3056:3: (enumLiteral_1= 'TERRAIN' )
                    // InternalHouseBuilderV2.g:3057:4: enumLiteral_1= 'TERRAIN'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:3064:3: (enumLiteral_2= 'PAVING' )
                    {
                    // InternalHouseBuilderV2.g:3064:3: (enumLiteral_2= 'PAVING' )
                    // InternalHouseBuilderV2.g:3065:4: enumLiteral_2= 'PAVING'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroundType"


    // $ANTLR start "ruleDoorType"
    // InternalHouseBuilderV2.g:3075:1: ruleDoorType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) ) ;
    public final Enumerator ruleDoorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalHouseBuilderV2.g:3081:2: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) ) )
            // InternalHouseBuilderV2.g:3082:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) )
            {
            // InternalHouseBuilderV2.g:3082:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) )
            int alt58=7;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt58=1;
                }
                break;
            case 104:
                {
                alt58=2;
                }
                break;
            case 105:
                {
                alt58=3;
                }
                break;
            case 106:
                {
                alt58=4;
                }
                break;
            case 107:
                {
                alt58=5;
                }
                break;
            case 69:
                {
                alt58=6;
                }
                break;
            case 108:
                {
                alt58=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalHouseBuilderV2.g:3083:3: (enumLiteral_0= 'SIMPLE' )
                    {
                    // InternalHouseBuilderV2.g:3083:3: (enumLiteral_0= 'SIMPLE' )
                    // InternalHouseBuilderV2.g:3084:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilderV2.g:3091:3: (enumLiteral_1= 'DOOR_WINDOW' )
                    {
                    // InternalHouseBuilderV2.g:3091:3: (enumLiteral_1= 'DOOR_WINDOW' )
                    // InternalHouseBuilderV2.g:3092:4: enumLiteral_1= 'DOOR_WINDOW'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilderV2.g:3099:3: (enumLiteral_2= 'PANIC_DOOR' )
                    {
                    // InternalHouseBuilderV2.g:3099:3: (enumLiteral_2= 'PANIC_DOOR' )
                    // InternalHouseBuilderV2.g:3100:4: enumLiteral_2= 'PANIC_DOOR'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilderV2.g:3107:3: (enumLiteral_3= 'ENTRANCE_DOOR' )
                    {
                    // InternalHouseBuilderV2.g:3107:3: (enumLiteral_3= 'ENTRANCE_DOOR' )
                    // InternalHouseBuilderV2.g:3108:4: enumLiteral_3= 'ENTRANCE_DOOR'
                    {
                    enumLiteral_3=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilderV2.g:3115:3: (enumLiteral_4= 'SLIDING_DOOR' )
                    {
                    // InternalHouseBuilderV2.g:3115:3: (enumLiteral_4= 'SLIDING_DOOR' )
                    // InternalHouseBuilderV2.g:3116:4: enumLiteral_4= 'SLIDING_DOOR'
                    {
                    enumLiteral_4=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilderV2.g:3123:3: (enumLiteral_5= 'GATE' )
                    {
                    // InternalHouseBuilderV2.g:3123:3: (enumLiteral_5= 'GATE' )
                    // InternalHouseBuilderV2.g:3124:4: enumLiteral_5= 'GATE'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilderV2.g:3131:3: (enumLiteral_6= 'EMPTY' )
                    {
                    // InternalHouseBuilderV2.g:3131:3: (enumLiteral_6= 'EMPTY' )
                    // InternalHouseBuilderV2.g:3132:4: enumLiteral_6= 'EMPTY'
                    {
                    enumLiteral_6=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x00001F0000040020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000600000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000C004000200000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008004000200000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0900041001200000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x00000003FFFC0000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800041001200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000100000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0800001001200000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800001000200000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x2004041001200000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000041001200000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000041001200000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000001001200000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000004000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x8000000000000000L});

}