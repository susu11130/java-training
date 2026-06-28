package com.example.chapter03.practice05;

public class Television {

	private int channel;
	private int volume;
	private boolean muted;

	/**
	 * コンストラクタ
	 * 
	 * @param initialChannel 初期チャンネル
	 * @param initialVolume  初期音量
	 */
	public Television(int initialChannel, int initialVolume) {
		// 初期チャンネルが範囲外（1～12）か判定
		if (initialChannel < 1) {
			this.channel = 1;
		} else if (initialChannel > 12) {
			this.channel = 12;
		} else {
			this.channel = initialChannel;
		}
		// 初期ボリュームが範囲外（0～100）か判定
		if (initialVolume < 0) {
			this.volume = 0;
		} else if (initialVolume > 100) {
			this.volume = 100;
		} else {
			this.volume = initialVolume;
		}

		this.unmute();
	}

	/**
	 * チャンネルをセット
	 * 
	 * @param number
	 */
	public void setChannel(int number) {
		// number が 1〜12 のときだけ channel を更新。範囲外は何もしない。
		if (number >= 1 && number <= 12) {
			this.channel = number;
		}
	}

	/**
	 * 仕様：volume に delta を加算し、結果を 0〜100 に収める。範囲内であればそのまま代入する
	 * 
	 * @param delta
	 */
	public void setVolume(int delta) {
		// 0 未満は 0を代入
		if (this.volume + delta < 0) {
			this.volume = 0;
			return;
		}
		// 100 超えは 100を代入
		if (this.volume + delta > 100) {
			this.volume = 100;
			return;
		}
		this.volume += delta;
	}

	/**
	 * muted を true にする。
	 */
	public void mute() {
		this.muted = true;
	}

	/**
	 * muted を false にする。
	 */
	public void unmute() {
		this.muted = false;
	}

	/**
	 * 「チャンネル: X / 音量: Y% / ミュート: ON|OFF」を返す。
	 * 
	 * @return 結果文字列
	 */
	public String label() {
		// muted が true なら ON、false なら OFF をセット
		String mutedStr = this.muted ? "ON" : "OFF";

		return "チャンネル：　" + this.channel + " / 音量：　" + this.volume + "%　/　ミュート：　" + mutedStr;
	}
}
