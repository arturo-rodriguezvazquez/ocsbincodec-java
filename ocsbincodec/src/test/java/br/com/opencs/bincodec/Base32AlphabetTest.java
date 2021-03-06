/*
 * Copyright (c) 2015, Open Communications Security
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * 
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * 
 * * Neither the name of ocsbincodec-java nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package br.com.opencs.bincodec;

import static org.junit.Assert.*;

import org.junit.Test;

public class Base32AlphabetTest extends BaseAlphabetTest {

	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567";
	private static final String ALPHABET_LC = ALPHABET.toLowerCase();

	@Test
	public void testBase32Alphabet() {
		Base32Alphabet a;
		
		a = new Base32Alphabet();
		assertArrayEquals(ALPHABET.toCharArray(), a.alphabet);
	}

	@Test
	public void testBase32AlphabetBoolean() {
		Base32Alphabet a;
		
		a = new Base32Alphabet();
		assertArrayEquals(ALPHABET.toCharArray(), a.alphabet);
		
		a = new Base32Alphabet(false);
		assertArrayEquals(ALPHABET.toCharArray(), a.alphabet);
		
		a = new Base32Alphabet(true);
		assertArrayEquals(ALPHABET_LC.toCharArray(), a.alphabet);
	}
	
	@Test
	public void testSize(){
		Base32Alphabet a;
		
		a = new Base32Alphabet();
		assertEquals(ALPHABET.length(), a.size());
		
		a = new Base32Alphabet(false);
		assertEquals(ALPHABET.length(), a.size());

		a = new Base32Alphabet(true);
		assertEquals(ALPHABET_LC.length(), a.size());
	}
	
	@Test
	public void testGetCharacter(){
		Base32Alphabet a;
		
		a = new Base32Alphabet();
		testGetCharacterCore(a, ALPHABET);

		a = new Base32Alphabet(false);
		testGetCharacterCore(a, ALPHABET);
		
		a = new Base32Alphabet(true);
		testGetCharacterCore(a, ALPHABET_LC);
	}
	
	@Test
	public void testGetValue() {
		Base32Alphabet a;
		
		a = new Base32Alphabet();
		testGetValueCoreCaseInsensitive(a, ALPHABET);

		a = new Base32Alphabet(false);
		testGetValueCoreCaseInsensitive(a, ALPHABET);

		a = new Base32Alphabet(true);
		testGetValueCoreCaseInsensitive(a, ALPHABET);
	}
}
