package fywzqx.inst.sy7;

import java.io.Serializable;

/*
 * ͷ�ļ�1
 */

public class P_SY7_Head1  implements Serializable
{
	private static final long serialVersionUID = 1L;
	public static final String strFileVerFinaL = "V1.0.01207";
	public String strXieYi;	//	Э��汾	String	3
	public byte byDataType;	//	���ݰ�����	Byte	1
	public String strInst;		//	�����ǵı��	String	24
	public String strLiuShui;	//	��ˮ��	String	24
	public String strPile;		//	��׮���	String	16
	public String strProfile;	//	�����б�	String	40     �����б��Զ��ŷָ���  ���磺1-2,1-3��2-3��ͬһ��ʵ��ͬһ��׮��ʵ�飬������������ϴ��������Ҫ����һ����־����������ˮ�š��豸�š�׮���⻹������һ���ֶΣ�ȥ���ַ����ϴ���������ݡ�
	public byte bySendContent;	//	���������	Byte	1   0��ԭʼ����;10���������� 120
	public byte byTestMethod;	//	ʵ�鷽��	Byte	1    0����׮����ѹ, ��׮���򿹰�, ��ʯê�˿���, ��ƽ��, ���ϵػ�, ǳ��ƽ��, ���ƽ��, ԭλ����_����, ԭλ����_�һ�, �һ�����,10��H0,H1,H2,H3,H4,H5,H6,H7,H8,H9,20��ƽ��,:21���Ȳ�, 22��б��,W3,W4,W5,W6,W7,W8,W9
	public byte byID;			//	ͷ�����	Byte	1
	public byte byTestGuiFan;	//	���Թ淶	Byte	1 1��DGJ08�C-2003��2��JGJ106-2003��3��JTG/TF81-01-2004��5��SJG09-2007��6��TB10218-2008��7��CECS21:2000��8��DBJ15-60-2008
	public String strDateFile;	//	�ļ�����ʱ��	time	8 �ļ�����ʱ��ϵͳʱ��
	public String strDateTest;	//	��������	time	8 ����������ļ���
	public String strDateJiaoZhu;	//	��������	time	8
	public String strFileName;	//	�ļ���	String	60
	public float fPileD;		//	׮��	float	4
	public float fPileLen;		//	׮��	float	4
	public float fMove;			//	�ƾ�	Float	4
	public int iPileNum;		//	����	int	4
	public int iProfileNum;		//	������	int	4
	public float fRate;			//	����Ƶ��	float	4
	public int iSampleLen;		//	��������	int	4
	public float fGPSX;			//	����	Float	4
	public float fGPSY;			//	γ��	Float	4
	public byte byWaveEnhance;	//	�ײ���ǿ	Byte	1
	public byte bySoftFilt;		//	����ǲ�	Byte	1
	public float fV;			//	����ܲ����ٶ�	float	4
	public float fPipeOutD;		//	������⾶	float	4
	public float fPipeInD;		//	������ھ�	float	4
	public float fSenseOutD;	//	̽ͷ�⾶	float	4
	public int iAngle;			//	��λ��	int	4
	public float fWheelD;		//	�־�	float	4
	public float fLineD;		//	�߾�	float	4

	public String strFileVer;	//�ļ��汾�ţ����ڶ�ȡʱ��У��
	public P_SY7_Head1()
	{
		SetDefault();
	}
	
	public void SetDefault()
	{
		strXieYi = "002";	//	Э��汾	String	3
		byDataType = 0x0B;	//	���ݰ�����	Byte	1
		strInst = "";		//	�����ǵı��	String	24
		strLiuShui = "";	//	��ˮ��	String	24
		strPile = "";		//	��׮���	String	16
		strProfile = "";	//	�����б�	String	40
		bySendContent = 0;	//	���������	Byte	1
		byTestMethod = 20;	//	ʵ�鷽��	Byte	1
		byID = 1;			//	ͷ�����	Byte	1
		byTestGuiFan = 1;;	//	���Թ淶	Byte	1
		strDateFile = "2017-08-28 18:38:58";	//	�ļ�����ʱ��	time	8
		strDateTest = "2017-08-28 08:28:48";	//	��������	time	8
		strDateJiaoZhu = "2017-08-28 18:28:38";	//	��������	time	8
		strFileName = "";	//	�ļ���	String	60
		fPileD = 20;		//	׮��	float	4  (mm)
		fPileLen = 40;		//	׮��	float	4 (m)
		fMove = 0.1f;		//	�ƾ�	Float	4 ��m)
		iPileNum = 4;		//	����	int	4
		iProfileNum = 3;	//	������	int	4
		fRate = 1.0f;		//	����Ƶ��	float	4
		iSampleLen = 512;		//	��������	int	4
		fGPSX = 0.0f;		//	����	Float	4
		fGPSY = 0.0f;		//	γ��	Float	4
		byWaveEnhance = 0;	//	�ײ���ǿ	Byte	1
		bySoftFilt = 1;	//	����ǲ�	Byte	1
		fV = 1.0f;			//	����ܲ����ٶ�	float	4
		fPipeOutD = 1.0f;	//	������⾶	float	4
		fPipeInD = 1.0f;		//	������ھ�	float	4
		fSenseOutD = 1.0f;	//	̽ͷ�⾶	float	4
		iAngle = 0;			//	��λ��	int	4
		fWheelD = 1.0f;		//	�־�	float	4
		fLineD = 1.0f;		//	�߾�	float	4
		strFileVer = strFileVerFinaL;
	}


}
